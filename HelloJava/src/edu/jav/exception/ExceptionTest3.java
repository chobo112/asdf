package edu.jav.exception;

public class ExceptionTest3 {
	
	public static void main(String[] args) {
		try {
			a();//메서드 a를 호출함
		} catch (NumberFormatException nfe) {
			System.out.println("예외발새애앵");
			nfe.printStackTrace();
		}
		
	}
	
	public static void a() throws NumberFormatException{
		b();
	}
	public static void b() throws NumberFormatException{
		int i = Integer.parseInt("천");
		//위에 a에게 던짐. throws =>나를 호출한 애한테
	}
}
