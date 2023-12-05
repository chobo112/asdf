package edu.jav.anonymous;
//사운더블의 설계를 구현하는 클래스고. 사운더블에 선언한 추상메서드 사운드도 강제 구현화=override
public class Cat implements Soundable {
	
	String name;
	String sound;
	
	Cat(){
		
	}
	
	Cat(String name, String sound){
		this.name = name;
		this.sound =sound;
	}
	@Override
	public String sound() {
		return this.sound;

	}
	
	@Override
	public String name() {
		return this.name;//위에 이름 해놨으니까 이거 던지자
	}
}
