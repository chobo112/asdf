package Iterator;
//이거는 이터레이터 인터페이스를 구현한 클래스
public class NumbersShelfIterator implements Iterator{

	int[] numbers;//Nuubers의 배열을 받아온거
	int currIndex;
	
	public NumbersShelfIterator(int[] numbers) {
		this.numbers = numbers;
	}//NumbersShelftI의 클래스를 생성하면 여기다가 받아옴 numbers를
	
	
	@Override
	public boolean hasNext() {
		//위에 numbers는 Numbers클래스에서 받아온{1,2,3,4,5}니까 인덱스가 5임
		if(currIndex>4) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {//다음것을 가져오기 위함 next(hasNext가 true일때)
		return numbers[currIndex++];//0번째 인덱스부터 마지막까지 []를쓴거는 배열이니까
	}
	
		
	
	
	
}
