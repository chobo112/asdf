package exam.java.projectreal;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread{
 private String clientName;
 private Socket socket;
private Scanner scanner;

public WriteThread() {//기본생성자.
}

 public WriteThread(Socket socket, String clientName, Scanner scanner) {
       this.socket = socket;
       this.clientName = clientName;
    //생성자 소켓과 clientName을 준거임
       this.scanner = scanner;
 }
 
 @Override
 public void run() {
    
    try {
       BufferedWriter bw = new BufferedWriter(
             new OutputStreamWriter(
             socket.getOutputStream()));//네트워크에 전송되는 byte에 글자열담기
       
       while(true) {
          System.out.println("[" + clientName + "메세지를 입력해주세요 ] : ");
          String userInput = scanner.nextLine();//메세지 입력값 보내기
          System.out.println("[" + clientName +"] : " + userInput);
          
           bw.write("["+clientName+"]"+userInput+"\n");//서로 누가쓰는지 보려고
           bw.flush();
           
           if("종료".equals(userInput)) {
              System.out.println("채팅을 종료합니다.");
              bw.write("종료\n");
              bw.flush();
              return;/*왜 break가 아니고 return을 쓴거지?/*/
           }//if문
           
       }//무한루프
       
    }catch (IOException e) {
       e.printStackTrace();
    }finally {
       try {
          
          
          
       socket.close();
       } catch (IOException e) {
          e.printStackTrace();
       }
    }
 
 }//run
 
 //서버로 클라이언트의 이름을 보내주기 위한 로직
 public void sendClientNameToServer(String clientname) {
    
     try {
    //일단 똑같이 네트워크로 문자열을 보내줘야한다.
    BufferedWriter namewrite = new BufferedWriter(
          new OutputStreamWriter(socket.getOutputStream()));
          //소켓을 통해서 정보가 넘어가니까
    namewrite.write(clientname+"\n");
    //"\n"이거 버퍼트로 내보낼때 안주면 가끔 인식못함 read하는쪽에서
    namewrite.flush();
     } catch (IOException e) {//socket.getOutputStream의 예외처리
        e.printStackTrace();
        
     }
 }
 
 
}
