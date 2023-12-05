package exam.java.constructor;
	
public class Carexer extends Car{
	
	
	public Carexer(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Car m = new Car("진회색", 75);
		System.out.println(m);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
