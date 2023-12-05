package edu.java.io;

import java.io.Serializable;

public class Person implements Serializable{
	//직렬화 필수!!implements Serializable!!
	public static final long serialVersionUID = 4465494815616516L;
	//롱값은 그냥 내가 막 숫자 대충 친거임
	private String ssn; 	 //주민번호
	private String name;	 //이름
	private int age;			//나이
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", "
				+ "name=" + name + ", "
						+ "age=" + age + "]";
	}
	//생성자
	public Person() {//기본생성자
	}
	public Person(String ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	//밑에 게터 세터
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
