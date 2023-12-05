package edu.java.net;
//요구사항 클라이언트가 서버에 접속하면 매 10초마다 서버에서 클라이언트에게 퀴즈를 낸다 =>sleep?
//클라이언트가 10초안에 서버에 답문자를 보낸다.
//서버는 총 10번의 퀴즈를 내면 최종적으로 정답회수를 출력해준다.
//출력 예]
//서버 : 퀴즈프로그램을 시작합니다.
//퀴즈1: 세상에서 가장 슬픈 채소는?               서버
//클라이언트 답 : [입력]  정답은 우엉            클라이언트
//(이것도몰라)                                        서버


//퀴즈2: 햄버거의 색깔은 ?           서버
//클아이언트 답: [버건디]            클라이언트
//(정답입니다)                          서버
//
//이렇게 10개가 출력되고
//10문제중 7문제 정답입니다.        서버
//
//

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class QuizTCPServer {
	final static int SEVER_PORT = 7892;
	final static String MESSAGE_FROM_ClIENT = "하이";
	public static void main(String[] args) {
		
		//여기서는 스레드의 실행만 하는 부분임.
		ServerSocket serverSocket = null;
		OutputStream os = null;
		InputStream is = null;
		QuizThread ot = null;
		
		try {
		serverSocket = new ServerSocket(SEVER_PORT);//소켓매니저인 서버소켓그자체
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	
		
		while(true) {
			try {
			Socket socket = serverSocket.accept();//서버와 클라이언트 연결시키는 서버(가 가지고있는)소켓
			//서버소켓이  클라이언트의 연결을 기다리다가 클라이언트가 연결요청시 그에맞는 소켓 생성 및 연결
			QuizThread quizThread = new QuizThread(socket);//퀴즈스레드에 만든 생성자로 소켓객체생성
			
			QuizList quzzList = new QuizList();
			System.out.println(quzzList);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(new QuizList().quizListMethod());
			System.out.println(oos);
			
			is =socket.getInputStream();
			os = socket.getOutputStream();
			os.write( MESSAGE_FROM_ClIENT.getBytes());
            os.flush();
            //여기까지는 내가 보내는거 클라이언트로
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
		}
		
		
	}//메인
	
	
	
	
}//클래스