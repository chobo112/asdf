package edu.java;

public class JavaVariable {
	//클래스 수준에 있다? 맴버가 들어간다. 스택틱이면 메소드영역, 넌스텍택은 힙영역
	
	//static member variable / 스택틱맴버변수 /클래스영역이니까
	static int si = 1;
	
	//non static member variable /넌스택틱맴버변수 / 클래스영역 맴버변수
	int nsi = 2;//초기화를 해주지 않아도 넌스택틱맴버변수는 자기타입으로 초기화가 된다.
	
	//static member method
	static int add(int i, int j) {
		return i + j; //파라미터값이 있으니까 return과 리턴값 적어주기
		
	}
	
	//non static member method
	int mul(int i, int j) {
		return i*j;
	//안에 있는 int i, int j는 지역변수들
	//넌스택틱 맴버메소드인 nmul의 지역변수들 이고 스택에 들어감
		
	}
	
	

}
