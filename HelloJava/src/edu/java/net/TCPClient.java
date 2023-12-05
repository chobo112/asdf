package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.rmi.UnknownHostException;

//내가 뭔가를 보낼사람임
public class TCPClient { //!!!서버만 서버소켓이 있는거고 클라이언트는 소켓만!!!!
	//IP와 server2가지를 가지고 있어야 합니다.
	//접속할 서버의 Ip와 접속할 서버의 Port
	final static String TCPSERVER_IP = "172.30.1.83";//보낼사람의 IP
	//final static String TCPSERVER_IP = "172.30.1.83";
	//보내고싶은 TCPSERVER_IP와 PORT를 강사님거로 바꾸면 강사님 서버로 가게됨
	//	final static int TCPSERVER_PORT = 9898;
	final static int TCPSERVER_PORT = 8888; //보낼사람의 포트번호
	final static String MESSAGE_FROM_CLI
	ENT = "Hi server!";
	//서버가 클라이언트에게 보내는 메세지
	public static void main(String[] args) {
		Socket socket = null;//클라이언트 소켓
		//크라이언트는 !!! 소켓만 가지고 있어요
		OutputStream os = null;
		//클라이언트가 보내는 (서버에) 바이트스트림
		InputStream is = null;//서버에서 받을 바이트 스트림
		try {
			socket = new Socket(TCPSERVER_IP, TCPSERVER_PORT);//IP와 PORT2개가 필요함
					//소켓은 아이피와 서버 2가지가 필요함
			System.out.println("socket 연결");
			
			os = socket.getOutputStream();//소켓에서 받아온다.
			is = socket.getInputStream();
			
			//서버에게 메세지를 전송하자
			os.write(MESSAGE_FROM_CLIENT.getBytes());//문자열의 배열을 가져온다
			os.flush();//버퍼드는 필요가 없고 그냥 아웃풋은 flush를 써줌
			
			//서버가 보낸 바이트스트림을 저장할 버퍼역할
			byte[] data = new byte[16];
			int n = is.read(data);
			
			final String messageFromServer = new String(data, 0, n);
			System.out.println(messageFromServer);
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
			//is, os를 닫아주는데 Exception이 발생하니까 try catch해준거임	
			is.close();
			os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}//main
	
	
}//class
