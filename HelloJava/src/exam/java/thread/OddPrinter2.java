package exam.java.thread;

public class OddPrinter2 extends Thread{
//쓰레드를 상속받았으니까 얘도 쓰레드임	
		
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
}
