package singleton;

public class Singleton {
	
	//private static Singleton singleton;
	//1개만 생기라고 static으로 만들어준거임
	private static Singleton singleton = new Singleton();
	
	
	private Singleton() {//생성자를 private로 만듬
		
	}
	public static Singleton getInstance() {
		//geInstance를 사용하면 Singleton이구나 하면 됨
		return singleton;
	}
	
}
