package edu.java;

public class MyCellPhone {  //핸드폰은 번호가 있어야하고, 가족,친구들 번호만 있는걸로
	static int number = 0; //스택틱맴버변수
	String name;   //논스택틱 맴버변수1
	String relationship; //논스택틱 맴버변수2
	String date;
	
	MyCellPhone() {}//기본생성자
	
	MyCellPhone(String n, String r) {//생성자1
		name = n;
		relationship = r;
	}
	MyCellPhone(String n, String r, String d){//생성자2
		name = n;
		relationship = r;
		date = d;
	}
	
	MyCellPhone(int number){
		this.number = number;//?
	}
}
