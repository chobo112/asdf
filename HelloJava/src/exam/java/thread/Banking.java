package exam.java.thread;
//person과 account
public class Banking {
	
	public static void main(String[] args) {
		
		Account account = new Account(10000);
		
		Person person1 = new Person("채승기", account);
		Person person2 = new Person("강감찬", account);
		//person1과 2는 account를 공유하는중
		
		//Tread만든거 이용하기
		Person1Thread person1Thread = new Person1Thread(person1);
		//Person1Thread에서 만든 생성자 person을 넣는거
		Person2Thread person2Thread = new Person2Thread(person2);
		
		person1Thread.start();
		person2Thread.start();
		
		
		
	}//main

}//class
