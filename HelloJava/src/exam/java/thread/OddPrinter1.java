package exam.java.thread;

import exam.java.thread.*;
//import할때 똑바로 하자 사발

//홀수를 찍는건데 2번쨰 방법인 러너블인터페이스를 구현하는 방법ㅜ
public class OddPrinter1 implements Runnable {

	@Override
	public void run() {//러너블인터페이t스에 유일하게 있는 run메서드
		
		for(int i =1; i<100; i=i+2) {
			System.out.println("OddPrinter1 thread"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		
	}

}
