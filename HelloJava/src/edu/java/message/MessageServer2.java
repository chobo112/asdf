package edu.java.message;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.List;

public class MessageServer2 {//객체를 받아들이고..-역직렬화
	final static int SERVER_PORT = 7692;
	
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		Socket socket = null;
		ServerSocket ss = null;
		
		//실습3번 C:java_logs/log_20231121.txt로 저장하자 => 다시 출력해야하니까 여기선 Out이겠따
		//FileOutputStream fos = null;
		FileWriter fw = null;
		
		try {
		/*(ServerSoket)*/ss = new ServerSocket(7692);//여기도 소켓을 통일
		socket = ss.accept();
		ois = new ObjectInputStream(socket.getInputStream());
		//이게 소켓에서 얻어온 인풋스티림을 객체용(익명객체로 받는 부분) 받는거임
		
		//실습2 메세지를 리스트에 넣은것을 받도록 해보장
		//리스트로 받는경우에는 반복문으로 받아서 출력해야함(많으니까)
		ois.readObject();//일단 쳐 읽어야지 시뱅아.
		
		List<Message2> msgs = 
				(List<Message2>)ois.readObject();
		//리스트로 받아오니까 형변환!!!! 오브젝트보다 하위니까
		
		//실습3번 받아온 리시트를 파일로 출력하자(받아온것들은 현재객체임
		//폴더를 만드는 API는 따로 있음 mkdir
		File dir = new File("C:/java_logs");
		if(!dir.exists()) dir.mkdir();		
				
		File file = new File("C:/java_logs/log_20231121.txt");
		if(!file.exists()) file.createNewFile();
		
		fw = new FileWriter(file);
				
		/*FileWriter*/
				//이제파일을 출력할수 있겠구나..
				//fw = new FileWriter("C:/java_logs/log_20231121.txt");
				//일단 출력하는 경로(파일로) = fos를 만들었다. 이제 출력을 하고자 한다면..
		
		for(Message2 message : msgs) { //Iterator로 반복자를 통해서 보낼수 있음
			System.out.println(message);//메세지 전부 출력
			System.out.println("메세지 제목"+message.getSubject());
			System.out.println("메세지 내용"+message.getContent());
			//날짜는 이상하게 나오니까
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
			String writeDate = sdf.format(message.getWritedate());
			System.out.println("작성일시"+writeDate);
			
			//실습3번임  for문 썻으니까 이걸 써야징
			fw.write(writeDate+":"+message.getSubject()+message.getContent());
			fw.flush();//잘 나가라
		}
		
		
		
		
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} finally {
			try {//읽는순서로 반대로 닫아줌
				
				ois.close();
				socket.close();
				ss.close();
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
		}
		
		
	}//메인
	//서버가 할일 서버소켓(관리자 만들고) // 서버에서 받아들이기위한 서버(의 전용)소켓 만들기
}
