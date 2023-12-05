package singleton;

public class SingletonMain {
	
	
	public static void main(String[] args) {
		Singleton sg = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		Singleton sg3 = Singleton.getInstance();
		
		System.out.println(sg.hashCode());
		System.out.println(sg2.hashCode());
		System.out.println(sg3.hashCode());
		
		System.out.println(sg==sg2 ? "같은 객체":"다른객체");
	}
	
}
