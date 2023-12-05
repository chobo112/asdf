package exam.java;

public class ChildExample {
	
	public static void main (String[] args ) {  //상위변환 : 가지고있는 참조 = Child();
		 Parent parent = new Child();     //상위타입변환(하위를 상위로/ 자동형변환 ㅇㅋ)
		 parent.field1= "xxx";                 //데이터 타입이 Parent니까 출력가능    
		 parent.method1();                    //가능
		 parent.method2();                   //가능
		 
		//parent.field2 = "yyy";               // 데이터타입이 parent : field2없음 불가능
		//parent.method3();                    //데이터타입이 parent : method3(); 불가능

		Child child = (Child) parent;    //하위타입변환 = 강제로 변환을 해 줘야합니다.
		child.field2 = "yyy";                  //가능
		child.method3();                     //가능
	}
} 
	 
	
