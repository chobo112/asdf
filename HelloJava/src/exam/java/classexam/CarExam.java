package exam.java.classexam;

public class CarExam {
	public static void main(String[] args) {
		Car my = new Car();
		
		System.out.println("제조회사"+my.Company);
		System.out.println("차량모델"+my.model);
		System.out.println("차량색상"+my.color);
		System.out.println("최고속도"+my.maxSpeed);
		System.out.println("차량속도"+my.speed);
		
		my.speed = 80;//차량속도 설정
		System.out.println("추가된 속도"+my.speed);
		
	}
}
