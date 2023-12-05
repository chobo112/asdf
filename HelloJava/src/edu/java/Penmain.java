package edu.java;

public class Penmain {
	
	public static void main(String[] args) {
		
		Pen makerPen = new Pen("모나미","마커","검정",2000);
		Pen ballPen = new Pen("지브라","볼펜","파랑",3000);
		//위의것들이 생성자를 호출해서 객체를 만든것
		
		System.out.println(makerPen.getPenData());
		System.out.println(ballPen.getPenData());
	}

}
