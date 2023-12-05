package exam.java.projectreal;
//소켓서버임 // 여기서 서버는 서버소켓과 소켓(서버의 소켓이 필요함)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChatServer {
   final static String SERVER_IP = "172.30.1.83";
   final static int SERVER_PORT = 17706;
   static ServerSocket ss = null;
   static Socket socket = null;
   static String clientName = null;
   static Scanner scanner = null;
   static ChatThread chatThread = null;

   // Set<ChatThread> 여기의 역할은 서버가 열리면서 들어오는 클라이언트들의 관리
   private static Set<ChatThread> clients = new HashSet<>();
   // @@@@@@@@서버도 소켓 닫는부분은 아직 구현 없음@@@@@@
   public static void main(String[] args) {
      
      new Thread(() -> {// 이거는 절대모르죵 + 일단 스레드로 서버종료메세지를 주면 종료되는곳
         BufferedReader serverConsole = new BufferedReader(new InputStreamReader(System.in));
         try {
            while (true) {
               // 이제 스트림을 읽어온것을 담을 문자열이 필요함 => 즉 serverConsole을 담아줘야함
               String serverconsoleInput = serverConsole.readLine();
               
               if (serverconsoleInput.equals("수고링")) {
                  System.out.println("서버를 종료합니다.");
                  System.exit(0);
               } else {
                  System.out.println("실행 할 수 없는 명령어입니다.");

               }
            } // while문

         } catch (IOException e) {
            e.printStackTrace();
         }

      }).start();//new Thread(( .->익명객체스레드?

      try {
         ss = new ServerSocket(SERVER_PORT);

         while (true) {// 서버소켓은 계속 받아야니까 무한루프
            socket = ss.accept(); // 블로킹 메서드..클라이언트소켓을 기다리는역할
            System.out.println("클라이언트가 접속하였습니다.");
            /* set에 담은 clients */
            chatThread = new ChatThread(socket, clients);
            // 여기서버의 Thread의 경우에는 클라이언트와 다르니까 서버스레드만 써주면됨
            chatThread.start();
            clients.add(chatThread);// 서버에 연결된 클라이언트들을 set에 담아둔거
            // 그리고 거에다가 chatThread를 추가한거. => 소켓과 Set으로 관리를 하기 위함


         }

      } catch (IOException ioe) {
         ioe.printStackTrace();
      }finally {
         chatThread.interrupt();
      }

   }// finally에다가 소캣 없을때 닫기 구현해야함

}

