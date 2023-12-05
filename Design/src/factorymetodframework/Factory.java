package factorymetodframework;

public abstract class Factory {
	
	public Product1 create(String name) {//create는 Templet메서드임
		Product1 product1 = createProdcut(name);
		//creatProduct();에서 만들어서 prodcut1에 넣고자 여기에 넣은거
		registerProdcut(product1);//상품을 등록할거고
		return product1;//상품을 돌려받을거야
		//=return new Product1();이거와 같은말..
	}
	
	public abstract Product1 createProdcut(String name); 
	//이거는 상품을 만들 메서드를 준거임
	
	public abstract void registerProdcut(Product1 product1);
	//만들어진 프로상품을 등록하겠다.

}
