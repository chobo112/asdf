package edu.jav.anonymous;

public class SoundableMain {

	public static void main(String[] args) {
		//interface = Soundable   
		
		//이게 익명객체를 활용함
		printSound(new Dog("개","멍멍"));
		printSound(new Cat("고양이","야옹"));
		
	}
	
	public static void printSound(Soundable soundable) {
		//여기서부터 sysout위까지가 익명객체임
			
		System.out.println(				
		soundable.name()+ " 는" + soundable.sound()+"소리를 냅니다!");
	}

}
