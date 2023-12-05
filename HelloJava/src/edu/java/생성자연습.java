package edu.java;

public class 생성자연습 {
	public static void main(String[] args) {	
		Person person1 = new Person ();
		//펄슨타입의 펄슨1은 뉴를 통해서 Person클래스를 만들고
		//만들어진 Person();클래스의 인스던스를 person1이 참조하겠다.
		Person person2 = new Person (31,930401);
		//이거는 생성자1에 해당하는 값을 참조함.2칸이니까
		Person person3 = new Person ("멍청이",150,50);
		//이거는 생성자2를 참조함. 값이 3개니까
		
		int birth = person2.birth;
		System.out.println(birth);
		
		String name = person3.name;
		System.out.println(name);
		System.out.println("이름은 : "+person3.name+
				"키는 : "+person3.height
				+"몸무게는 "+person3.weight);
		
//		person1은 기본생성자로 아무것도 초기화 하지 않아서 따로 초기화해서 써줘야됨
		int age = person1.age = 12;
		System.out.println(age);
		
		
	}

}
