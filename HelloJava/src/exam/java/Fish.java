package exam.java;

public class Fish extends Animal{
	String method;
	String head;
	String body;
	
	Fish(){}//기본생성자
	Fish(String method, String head, String body){
		this.method = method;
		this.head = head;
		this.body = body;
	}
	
	@Override //오브젝트를 오버라이드
	public String toString() {
		
		return this.method + " : 호흡법 \n" +  
				"머리 : " + this.head  + 
				 "\n 다리의 개수 :"+this.body;
	}
}
