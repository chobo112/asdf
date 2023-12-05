package exam.java.projectreal;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;



public class ClientA {
 
 final static String SERVER_IP = "172.30.1.83";
  final static int SERVER_PORT = 17706;
  private Socket socket = null;

  public static void main(String[] args) {
    ClientA client = new ClientA();
    client.chatStart();
}//메인
 static WriteThread wt = null;
 public void chatStart() {
    Scanner scanner = null;
    
    try {
       //서버와의 연결요청
       socket = new Socket(SERVER_IP, SERVER_PORT);
       System.out.println("서버와 연결이 되었습니다.");

       String clientname = "user"+(int) (Math.random()*100);
       
  
       scanner = new Scanner(System.in);
       //writeThread에 clientname이 없으면 소켓을 뚫리면서 클라이언트가 이름을 가질수가 없어짐..
       wt = new WriteThread(socket, clientname, scanner);
       wt.start();
       wt.sendClientNameToServer(clientname);
       //서버쪽에서 클라이언트 이름을 쓰고 싶은데 이 메서드를 이제 만들거임
       
       ReadThread rt = new ReadThread(socket, clientname);
       rt.start();
       
    } catch (IOException ioe) {
       
       System.out.println("[서버와 접속이 끊겼습니다]");
    
    } finally {
       
       wt.interrupt();

    }
 }//chatstart 메서드
 
}//클래스

