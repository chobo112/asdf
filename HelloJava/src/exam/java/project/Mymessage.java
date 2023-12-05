package exam.java.project;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
//이게 진짜로 내가 보내는 메시지고 / 클라이언트는 천천히 만들어보며 비교해서 여기서 나눠서 한거
public class Mymessage {
   final static String SERVER_IP = "172.30.1.83";
    final static int SERVER_PORT = 17747;
    static Scanner sc = null;
    
 //?????느끼는건데 이거 메시지를 보내던 읽던 뭔가 담은 그릇이 없는듯...   
   public static void main(String[] args) {
      try {
      Socket socket = new Socket(SERVER_IP, SERVER_PORT);
     System.out.println("서버와 연결되었습니다.");
     
     sc = new Scanner(System.in);
     String userName = sc.nextLine();
     
     //위와 같은 방법으로 WriteThread를 실행하자 - 입력할 스캐너는 스레드에 있음
      WriteThread writeThread = new WriteThread(socket);
      writeThread.setUserName("나");
      new Thread(writeThread).start();
      
      //이제 내가 만든 스레드를 통해
      //서 대화할수있또록 =>주고 받아야하니까 Write랑 Read전부필요
      ReadThread readThread = new ReadThread(socket);
      //내가 생성자에 만들어넣음(소켓을 아예 스레드에 박아버림)
      new Thread(readThread).start();
      //스레드를 생성할거고 내가 만든 스레드를 넣을거고 그걸 시작하자
      
      //여태까지는 내가 WriteThread//ReadThread에 전부 때려박은 느낌임
      //스레드의 용도는 네트워크 IO의 용도만함
      
      
      while(true) {
    	  String myMessage = sc.nextLine();
    	  writeThread.sendMessage(myMessage);
      }
      
//      while("quit".equals(writeThread) != false) {
//    	  System.out.println("[채팅을 종료합니다]");
//    	  socket.close();//소켓을 닫을때는 내가 quit이라는 메세지를 쓰면 닫도록해보자
//      }
      
      } catch(IOException ioe) {
         ioe.printStackTrace();
      }
      
      
   }
   
    
    
   

}
