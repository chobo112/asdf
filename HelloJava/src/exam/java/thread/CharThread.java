package exam.java.thread;
//Odd랑 Even이랑 셋트
public class CharThread extends Thread {
	
	private CharThread charThread; 
	public CharThread() {
	}
	public CharThread(CharThread charThread) {
		this.charThread = charThread;
	}
	@Override
	public void run() {
		CharThread charThread = new CharThread();
		//char를 찍을건데 아스키코드는 A대문자가 65임/ Z가 91
		for(int i =65; i<91; i++) {
			System.out.println("CharThread : "+(char)i);//대문자A부터 Z까지 출려함//타입변환
			try {
				Thread.sleep(500);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}//포문
		

	}//run메서드

}//클래스
