
public class test {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		for(int i = 1; i<=100000; i++) {
			System.out.println(i);
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println(after-before);
		
		
		//System.out.println(System.currentTimeMillis());
	}
}