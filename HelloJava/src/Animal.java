public class Animal {
	void Sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}
class Dog extends Animal {
	@Override
	void Sound() {
		System.out.println("Dog이 소리를 냅니다.");
	}
	void onlyDog() {
		System.out.println("Dog만 가지고 있는 메서드");
	}
}
class Cat extends Animal{
	@Override
	void Sound() {
		System.out.println("cat이 소리를 냅니다.");
	}
	void onlycat() {
		System.out.println("Cat만 가지고 있는거");
	}
}



