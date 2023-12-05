package edu.java;

public class TypeCastingMain {//main쓴거보니 메인메소드 = 메인클래스구나
	
	public static void main(String[] args) {
		//parent타입의 parent1, 가지고 있는 참조는 Parent
		Parent parent1 = new Parent();//페어런트 객체를 만듬(참조값도 페어런트)
		
		//Child타입의 child1, 가지고 있는 참조는 Child()
		Child child1 = new Child(); //  차일드클래스 만든거
		
		//
		
		System.out.println(parent1.getName());
		System.out.println(child1.getName());
		
		
		//upcasting 상위형변환(하위를 상위로. 묵시적형변환)
		//parent2는 Parent타입. 참조하는 값은 child()
		Parent parent2 = new Child(); 
		//하위타입이 상위타입에 들어감 (Parent)가 생략된거..하위형변환의 기억이 있음
		
		System.out.println(parent2.getName());//child로 나옴 참조값이 child니까 
		//즉 무슨 참조값을 가지고 있냐고 중요함=물론 상속관계에 있을때만 이다.
		
				
		//downcasting 하위형변환(상위를 하위로, 이건 강제 = 명시적형변환
		//child2는 child타입이고 참조하는 타입도 child()/ 앞에(Child)로 형변환 함
 		//하위형변환을 위해서 하위타입참조값을 가지고 있어야 한다.!!!!!!!!!!!
		//Child child2 = (Child) new Parent();//이렇게 적으면 에러가 나옴. new Parent()는 경험이 없음
		Child child2 = (Child) parent2;// parent2는 위에서 하위참조값을 이용한 경험이 있음
		
		
 		
 		System.out.println(child2.getName());
		
		Parent parent3 = child2;//상위형변환 
		
	}
	

}
