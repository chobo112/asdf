package exam.java;

public class Animal {
	String method;
	String head;
	String body;
	
	Animal(){}//기본생성자
	Animal(String method, String head, String body){
		this.method = method;
		this.head = head;
		this.body = body;
	}
	
	@Override
	public String toString() {
		
		return this.method + " : 호흡법 \n" +  
				"머리 : " + this.head  + 
				 "\n 다리의 개수 :"+this.body;
	}

}
