package edu.jav.anonymous;

public class Dog implements Soundable {
	
	String name;
	String sound;
	Dog(){
		
	}
	
	Dog(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	
	//String부터 생성자 name까지를 해야 메인에서 new Dog("강아지");와 공백가능
	@Override
	public String sound() {
		return this.sound;
		
	}
	
	@Override
	public String name() {
		return this.name;
	}
}
