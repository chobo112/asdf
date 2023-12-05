package exam.java.projectreal;
//서버용 스레드가 있는이유는 ??

//동시작업을 해야함.. 내가 받고 그 받은 자료를 다른 서버에 보내주고
//소켓통신이기때문에 주고받고의 많은 작업들을 하니까

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ChatThread extends Thread {

   private Socket clientSocket;
   //WriteThread -> ClientA -> 서버스레드로 받아오는 이름
   private String clientname;
   
   private static Set<ChatThread> clients; // ChatServer입장에서의 클라이언트들 관리
   // 제네릭 타입이 ChatThread를 준 이유는 ChatThread에서 클라이언트들의 Socket을 관리하니까
   private static List<String> allMessage = new ArrayList<>();//서버에 클라이언트메세지 표시

   private BufferedWriter bw = null;
   private BufferedReader br = null;
   public ChatThread(Socket clientSocket, Set<ChatThread> clients) {
      this.clientSocket = clientSocket;
      this.clients = clients;
      
   }
   
   //클라이언트 이름 서버쪽에서 받는로직
   private void receiveClientname() {
      try {
      BufferedReader readclientname = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream()));
      clientname = readclientname.readLine();
      /*이름을 어디서 받아올까용*/
      broadcast("[" + clientSocket.getPort() + "]님이 입장하셨습니다. (닉네임: "+   clientname+")");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   @Override
   public void run() {
      receiveClientname();
      try {
         // 서버쪽에서도 스트림을 받고 주고 할 준비가 끝남
         bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
         br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

         sendwelcomeMsg();// 클라이언트들 접속시 환영인사

         String clientMessages;
         while ((clientMessages = br.readLine()) != null) {
            String msg = clientMessages;
            System.out.println("클라이언트들 메세지 :" + msg);
            broadcast(msg);
            bw.flush();
         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         clients.remove(this);
         broadcast("[" + clientSocket.getPort() + "]님이 나가셨습니다. (닉네임 : "+clientname+")" );
         try {
            clientSocket.close();

         } catch (IOException e) {
            e.printStackTrace();
         }

      }

   }// run
   
   // 나를 제외한 모든클라이언트들의 메세지들을 전달하는 메서드
   private void broadcast(String fromallClientMsg) {
      allMessage.add(fromallClientMsg);
      for (ChatThread client : clients) {

         if (client != this) {
            try {
               client.bw.write(fromallClientMsg + "\n");
               client.bw.flush();

            } catch (IOException e) {
               e.printStackTrace();
            }
         }

      }
   }// broadcast메서드 전부에게 전달하는 메서드임

   public void sendwelcomeMsg() {/**/
      try {
         bw.write("[채팅에 들어온것을 환영합니다]" + "\n");
         bw.flush();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}