package edu.java;

public class ReferenceTest {
	
	static Person person1;
	static Person person2;
	//메서드 에리어에 있는 클래스 변수!!
	
	public static void main(String[] args) {
		
		person1 = new Person(); 
		person2 = new Person();
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.si=2;
		System.out.println(person2.si);
		//static int si = 1;이었지만2로 하면 여기가 2가 되서 2로뜸
		
		person1.setName("홍길동");
		person2.setName("홍길동");
		
		System.out.println(person1.getName());
		System.out.println(person1.getNsi());
		
		System.out.println(person2.getName());
		
		System.out.println(person1.name.hashCode());
		System.out.println(person2.name.hashCode());
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
		//홍길동의 hashCoded와 new String홍길동의 해쉬코드가 같음?
		
		
		System.out.println(
				person1.name==person2.name);
		//==은 참조를 비교하는거 true가 나오는이유 : static에 있으니까=메소드영역(1개만가짐)/
		//힙에있으면 false가 나와야함
		
		System.out.println(
				person1.name.equals(person2.name));
	}//.equals여기가 값을 비교한거임
}	