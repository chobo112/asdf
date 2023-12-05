package prototypeanoymous;

import prototypeframework.Manager;
import prototypeframework.Product;

public class prototypeMain extends prototypefactory{
	//Product product = new MessageBox("이해불가능"); 이거없애려고
	//prototypefactory
	
	public static void main(String[] args) {
		//매니저가 프로덕트를 사용함. 따라서 프로덕트를 먼저 만들어야함
		Product product = new MessageBox("이해불가능");
		//Factory패턴으로 Product를 넣기 위한 클래스들을 생성
		
		Manager manager = new Manager(product);
		
		Product cloneProduct = null;
		try {
		cloneProduct = 
				(Product)manager.create();/*create에 clone이있음 이게 복제한거*/
		cloneProduct.use();
		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
	}

}
