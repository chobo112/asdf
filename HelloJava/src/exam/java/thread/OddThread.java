package exam.java.thread;

public class OddThread extends Thread {
	private SharedObject sharedObject;//공유객체를 쓰레드가 가지도록[has a]
	public SharedObject getSharedObject() {
		return sharedObject;
	}
	public void setSharedObject(SharedObject sharedobject){
		this.sharedObject = sharedobject;
	}
	//공유객체만든거임
	private int sharedNum;
	public int getSharedNum() {
		return sharedNum;
	}
	public void setSharedNum(int sharedNum) {
		this.sharedNum = sharedNum;
	}
	@Override
	public void run() {
		while(true) {
			if(!sharedObject.isEvened()) {//짝수가 아닐떄니까 홀수일때만 시작 =>!
			//애초에 공유객체에 짝수만 설정해놔서 Odd에서 짝수를 바꿔야함	
			try {
				synchronized(sharedObject) {
					System.out.println("OddThread : "
							+sharedObject.getSharedNum());
					sharedObject.setSharedNum
						(sharedObject.getSharedNum()+1);
					
					sharedObject.setEvened(true);
					//공유객체에 짝수로만 해놓음 boolean 따라서
					//홀수에 왔을때는 true가 나와야함.
					if(sharedObject.getSharedNum()==30) break;
				}
				Thread.sleep(500);
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			}
		}//while
		
	}// run

}// class
