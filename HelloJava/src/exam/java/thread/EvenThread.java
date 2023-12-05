package exam.java.thread;

//1부터 30까지 짝수만 출력
public class EvenThread extends Thread {
	private SharedObject sharedObject;
	//공유객체를 쓰레드가 가지도록[has a]
	public SharedObject getSharedObject() {
		return sharedObject;
	}
	public void setSharedObject(SharedObject sharedobject) {
		this.sharedObject = sharedobject;
	}
	// even과 Odd가 같이 공유하는객체임
	private int sharedNum;
	public int getSharedNum() {
		return sharedNum;
	}
	public void setSharedNum(int sharedNum) {
		this.sharedNum = sharedNum;
	}
	@Override
	public void run() {

		while (true) { //무한반복을 할건데 if가 조건
			if (sharedObject.isEvened()) {//=> 짝수일때만=true고 실행하자
				//SharedObject에서 isEvend를 boolean로 준 이유
				try {
					//동기화 블록임
					synchronized (sharedObject) {//공유객체에 대해서 락으 획득 
						//= EvenThread가 Sharedobject를 독점
						System.out.println("EvenThrea : " + sharedObject.getSharedNum());
						//
						sharedObject.setSharedNum(sharedObject.getSharedNum() + 1);
						//1을 더한값을 세팅함 => 홀수출력할 차례 라고 봄.
						sharedObject.setEvened(false);
						//30에서 종료하기위해서 InterruptedException을 강제 발생시킴
						if (sharedObject.getSharedNum() == 30)
							interrupt();//인터럽트를 만나는 즉시 InterruptException을 바로 발생시킴
					}
					Thread.sleep(500);
				} catch (InterruptedException ie) {
					System.out.println("EvenThread종료!");
					break;
				}
			}
		} // while

	}// run

}// class
