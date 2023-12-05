package prototypeanoymous;

import prototypeframework.Product;

public class MessageBox implements Cloneable, Product{

	private String decochar;
	public MessageBox(String decochar) {
		this.decochar = decochar;
	}
	
	@Override
	public void use() {
		System.out.println(decochar);
	}
	@Override
	public Object createClone() throws CloneNotSupportedException {
		return this.clone();
		//이 메서드에서 만든 객체를 클론화 하겠다.
	}
	
}
