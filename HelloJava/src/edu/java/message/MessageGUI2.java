package edu.java.message;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
//파일로 가져와서 GUI에다가 뿌려주자.. 데이터 가져오기를 누르면

public class MessageGUI2 extends JFrame{

	MessageGUI2() {
		init();
	}
	
	void init() {
		this.setTitle("MessageGUI");//제목
		this.setLayout(new BorderLayout());
		this.setBounds(0,0, 400, 400);//사각형말고 이걸로함
		
		JScrollPane jsp =new JScrollPane();
		jsp.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//jsp완성함(JScrollPane) 수직만 있는 스크롤을 만든것임
		JTextArea jta = new JTextArea(20,30);
		//jta.setBorder(new LineBorder(Color.RED, 10));//위치얼마나큰가 그냥 확인함
		//jsp.add(jta);
		jsp.setViewportView(jta);
		JButton jbtn = new JButton("데이터 가져오기");
		//버튼에 이벤트주기 시작
		jbtn.addActionListener(new ActionListener() {
			//actionListenr는 인터페이스라서 이렇게 익명객체로함
			@Override
			public void actionPerformed(ActionEvent e) {
				//이제 누르면할것들을 여기다가 적어야함(파일읽어오기)
				BufferedReader br = null;
				try {
				br = new BufferedReader(new FileReader(
						"C:/java_logs/log_20231121.txt"));
				
				String printStr = "";
				String readedLine = "";
				while((readedLine = br.readLine()) != null) {
					//
					printStr += readedLine +"\n";
					//1줄씩 추가해서 다 모아서 한번에 읽자
				}//while문
				jta.setText(printStr);
				} catch (FileNotFoundException ne) {
					ne.printStackTrace();
				
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				
			}
		});
		
		this.add(jsp, BorderLayout.CENTER);
		this.add(jbtn, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//닫기
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MessageGUI2();
	}
	
}
