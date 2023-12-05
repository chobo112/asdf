package adapter;
//위임하는 방법
public class PrintAdapter2 implements Print {

	StringPrinter sp;
	
	@Override
	public void print() {
		sp = new StringPrinter();
		sp.printInfo();
		
	}
}
