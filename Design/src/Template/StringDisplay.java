package Template;


public class StringDisplay extends AbstractDisplay{
	String str;
	public StringDisplay(String str) {
		this.str = str;
	}
	public void open() {
		System.out.println("+==========+");
	}
	public void print() {
		for (int i = 0; i<=4; i++) {
			System.out.println(str);
		}
	}
	public void close() {
		System.out.println("+==========+");
	}
	
}
