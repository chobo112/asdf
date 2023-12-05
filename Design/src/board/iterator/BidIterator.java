package board.iterator;
//오라클에서는 시퀀스 = Iterator

import board.aggregate.BidAggregate;
import board.aggregate.ConcreteAggregate;
import board.bean.Board;
//Iterator를 구현한 클래스
public class BidIterator implements Iterator {
	// 상위타입인 인터페이스로 받는게 좋음
	BidAggregate concreteAggregate;// 구현한 Concrete보다 상위로 받아라 국룰
	int currBid;
	public BidIterator() {
		concreteAggregate = new ConcreteAggregate();
	}
	@Override
	public boolean hasNext() {
		if (currBid == 10) {
			return false;
			//10000일때는 뒤에 요소가 더 없다고 가정함
		} else {
			return true;
		}
	}
	@Override
	public Object next() {
		int[] conArray = ((ConcreteAggregate) concreteAggregate).getConArray();
		return conArray[currBid++];
		//++하는 이유 : hasnext로 계속해서 10000번째까지 불러와야 하니까
	}

}
