package prototypeframework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	
	Map<String, Object> showcase = 
			new HashMap<String, Object>();
	
	Product product;
	public Manager(Product product) {
		this.product = product;
	}
	
	public void register(String name, Product product) {
		//이름하고 제품을 저장만하니까 반환안하겠구나
		showcase.put(name, product);
	}
	public Object create() throws CloneNotSupportedException{
		//creatclone을 반환하니까 Object
		return product.createClone();
	}
}
