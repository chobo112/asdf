package exam.java;

public class Car {
	int speed;  //넌스택틱 맴버변수 맴버가 되려면 클래스 수준에 있어야함
	void run()	{} //넌스택틱 맴버메소드
	
	public static void main(Stirng[] args) {
		speed = 60;
		run();  
		//스피드와 런은 넌스택틱임
		//따라서 .static.안에서는 못씀
		
		//쓰려면 객체를 만들어서써야함
		Car moring = new Car();
		moring.speed = 60;
		moring.run();
	}
}
