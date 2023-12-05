package exam.java.thread;
//Odd랑 Even이랑 Char이랑 이게 메인
public class ThreadExer2 {
	
	public static void main(String[] args) {
		
		//Thread oddThread = new OddThread();
		//oddThread.start(); //이렇게 만드는것은 객체를 만들어서 계속사용
		new OddThread().start(); //=> 한번만 쓸거니까 이렇게
		//new EvenThread().start(); //여긴 익명객체로 1회용 애들
		//new CharThread().start();
		
		//실습
		//1.10보다 작은 홀수가 먼저 모두 출력된 후  10/11이렇게
		//1부터 9까지 홀수를 찍는게 1번인가?
		//2.홀수와 짝수는 같이 출력되야함
		//그 후에 짝수20이 출력된 후 영문자가 출력되어야 한다.
		
		
		
		
		
	}

}
