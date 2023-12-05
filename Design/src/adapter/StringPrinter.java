package adapter;
//어댑터에 주기위한 부모클래스? 상속일지 위임일지는 아직모름


public class StringPrinter {
	
	String name = "홍길동";
	int age = 30;
	
	void printInfo() {
		System.out.println("이름은 : "+name+"이고, 나이는 : "+age);
		
	}

}
