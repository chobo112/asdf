package Iterator;
//이건 집합체를 구현한 클래스(내가 반복할것들을 모아두는 애)
public class Numbers implements Aggregate{
	
	
	int[] numbers = new int [] {1, 2, 3, 4, 5};
	//반복시킬것들만 여기 넣어두면됨
	
	
	@Override//여기다가는 이터레이터를 구현할것들
	public Object iterator() {
		//집합체를 구현한 클래스지만 여기서 Iterator를 객체로 받고
		//NumberShelfIterator를 새로 만들고(생성자에 맞춰서 생성함)
		return new NumbersShelfIterator(numbers);
	}

}
