package edu.java;
//1부터 45까지의 임의의 정수 중 3개를 뽑아 출력하자
public class Exam3 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			int aa = (int)(Math.random()*45+1);
			System.out.println(aa);
		}
		
	}
		

}
