package edu.jav.exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		
		//String str1 = "1000";
		String str1 = "천";
		int i1 = 10;//지역변수는 초기화해야함
		
		Object obj = null;
		
		try {
			System.out.println(obj.hashCode());
			i1 = Integer.parseInt(str1);//위에 문자 =""를 숫자로 받을게
		}
			catch(NumberFormatException nfe) {//Exception ec해도 되지만 더 세밀하게하려고
				System.out.println(nfe);
		} 
			catch(NullPointerException npe) {
		}
			catch(Exception ex) {
				System.out.println(ex);
		}
		finally {
		System.out.println(i1*2); //2000을 출력하고 싶엉...
		}
		//System.out.println(i1*2); (finally에 묶이던 여기서 쓰던 같음)
		
	}//main

}//class
