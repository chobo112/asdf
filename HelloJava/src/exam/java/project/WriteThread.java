package exam.java.project;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
//이거는 출력용클라이언트용 스레드임
//입력용 출력용 스레드를 분리했으면 이제 얘네가 클라이언트에 들어가는데
//클라이언트에 들어갔을 경우엔 클라이언트가 보내는 메시지 부분들을 없애야 하는지가 의문
//그냥 스레드를 호출하면 바로 여기 메세지들을 출력할 수 있는것이기 떄문에 
//클라이언트들의 서버에 과연 얘네가 어떻게 들어가야 하는지가 의문임.
public class WriteThread extends Thread{
   private String userName;
   private final Socket socket;
//   private final PrintWriter writer;/*000000000000000000*/
   
//   public WriteThread(Socket socket) throws IOException/*000000000000*/{
//     this.socket = socket;
      
//     this.writer = new PrintWriter(socket.getOutputStream(), true);
//  }  WriteThread는 그저 네트워크상으로 출력만 해줘야하는것을 구현해야하고 입력하는것들은 
//보내주는 클래스에서 적어줘야할듯합니다.   
   BufferedWriter bw = null;
   String userInput = null;
   
   public WriteThread(Socket socket) {
	   this.socket = socket;
	   try {
           bw = new BufferedWriter(
                   new OutputStreamWriter(
                           socket.getOutputStream()));
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   
   public void setUserName(String userName) {
	   this.userName = userName;
   }
   
   //네트워크로 보내기위한 메서드?    
   public void sendMessage(String message) {
       try {
    	   System.out.println("Sending message: " + message);
           bw.write(userName+message + "\n");
           bw.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   
   @Override
   public void run() {   
	   try {
	   bw = new BufferedWriter(
			   new OutputStreamWriter(
					   socket.getOutputStream()));
	   //이제 외부로다가 출력할수 있어짐
	   }catch (IOException ioe) {
		   ioe.printStackTrace();
	   }
	   
	   
	   
//@@@@@@@@@@@@@@@@전부다 필요없고 그냥 네트워크로 출력
	   //만 하게 할수 있도록 로직을 짜면 된다.!!!!!!!!@@@@@@@@@@	   
	   
	   
      /*try {
    	  //이거는 내rk 화면에 출력하는거임(socket에 있는것들을?
    	  //소켓을 통해 데이터를 받을 수 있는 입력 스트림을 제공합니다. 
    	  //이러한 스트림을 통해 데이터를 주고받아 네트워크 통신을 구현합니다.
    	  //내가 입력한것을 출력하자
      !@!@!@!@!@!Scanner sc = new Scanner(System.in);
      
      while(true) {
         String Message = sc.nextLine();
         //위에가 사용자가 입력한 메세지를 콘솔에 가져오는 역할
         writer.println(Message);
         //내가 입력한 메세지를 printWriter를 통해서 네트워크로 출력함
         //pw.flush();
         if("종료".equals(Message)) break;
         //종료라는 메세지를 쓰면 나가나? 받을때 나가나의 문제
         System.out.println(Message);
      	}//while문
      
      }finally {
    	  //try
      }*/
   }//run
   

}//class
