package edu.java.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame을 상속받았으니까 GUIExer1이 이제 프레임도됨//상속받은 자식이 범위가 넓음
public class GUIExer1 extends Frame{
	Image image;
	
	GUIExer1(){
		this.setTitle("처음 만들어 보는 프레임");
		this.setBackground(Color.GRAY);
		this.setSize(400, 400);
		this.setLayout(new BorderLayout());
		//보더레이아웃은 동서남북중앙
		
		this.addWindowListener(new WindowAdapter()  {
			//닫는기능을 추가하는 익명객체임
			public void windowClosing(WindowEvent e) {
				//윈도우 이벤트의 소스를 글자로 보고싶은것
				System.out.println(e.getClass().getName());
				dispose();//닫는건 dispose
			}
		});//익명객체에 리스트너에 넣는건데 그건 winodwAdapter고 거기에 메서드는 
			//윈도우를 닫는 메서드(dispose)
		
		
		//여기서부터는 버튼을 만든거고 버튼에 기능들을 추가한거.
		//한글깨짐 => Run > Run Configration > Arguments > VM Argumetns
		// -Dfile.encoding = MS949추가
		Button button = new Button("이것이 버튼이다.");
		//버튼이 필요하네 ? 일단 버튼객체를 하나 만들자
		button.setSize(200, 200);
		button.setBackground(Color.GREEN);
		//일단 awt 에서 button을 보면 add액션이잇네 쓰고, 그안에 액션리스트너한번 보자
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌렸습니다.");
			}
		});
		
		//버튼에 이벤트 줄것
		
		this.add(button, BorderLayout.NORTH);
		//이게 GUI에 버튼을 넣는것임, 이거가 버튼을 GUIExer1에 추가시킨거 
		//this.pack();//진공포장느낌
		this.setVisible(true);//맨뒤
		
		//입력상자넣기
		TextField text = new TextField("여기에 입력", 10);//뒤에숫자는 글저수10개
		Button button2 = new Button("확인");
		Panel panel = new Panel(new BorderLayout());
		//패널을 만들어야지 버튼이랑 text를 2개 넣어야함. 생성자보면 레이아웃있음
		panel.add(text, BorderLayout.WEST);//위에것중에 텍스트는 왼쪽에
		panel.add(button2, BorderLayout.EAST);// 확인버튼은 오른쪽에 넣기
		this.add(panel, BorderLayout.SOUTH);
		
		//이제 text에 입력한것을 확인을 누르면 콘솔창에 나오게 하는것.
		//여기서 text를 불러와서 읽어야할것같음
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(text.getText()+"가 입력되었습니다.");
			}
			
		});
		
		//실습3 센터에 이미지를 넣자
		String imgpath = "C:/data/neymar.jpg";//넣어줄 이미지의 경로
		image = Toolkit.getDefaultToolkit().getImage(imgpath);
		//방법중에 1개 Toolkit...
	}//GUI생성자 안
	public static void main(String[] args) {
		new GUIExer1();
	}//메인메서드
	
	@Override
	public void paint(Graphics g) {//얘가 이미지를 그냥 그려버리는 느낌
		g.drawImage(image, 0, 0, this);
	}
	
}
