package factormethod.main;

import java.util.List;

import factormethodcar.Carfactory;
import factorymetodframework.Factory;
import factorymetodframework.Product1;

public class CarMain {

	public static void main(String[] args) {
			
			Factory factory = new Carfactory();
			Product1 prodcut1 = factory.create("아우디");
			Product1 prodcut2 = factory.create("모르겠다");
			Product1 prodcut3 = factory.create("개같은거");
			
			List<Product1> productList = 
					((Carfactory) factory).getProductList();
			for(Product1 product : productList) {
				product.use();
			}
			
		}
	
	

}
