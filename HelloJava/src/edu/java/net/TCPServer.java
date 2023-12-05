package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP서버만들기(받는쪽과 연결 송수신 확인 필수 = TCP)
public class TCPServer {
//여기서 실행시키거나 / cmd에서 실행시키거나 !!!결국에는 1번만 실행시켜야함
//서버의 포트번호 상수(0부터 1023제외 / ~65534까지 중에 한개
	final static int SERVER_PORT = 9898;
	//final static int SERVER_PORT = 9898;
	// 0부터 1023는 제외, ~65534까지중에서 1개 = 포트가 사용중이니까 조심해야함
	
	final static String MESSAGE_FROM_SERVER = "Hello Client";
	// 서버에서 클라이언트에게 보낼 메세지
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		//서버소켓을 만든것이다 서버는 서버소켓이 필요함!!,고객은 소켓만
		//서버소켓은 클라이언트에게 할당할 Socket을 관리하는 역할임
		
		try  {
			serverSocket = new ServerSocket(SERVER_PORT);
			//설정한 포트를 사용하는 서버소켓 생성(서버소켓 = 9898이리로 들어와라 라는 개념)
			
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		InputStream is = null;//서버로 들어오는 데이터(바이트스트림) 받음
		OutputStream os = null;//서버에서 나가는 데이터(클라언트에게 보냄)
		try {
			while(true) {//서버는 클라이언트의 요청을 받아야하니까 무한반복을 하는것임(계속해놔야지 계속받지)
				System.out.println("socket 대기");
				Socket socket = serverSocket.accept();//서버소켓의 accept는 Blocking메소드라고 함
				//accept메소드가 호출되면 클라이언트의 연결을 대기하게됨 =>클라이언트 접속할때까지 계속대기중
				//밑에있는 메시지는 호출이 안되는거임
				//여기서 말하는 서버소켓은 위에 서버소켓 클래스 - 매니저가 아니고
				//서버에 만든 소캣이라는 개념으로 서버소캣이라고 부르는거 둘이 다른거다.
				//serverSocket.accept();는 클라이언트 통신할 서버소켓
				System.out.println("host : "+socket.getInetAddress()+"연결성공");
				//getInAdd = 주소를 받는것
				//클라이언트와 연결이 되었을때 클라이언트에게 할당한 소켓의 입출력스트립을 얻을수 있다.
				is =socket.getInputStream();
				//인풋스트림으로 소켓의 인풋얻어오기/클라이언트가 보낸거 서버로 받는거
				os = socket.getOutputStream();
				//서버로 보내는거(클라이언트에게) 즉, 클라이언트1개당 소켓1나다.
				
				byte[] data = new byte[16];//16바이트 버퍼 = 그냥 배열에 담아서 보내겠다
				int n = is.read(data);//배열에 담은 데이터를 읽어들인다.int인 이유는Stream이니까 (byte => int가능)
				
				//클라이언트에게 받은 바이트스트림을 문자열로 변환
				final String messageFromClient = new String(data, 0, n);
				System.out.println("message from client : "+messageFromClient);
				
				//서버에서 클라이언트에게 보낼 바이트배열을 보내는거
				os.write(MESSAGE_FROM_SERVER.getBytes());
				os.flush();//OutputStream은 flush를 해 주어야 클라이언트에게 전송됨(Buffered는 자동)
				
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		finally {
			
			try {
			is.close();
			os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}// 클래스
