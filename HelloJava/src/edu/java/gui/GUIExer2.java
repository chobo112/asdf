package edu.java.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//swing으로 만들거임
public class GUIExer2 extends JFrame{
	
	
	public GUIExer2() {
		init();
	}
	
	private void init() {
		this.setLayout(new GridLayout(3,2)); 
		//이번에는 그리드 레이아웃임 가로행3, 세로2열이니까 6개가 있는거임
		this.setBounds(new Rectangle(400, 400));//범위
		this.setTitle("스윙의 JFrame");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//스윙에서는 이게 닫는 옵션(화면만 닫고 메모리엔있음)
		//awt는 엄청 길게 써야만 꺼지는데 이건 한줄이 끝남
		
		
		Button btn1 = new Button("확인");//저기 그리드레이아웃에 막 넣을 버튼1번
		Button btn2 = new Button("확인dd");//저기 그리드레이아웃에 막 넣을 버튼1번
		Button btn3 = new Button("확인ff");//저기 그리드레이아웃에 막 넣을 버튼1번
		JButton jbtn2 = new JButton("이건 Swing버튼");
		JLabel jLable = new JLabel("라벨임");
		//JDialog jd = new JDialog();
		
		JOptionPane.showConfirmDialog(this,"확인해주세요");
		//옵션박스만들기임.
		
		//ImageIcon은 오브젝트 바로 아래임. 그냥 넣을수가 없음.
		String imagePath = "C:/data/cap.jpg";
		ImageIcon imgIcon = new ImageIcon(imagePath);
		add(jLable, BorderLayout.CENTER);
		jLable.setIcon(imgIcon);//이렇게 해야지 넣어짐
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(jbtn2);
		this.add(jLable);//이미지를 여기 라벨가운데에 넣기
		
		
		this.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new GUIExer2();
	}
	
	
}
