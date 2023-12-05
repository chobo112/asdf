package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
//네트워크에는 바이트로 돌아다님 그래서 변환스트림으로 글자로 받아야됨
public class QuizTCPClient {
	
	final static String SERVER_IP = "172.30.1.83";
	final static int SERVER_PORT = 7892;
	final static String MESSAGE_FROM_CLIENT="퀴즈를 시작합니다.";
	
	public static void main(String[] args) {
	Socket socket = null;
	OutputStream os = null;
	InputStream is = null;
	try {
	socket = new Socket(SERVER_IP, SERVER_PORT);//소켓만들기
	
	
	os = socket.getOutputStream();
	is = socket.getInputStream();
	
	
//	여기서부터 sysoutquiz까지가 오브젝트로 받는느낌
//	ObjectInputStream ois = new ObjectInputStream(is);
//	try {
//	List<Quiz> receivedQuizList = (List<Quiz>) ois.readObject();
//	}catch (ClassNotFoundException cne) {
//		cne.printStackTrace();
//	}
//    // 받은 데이터 확인 (실제 로직에 따라 수정이 필요함)
//    System.out.println("Received Quiz List:");
//	for (Quiz quiz : receivedQuizList) {
//        System.out.println(quiz);
//    여기까지가 오브젝트스트림으로 복붙한부분
	
	os.write(MESSAGE_FROM_CLIENT.getBytes());
	os.flush();
	
	byte[] data = new byte[1024];
	int n = is.read(data);
	final String messageFromServer = new String(data, 0, n);
	System.out.println(messageFromServer);
	
	} catch (UnknownHostException ue) {
		ue.printStackTrace();
	}catch (IOException ioe) {
		ioe.printStackTrace();
	}
	
	}//메인

}
