package exam.java.thread;


public class ThreadMain {
	//main을 만드는 순간 메인스레드도 만들어진거임. => 단일스레드 일단 된거임
	public static void main(String[] args) {
// 러너블 구현한경우 Thread개게를 생성해서 start		
//		Thread oddPrinter1 = new Thread(new OddPrinter1());
//		oddPrinter1.start();
		
		//Tread를 상속받은 경우 그냥 이렇게 호출함
		//new OddPrinter2().start();
		
		
		//러너블 인터페이스를 구현한 클래스의 익명객체
		Runnable runnable = new Thread(){
			@Override
			public void run() {
				for(int i =1; i<100; i=i+2) {
					System.out.println("OddPrinter2 thread : "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			}
		};//익명코드 뒤에는 세미콜론을 적어주자.
		Thread thread = new Thread(runnable);
		thread.start();
		
		//스레드에 이름설정하고 받고
		thread.setName("뭘까용");
		System.out.println(thread.getName());
		
		
		for(int i = 2; i<=100; i=i+2) {//1부터100까지의 짝수
			System.out.println("main thread : "+i);
			try {
			Thread.sleep(500);//현재의 쓰레드(흐름)을 0.5초간 멈췄다가 실행
			//이렇게 쓰면 0.5초의 시간을 두고 출력됨
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		
		
	}//메인

}//클래스
