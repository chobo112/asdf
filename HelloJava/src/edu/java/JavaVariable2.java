package edu.java;

public class JavaVariable2 {
	
	//넌스택틱 맴버변수
	int realnsi = 1;
	
	//스택틱 맴버변수
	static int realsi ; 
	
	static {//스택틱 블록, 스택틱 초기화 블록임
		int si = 2;//지역변수
		realnsi = 2; // 런타임 오류(3타임이고 / static은 컴파일타임 = 2time임)
		realsi = 4;
		A a =new A(); //여기서 A(); new A(); 객체는 무조건 힙에 간다.
		//a는 그냥 static이던 non static이던 {}안에 있으면 지역변수임
		//a는 참조만 가지고 있는 참조변수. A타입을 가지는 a는 변수라는거
	}
	
	{//넌스택틱 블록
		int nsi = 1;//지역변수
		realnsi = 1; // 영역밖에서 선언했고 안에서 사용을 한다 정도임 
		realsi = 2; //static이 먼저니까 당연히 ㄱㅊ
		A a = new A(); //객체를 만들어낸거 a는 지역변수
		//a는 A(); 변수가 어딨냐, 변수가 가지는 값은 A(); => 힙영역에 있음
		//참조값도 스택에 있음. a에 들어가니까.  하지만 객체A();는 힙에 있는거임
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(nsi);
		System.out.println(si);
	    //에러가 나오는 이유 위에 두개다 블록안에서만 선언됨 static/non-static이던 블록을 벗어날수가 없다
		
		
		
	}
}
