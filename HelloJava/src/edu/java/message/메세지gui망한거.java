//package edu.java.message;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JScrollBar;
//import javax.swing.JScrollPane;
////파일로 가져와서 GUI에다가 뿌려주자.. 데이터 가져오기를 누르면
//public class MessageGUI extends JFrame{
//	protected JScrollBar horizontalScrollBar;
//	FileReader fr = null;
//	InputStream is = null;
//	
//	FileWriter fw = null;
//	BufferedReader br = null;
//	
//	MessageGUI() {
//		init();
//	}
//	void init() {
//		this.setLayout(new BorderLayout());
//		this.setSize(600, 600);
//		this.setTitle("MessageGUI");
//		this.setBackground(Color.BLACK);
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		//진짜 닫기 버전(메모리에서도)
//		JScrollPane jsp = new JScrollPane();
//		JButton jbtn = new JButton("데이터 가져오기");
//		add(jbtn, BorderLayout.SOUTH);
//		
//		jbtn.addActionListener(new ActionListener() {
//			//데이터 가져오기 버튼을 누르면
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					//파일을 읽어들이는 코드
//					fr = new FileReader("C:/java_logs/lg_20231121.txt");
//					fr.read();
//					char[] texts = new char[1024];//내용이 별로 없기때문에 이럴필요는 없다.
//					int readchar;
//					while(true) {
//						readchar = fr.read(texts); 
//						if (readchar == -1)break;//다읽었으면 멈춰
//						//System.out.println(fr);
//					}
//					//이제 다 읽어왔으니까 화면에 출력하자(문자열로 읽어왔지만)
//					fw.write(texts);
//					
//					} catch(FileNotFoundException fnfe) {
//						fnfe.printStackTrace();
//					}catch (IOException ioe) {
//						ioe.printStackTrace();
//					}finally {
//						try {
//						fr.close();
//						}catch (IOException ioe) {
//							ioe.printStackTrace();
//						}
//					}
//			}
//		});
//				
//		add(new JScrollPane(new JScrollBar()),BorderLayout.EAST);
//		
//		this.setVisible(true);
//		
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		new MessageGUI();
//		
//		
//	}
//	
//}
