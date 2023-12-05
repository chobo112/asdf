package board.aggregate;

import board.iterator.BidIterator;

//Iterator인터페이스를 구현한 Iteratror디자인패턴 집합체 구현 클래스
public class ConcreteAggregate implements BidAggregate{
	private int[] ConArray = new int[10];
	public ConcreteAggregate() {
		for(int i = 0; i<10; i++) {
			ConArray[i] = i+1;
		}//conArray는 만개가 있고 초기화를 해주는작업
	}
	public int[] getConArray() {
		return this.ConArray;
	}
	@Override
	public Object iterator() {
		return new BidIterator();
	//인터페이스인 iterator, 구현은 Biditerator	
	}
	
}
