package exam.java;

public class StudentExam {
	public static void main(String[] args) {
		Student S1 = new Student();
		//스튜던트입의 S1이라는 Student타입의 클래스를 생성
		//new는 객체를 생성하는 것
		//따라서 Student();클래스를 생성하고 거기서 인스던스를 참조하겟다
		
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 따른 Student 객체를 참조합니다.");
	}
	

}
