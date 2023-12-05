package exam.java.thread;

public class Person1Thread extends Thread{
	
	Person person1;
	Person1Thread(Person person){
		this.person1 = person;
	}//쓰레드에 펄슨을 넘겨주려고 하는거임
	
	@Override//러너블을 구현했으니 러너블의 런을 상속받은 쓰레드의 런을 오버라이드
	public void run() {
		//person1.getAccount().getMoney();//person1이 가진 돈
		for(int i = 0; i<10; i++) {//천원 열번씩 만원 다 털겠다.
		synchronized(person1.getAccount()) {
			person1.getAccount().setMoney(		
				person1.getAccount().getMoney()-1000
				);
			}
		System.out.println(person1.getName()+"님 계좌 잔액"+
				person1.getAccount().getMoney());
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		}//for
	}//run
	
	
	
	
}//class
