package edu.java.message;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
//clientGUI의 서버임
public class AdderServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		OutputStreamWriter osw = null;
		try {
			ss= new ServerSocket(6875);
			if(ss!=null)System.out.println("AdderServer준비완료!");
			socket = ss.accept();
			System.out.println(socket.getInetAddress()+"님 접속");
			//여기서부터는 스레드?
			osw = new OutputStreamWriter(socket.getOutputStream());
			while(true) {
				int writeNum = (int)(Math.random()*9)+1;
				System.out.println("서버에서 보낸 수 : "+writeNum);
				if(osw!=null) {
					osw.write(writeNum);
					osw.flush();
				}
				try {
				Thread.sleep(5000);
				}catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
		
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
