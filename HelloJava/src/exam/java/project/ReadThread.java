package exam.java.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;
//이게 readThread는 클라이언트용 스레드임
//소켓에서 출력용 스레드 의문인점이 과연 소켓을 만들어야 하는가에 대한 부분
public class ReadThread extends Thread{
   //이렇게 상수로 소켓을 변하지 않는 변수로 설정을 하면 이제 계속해서 같은 소켓이지 않을까
   private final Socket socket;
   BufferedReader br = null;
   
   public ReadThread(Socket socket) {
      this.socket = socket;
   }//이렇게 생성자를 만들어야지 스레드를 호출할때 스레드가담긴 소켓 호출함
   
   @Override
   public void run() {
      
      try {//Writer스레드를 호출시키면 이것들을 작동을 할건데
         //일단은 소켓에 담겨있는 스트림들을 읽을수 있는 준비는 여기서 끝난거.
    	  br = new BufferedReader(
            new InputStreamReader(
            		socket.getInputStream()));
        String receiveMessage;
         //List<>,, 담아서 넘기나 그냥 넘기나 읽긴 읽어야 하는것 같은데
         
         while((receiveMessage = br.readLine()) != null) {
             //여기서 받은 메시지에 서버에서 읽어들여운것들을 1줄씩 넣을거고 
        	 //그게 널이 아닐때까지 메시지를 읽어내겠다.            
        	 System.out.println(receiveMessage);
        	 //server.broadcastMessage(receiveMessage);
         }
      
      
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
      
   }

}
