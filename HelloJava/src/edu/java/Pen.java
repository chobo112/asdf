package edu.java;

public class Pen { //여기다가 추상화랑 상속할거면 하면 됨
	
	String manufactureCompany;//모든팬들은 제조사가 있음
	String sort;//종류
	String colorName; // 색상
	int price; //가격(21억이하일거니까)
	
	Pen(){}//생성자는 클래스명과동일, 기본생성자는 필수로 만들어라
	
	Pen(String manufactureCompany, String sort,
			String colorName, int price){//위의 4개 전부 가능한생성자
		this.manufactureCompany = manufactureCompany;
		this.sort=sort;
		this.colorName = colorName;
		this.price = price;
	
	//3개 2개 하나 만들어도 되긴함.. 이제 생성자 만들었으니까 메소드를 만들어야함	
		}
	//String getPenData(Pen pen) {//Pen타입의 pen데이터를 받을거야 @관련된 데이터를 가져오는 메소드
		//팬타입으로 팬을 받으면 되고 / 이렇게 쓰기 싫으면 this를 써줘도 된다.
		//여기다가 쓴 이유는 위의 4개를 한방에 넣는느낌으로 하는거.
	//}
	String getPenData() {//이게 메소드
		String resultStr = "이 펜의 제조사는 " +this.manufactureCompany
				+ ", 종류는 " + this.sort
				+ ", 색상은 " + this.colorName
				+ ", 가격은 " + this.price;
		return resultStr;
	}

}
