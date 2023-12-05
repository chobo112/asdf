package edu.java;

public class MyCellPhoneMain {
	public static void main(String[] args) {
		MyCellPhone my = new MyCellPhone("강대수", "친구"); //non static
		
		System.out.println("이름 : " + my.name +"\n"+ "관계 : "+ my.relationship);
		
		MyCellPhone myfamily = new MyCellPhone("이소X", "어머니");
		System.out.println("");
		System.out.println("이름 : "+ myfamily.name +"\n"+"관계 : "+myfamily.relationship);
		
		MyCellPhone girlFriend = new MyCellPhone("권현X", "여자친구","11/04");
		System.out.println("");
		System.out.println("이름 : " + girlFriend.name +"\n"+ "관계 : "+ girlFriend.relationship+"\n"+"데이트날짜: " + girlFriend.date);
		
		}
	}
	

