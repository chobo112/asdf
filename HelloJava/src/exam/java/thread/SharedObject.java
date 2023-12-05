package exam.java.thread;
//쓰레드들이 공유하는 공유객체 even부터 Odd
public class SharedObject {
	
	private int sharedNum; //1~30까지의 수
	private boolean isEvened;//짝수가 출력되었는지 여부 
	//flag라고함 boolean isEvened이런 것들이
	//만든 이유 : 홀짝홀짝 이거를 boolean의 true false로 받고싶어서
	//생성자
	public SharedObject() {
	}
	
	public boolean isEvened() {
		return isEvened;
	}
	public SharedObject(int sharedNum, boolean isEvened) {
		super();
		this.sharedNum = sharedNum;
		this.isEvened = isEvened;
	}
	//
	public int getSharedNum() {
		return sharedNum;
	}
	public void setSharedNum(int sharedNum) {
		this.sharedNum = sharedNum;
	}
	
	public void setEvened(boolean isEvened) {
		this.isEvened = isEvened;
	}
	
	
	
}
