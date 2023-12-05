package edu.jav.exception;

public class ExceptionTest2 {
		
	
	public static void main(String[] args) {
		//실습1 outofMemory 에러를 내보자 = 객체문제
		//실습2 stackOverflow 에러를 내보자 = 지역변수 일거다.
		
//		int count = 0; //실습1
//		while(true) { //객체를 무한생성 true 일때 실행하는건데 아예 true선언
//			
//			
//			ExceptionTest2 e2 = new ExceptionTest2();
//			System.out.println(++count+":"+ e2);
//		}
		a();
	}
		//실습2
	
		public static void a() {
			b();
		}
		public static void b() {
			a();
		}
		
		
		
	
}
