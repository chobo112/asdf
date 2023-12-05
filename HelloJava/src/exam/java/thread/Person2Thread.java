package exam.java.thread;
//두번째 쓰레드는 500원을 더하는거
public class Person2Thread extends Thread{
	
	Person person2;
	public Person2Thread(Person person2) {
		this.person2 = person2;
	}
	@Override//러너블을 구현한 스레드의 런(오버라이드한)그 런을 가져옴
	public void run() {
		//person2.getAccount().getMoney();얘가 가진돈
		for(int i = 0; i<10; i++) {//천원 열번씩 만원 다 털겠다.
			synchronized(person2.getAccount()) {
				person2.getAccount().setMoney(
					person2.getAccount().getMoney()+500
					);
				}
			System.out.println(person2.getName()+"님 계좌 잔액"+
					person2.getAccount().getMoney());
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		}
	}//run

}//main
