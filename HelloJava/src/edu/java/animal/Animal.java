package edu.java.animal;
//내가 인터페이스로 설계한 것들 중 중간단계? 추상클래스로할거임(일부만 구현)
public abstract class Animal //abstract가 붙는 순간 추상클래스 = 객체를 생성할수 없음
   implements Walkable, Runnable, 
   Flyable, Soundable {//기능4개구현
	//모두가 가진것들 이름/ 분류
	String sort; //변수만 선언한거  선언한 이유는 AnimalMain에서 쓰려고
	String name;
	
	@Override
	public void walk () {
		System.out.println("걷다");
	}
	@Override
	public void run () {
		System.out.println("뛰다");
	}
	@Override
	public void fly () {
		System.out.println("난다");
	}
	@Override
	public void sound () {
		System.out.println("어흥");
	}
//걷고 부터 소리내는것까지 기본구현으로 만들어놓음
	
	
}
