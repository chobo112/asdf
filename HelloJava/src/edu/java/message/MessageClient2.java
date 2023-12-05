package edu.java.message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//클라이언트는 IP                      //객체로 만들어서 보내야함(Objectoutput or ObjectInputStream
public class MessageClient2 {//소켓만들어서 message객체를 생성해서 보냄 - 직렬화
	
	final static String SERVER_IP = "172.30.1.83"; //이건 서버의 IP임
	//내가 보낼 서버의 주소가 필요하고 밑에는 포트번호가 서로 같아야지 연결이 됩니다.
	//final static int SERVER_PORT = 7692;
	
	public static void main(String[] args) {
		Socket socket = null;
		ObjectOutputStream oos = null;
		
		
		try {
		socket = new Socket(SERVER_IP,7692);
		oos = new ObjectOutputStream(socket.getOutputStream());
		oos.writeObject(new Message2("실습", "내용", new Date()));
		//내가 보낼 메세지가 이거임. new Message도 익명객체로다가 1회용으로만 보낸다는거
		
		//이제 실습2로 리스트로 해서 메세지를 보내봅시다.
		List<Message2> msgs = new ArrayList<Message2>();
		msgs.add(new Message2("실습1", "내용1", new Date()));
		msgs.add(new Message2("실습2", "내용2", new Date()));
		msgs.add(new Message2("실습3", "내용3", new Date()));
		msgs.add(new Message2("실습4", "내용4", new Date()));
		msgs.add(new Message2("실습5", "내용5", new Date()));
		msgs.add(new Message2("실습6", "내용6", new Date()));
		
		oos.writeObject(msgs);//list에 담은 메세지들
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			
		}try {
			oos.close();
			socket.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
}
