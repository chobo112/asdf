package edu.java;

public class Exam9 {
//	int gas = 0;
//	void run() {
//	while(true) {
//		if(gas>0) {
//			System.out.println("달립니다.(gas잔량 : "+ gas + ")");
//			gas -= 1;
//		} else {
//			System.out.println("멈춥니다.(gas잔량 : " + gas+")");
//			return;
//			
//		}
//	}
//	}
//	public static void main(String[] args) {
//		Exam9 exam = new Exam9();
//		exam.run(); // run 메소드 호출
//		//이유를 알 수가 없음..
//	}
	int speed;
	
	void run() {}
	
	public static void main(String[] args) {
		//speed = 60;
		//run();
		//오류가 나온다
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		
	}
	
	
	
	
}
