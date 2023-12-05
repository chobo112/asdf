package edu.java;

public class Child extends Parent{//Parent를 상속받은 child
	
	String name = "child";
	
	@Override//부모에 쓴 메소드와 시그니처가 같음 = 오버라이드 같은지 확인하는것
	               //= 부모클래스의 겟네임이 맞는지 오타있는지 확인하는것
	String getName() {
		return this.name;
	}
	
}
