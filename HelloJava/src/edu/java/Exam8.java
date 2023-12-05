package edu.java;

public class Exam8 {
	int add(int a, int b) {
		int result = a+b;
		System.out.println(result);
		return result;
		
	}
	public static void main(String[] args) {
		Exam8 num = new Exam8();
        int sum = num.add(5, 3); // 메소드 호출과 반환값을 변수에 저장
        System.out.println("Sum: " + sum); // 결과 출력
    }
	
		
	
}
