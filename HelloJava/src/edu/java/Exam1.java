package edu.java;
//1부터 100까지의 정수 중에서 짝수만 출력하자
public class Exam1 {
	
	public static void main(String[] args) {
		
		int result = 0;
		int i = 0;
		
		for(i=1; i<=100; i++) {
			
			if(i%2 == 0) {
				result += i;
			//여기다가sysout을 적으면 2의 배수들을 계속 출력한듯	
			}
			//여기다가 적으면 ? 2번씩 출력됨??이유는
			//for 일때와 if문 2번 중복 출력됨
		}
		System.out.println(result);
		//여기적어야 출력되는 이유는? 모르겠다.
	}
}
//public class Exam1 {
//	
//	public static void main(String[] args) {
//		
//		
//		int i;
//		for(i=1; i<=100; i++) {
//			
//			if(i%2 == 0) {
//				int result = 0;
//				result += i;
//				System.out.println(result);
//				//0이 무한반복으로 출력되는중임..
//			}
//		}
//	}
//}
