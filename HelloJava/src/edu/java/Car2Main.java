package edu.java;

public class Car2Main {
	
	public static void main(String[] args) {
		Car2 car = new Car2();
		System.out.println(car);//car라는 객체참조값을 출력하자 = heap영역
		
		//car는 toString이 없음/ car = Car2()를 참조
		//object는 toString이 있으나. car는 toString이 없고, 오브젝트의 toString을 가져다 쓸수있는거
		//toString은 car에 없음
	}
	
	
	

}
