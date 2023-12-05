package factormethod.main;

import factormethodcar.IDCardFactory;
import factorymetodframework.examFactory;
import factorymetodframework.examProduct;

public class IDCardMain {
//test 여기서는 상품을 실제로 만들어보고 제대로 되는지 보는거	
	public static void main(String[] args) {
		//생각해야될게 Product랑 Factory중에 뭐가 먼저인지. 공장이 있어야 상품을 만듬
		
		examFactory ef = new IDCardFactory();//공장은 공장인데 구체화된 상품을 만드는 공장 
		//상위 타입으로 받고 / 하위공장이니까 당연히 묵시적 형변환이 된거
		examProduct card1 = ef.create("채승기");
		examProduct card2 = ef.create("권도엽");
		examProduct card3 = ef.create("입용상");
		
		// use에 관한건 examProduct에서 정의했음
		//그 뒤에 구체화된 상품인 IDCard에서 use에 관한 구체적인것을 설정함
		card1.use();
		card2.use();
		card3.use();
		
		
	}

}
