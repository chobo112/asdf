package Template;

public abstract class  AbstractDisplay implements Display{
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		open();
		print();
		close();
		
	}
	
	
	
}
