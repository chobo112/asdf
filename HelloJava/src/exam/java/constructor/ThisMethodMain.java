package exam.java.constructor;

public class ThisMethodMain {
	public static void main(String[] args) {
		ThisMetohdConstructor tmc = new ThisMetohdConstructor();
		System.out.println(tmc.Company);
		
		
		System.out.println("@@@@@@@@@@2번쨰 생성자@@@@@@@@");
		ThisMetohdConstructor tmc2 = new ThisMetohdConstructor("모닝", "빨강");
		System.out.println(tmc2.Company+"     "+tmc2.color);
		
		
		System.out.println("@@@@@@@@@@3번쨰 생성자@@@@@@@@");
		ThisMetohdConstructor tmc3 = new ThisMetohdConstructor("소울","검정",120);
		System.out.println(tmc3.Company);
		System.out.println(tmc3.color);
		System.out.println(tmc3.maxSpeed);
		
		
	}

}
