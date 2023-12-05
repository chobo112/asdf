package edu.java.message;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Reader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame{
	
	final static String SERVER_IP = "172.30.1.83";
	final static int SERVER_PORT = 6875;
	Socket socket = null;
	DataInputStream dis = null;
	public static void main(String[] args) {
		new ClientGUI();
	}
	public ClientGUI() {
	 possible();
	}
	 void possible() {
		this.setLayout(new BorderLayout());
		this.setTitle("실습5번. 네트워크연결및 스레드 및 합계구현");
		this.setBounds(0,0, 500, 500);//보더레이아웃 크기
		
		JTextField jtf = new JTextField();
		JTextField jtf2 = new JTextField();
		
		
		Box box = Box.createVerticalBox();
		//박스를 만들건데 이건 가로로 균등하게 위에1개, 아래에1개 나오게함
		box.add(jtf);//박스를 만들건데 그건 text필드인 jtf를 가진거고
		box.add(jtf2);//이건 박스중에서 jtf2를 가진 박스임
		add(box, BorderLayout.CENTER);//박스의 위치는 센터로한거임
		//이건 윈도우 화면에 중앙에 뜨게하는 것임 setLocationRelativeTo(null);
		
		//@@@@@@@@@@여기가 메인@@@@@@@@@@@@@@@@@@@@@@@@
		JButton jbtn = new JButton("시작");
		this.add(jbtn, BorderLayout.SOUTH);
		//버튼을 눌렀을때부터 이제 강사님한테 받아오기 시작할거임
		//즉 소켓 연결을 여기서부터 시작하면 될듯함
		
		
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);//선생님과 연결된 소켓 뚫기 
			
			dis = new DataInputStream(socket.getInputStream());
			//이게 서버에서 보내는 코드를 내가 받을수 있게해주는 getInputStream이거임
			
			dis.readInt();//데이터스트림에 있던것을 읽자
			//이제 읽은것을 시작버튼을 누르면 출력될수 있도록 해볼까
			
			jbtn.addActionListener(new ActionListener() {//받은것을 이제 버튼누르면 작동하도록 하자
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
			            int random = dis.readInt();
			            jtf.setText((Integer)random+"+");
//			            try {
//							int random;
//							while (true) {
//								if((random = dis.read()) != -1) break;
//							}
//				            jtf.setText(Integer.toString(random));
			            
			        } catch (IOException ioe) {
			            ioe.printStackTrace();
			        }
				}
			});
			
			} catch (ConnectException ce) {
				ce.printStackTrace();
			} catch (UnknownHostException uhe) {
				uhe.printStackTrace();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}finally {
				/*try {
				socket.close();
				} /catch(IOException ioe) {
					ioe.printStackTrace();
				}*/
			}
		
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//리얼닫기
		this.setVisible(true);
	}
	
	
	
	

}
