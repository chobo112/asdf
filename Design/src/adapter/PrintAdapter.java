package adapter;

//첫번째 상속을 이용한 어뎁터 클래스
public class PrintAdapter extends StringPrinter implements Print{
		
	public void print() {
		System.out.println("[홍길동의 정보]");
		printInfo(); //이건 SringPrint에서 받아온거임
		
	}
	
}
