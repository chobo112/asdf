package exam.java.constructor;

public class ThisMetohdConstructor {
	
	String Company = "기아자동차";
	String model;/* = "쏘렌토";*/
	String color;/* = "쥐색";*/
	int maxSpeed;
	
	
	
	ThisMetohdConstructor(){
		//기본생성자
	}
	
	ThisMetohdConstructor(String model, String color ){
		this();//300은 정의한적이 없으니까 밑에거 불러다줌
		//밑에 생성자 3개짜리를 불러주는 역할
	}
	
	ThisMetohdConstructor(String model, String color, int maxSpeed){
		this.model=model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
