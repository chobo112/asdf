package exam.java;

public class AnimalMain {
	
	public static void main(String[] args) {
		Animal animal = new Animal("코로호흡","길쭉함","다리4개");
		System.out.println(animal);
		
		
		Fish fish = new Fish("물호흡","넓적함","다리없음");
		System.out.println(fish);
		
		Animal animalF = new Fish();//상위(로)타입변환 증거용
		Fish fish1 =(Fish) new Animal();//하위(로)타입변환 이렇게하면 안됨
		Fish fish2 = (Fish) animalF;//이런식으로 증거? 경험이 있던 변수를 넣어줌
		
	}

}
