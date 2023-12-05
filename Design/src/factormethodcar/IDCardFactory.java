package factormethodcar;

import factorymetodframework.examFactory;
import factorymetodframework.examProduct;

public class IDCardFactory extends examFactory{
	
	protected examProduct createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct(examProduct examProduct) {
		System.out.println(examProduct+ "을 등록하였습니다.");
	}
	
	
}
