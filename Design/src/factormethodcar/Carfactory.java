package factormethodcar;

import java.util.ArrayList;
import java.util.List;

import factorymetodframework.Factory;
import factorymetodframework.Product1;

public class Carfactory extends Factory {

	private List<Product1> productList;
	public List<Product1> getProductList() {
		return this.productList;
	}
	
	public Carfactory() {
		this.productList = new ArrayList<Product1>();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	/*public Product1 createProdcut() {
		return new Car("모닝");
	}*/
	public Product1 createProdcut(String name) {
		return new Car(name);
	}
	
	@Override
	public void registerProdcut(Product1 product1) {
		productList.add(product1);
	}
	
	
}
