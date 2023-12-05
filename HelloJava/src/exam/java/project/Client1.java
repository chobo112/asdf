package exam.java.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
//IO에 관한건 스레드처리를 해야지만 소켓이 열리면서도 계속작업이 가능하니까 
//서버와 서버이용자 일단 내가만든 클래스3가지에는 전부 스레드로 입출력에 관한게
//들어가야 할듯함.
public class Client1 {
	//서버와 연결하려면 서버의 아이피와 서버포트가 필요함
	final static String SERVER_IP = "172.30.1.83";
	final static int SERVER_PORT = 7137;
	
	public static void main(String[] args) {
		
		//Writer w = null;
		//Reader r = null;
		//텍스트만 주고받자 다른건 모르겟다
		Socket socket = null;
		BufferedWriter writer = null;
		BufferedReader reader = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			System.out.println("소켓받아라");
			
			writer = new BufferedWriter(
					new OutputStreamWriter(
							socket.getOutputStream(), "UTF-8"));
			
			//채팅을 치기위한 방법
			while (true) {
			String message = sc.nextLine();
			
            // 이제 writer를 사용하여 서버에 메시지를 보낼 수 있습니다.
            writer.write(message);
			writer.newLine();//한줄 띄우기
			writer.flush();
			//서버에서 응답 받기
			String response = reader.readLine();
			System.out.println("서버응답 " + response);
			}
            
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	

}
