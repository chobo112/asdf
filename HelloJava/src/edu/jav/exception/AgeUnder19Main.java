package edu.jav.exception;

public class AgeUnder19Main {

	public static void main(String[] args) {
		
		//15세를 지정하고 / 19세 미만이면 문제를 발생시킬겨
		int age = 15;
		
		if(age<19) {
			try {
				//throw는 문제를 발생시킨거
			throw new AgUnder9Exception();
			} catch (AgUnder9Exception ae){
				System.out.println(ae.toString());
				//sysout을 하면 문자열만 출력하기 때문에
				//ae.toString => toString이 자동으로 붙음
				//내가 안썻어도 항상 붙어있던것들이다.
				//만약에 overrider를 안했으면 
			}
			
		}//if문
		//50세이상은 못보게 만들자
		int age2 = 53;
		if(age2>50) {
			try {
				throw new AgeOver50Exception();
			} catch (AgeOver50Exception ao) {
				System.out.println(ao);//toString은 자동입니다
			}
		}
		
	}
	
}
