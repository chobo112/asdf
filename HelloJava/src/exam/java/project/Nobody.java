package exam.java.project;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

//서버를 통해서 메세제리르 전달받을 누군가 아무나 상관없음
public class Nobody {
 //채팅을 할 상대방을 가정해봅시당
	final static String SERVER_IP = "172.30.1.83";
	final static int SERVER_PORT = 17747;
	Scanner sc = null;
	
	//동일한 포트를 사용하고 IP도 같아야지 같은 네트워크를 통과함
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(SERVER_IP, SERVER_PORT);
			//소켓 만들기
			Scanner sc = new Scanner(System.in);//너가 입력해라 씨발년아
			
			WriteThread writeThread = new WriteThread(socket);
		    writeThread.setUserName("누군가");
		    new Thread(writeThread).start();
			
			//교신을 위해 만든 입출력 스레드를 여기에 넣는작업
			ReadThread readThread = new ReadThread(socket);
			//여기 소켓을 넣은 이유는 소켓을 만들때마다 실행
			new Thread(readThread).start(); 
			//헷갈리니까 누군지 알고자 입력출력시에 스레드에 이름붙이기
			//이건 스레드에 이름준거 뻘짓한거.
			//Thread nobodyThread = new Thread(rt);//내가만든 스레드클래스를 넣기
			//WriteThread writeThread = new WriteThread(socket);
			sc= new Scanner(System.in);
			
			//이제 여기다가 출력할때 이름을 구분짓는 작업을 할꺼야.
			//내가볼때는 여기다가 이름을 Thread에 이름을 붙여준다는 개념일지
			//고민1 WrtierThreadsk나 ReadThread에 이름을 주자고 생각함. - 이거는 안됨
			//이유는 그러면 그 스레드를 가져다쓰는애들이 공통적인 이름을 가지니까 구분이 안됨
			
			//Thread여기부분이다 이제
			//Thread.sleep(1000);//스레드가 섞이지 않도록 대기??
			//입력을 위한 스케너는 만들었음.. 이거를 스레드를 통해서 보야내야 하는데...
			 while(true) {
		    	  String myMessage = sc.nextLine();
		    	  writeThread.sendMessage(myMessage);
		      }
		      
			
			//while("빠이".equals(writeThread)) {
			//socket.close();
			//}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}
	
 

}
