package edu.java.animal;
//결과세팅및 테스트용??
public class AnimalMain {
	public static void main(String[] args) {
		Able lion = new Lion();//상위형변환
		//객체는 하위타입변수인데 데이터타입은 상위타입으로 하는게 좋음
		//Able타입으로 받음 이게 인터페이스타입의 lion의 참조Lion();을만든거
		Able eagle = new Eagle();
		printName(lion);
		printName(eagle);
		
	}
	
	public static void printName(Able able) {//Able타입 
//		Animal lion = (Animal) new Lion();
//		Animal eagle = (Animal) new Eagle();
		System.out.println(((Animal)able).name);
		

	}
		

}
