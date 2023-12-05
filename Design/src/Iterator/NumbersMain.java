package Iterator;

public class NumbersMain {//테스트 클래스
	
	public static void main(String[] args) {
		Aggregate aggreagte = new Numbers();
		//상위타입으로 받아야 하니까 Aggregate타입으로 받음
		Iterator iterator = (Iterator) aggreagte.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
