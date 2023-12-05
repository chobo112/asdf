package exam.java.thread;
//OddThread와 EvenThread같이 쓰는중임
public class ThreadExer3{
	
	public static void main(String[] args) {
		
		SharedObject so = new SharedObject(0, true);
		//공유객체
		
		//OddThread에 공유객체설정
		OddThread oddThread = new OddThread();
		oddThread.setSharedObject(so);
		
		//EvenThread에 공유객체설정
		EvenThread evenThread = new EvenThread();
		evenThread.setSharedObject(so);
		//evenThread에.setsharedNum을 불러올거임
		//setSharedNum은 매개변수가 int임.
		//so는 위에서 Shared클래스에 int값 초기화값0으로 설정
		//so.getSharedNum()은 메서드를통해서 so에 값을 셋세어드에 매개변수로 넣는거
		//evenThread.setSharedNum은 변수.메소드호출
		oddThread.start();
		evenThread.start();
		//공유객체를 통해서 순차적으로 0부터 30까지 출력할것
	}

}
