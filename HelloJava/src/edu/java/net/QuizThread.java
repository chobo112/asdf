package edu.java.net;

import java.net.Socket;
//구현은 스레드에서만 하면 됩니다.
public class QuizThread extends Thread{
	private Socket socket;
	
	//서버 소켓을 넣을거니까 서버당 소켓이 스레드 1개
	public QuizThread(Socket socket) {
		this.socket = socket;
	}
	//이렇게 하면 스레드의 소켓이 QuizServer의 스레드를 사용할수 있게 되는느낌
	
	
	@Override
	public void run() {
	
	}
	

}
