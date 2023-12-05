package edu.java.io;

import java.io.Serializable;

//직렬화를 해보자
public class People implements Serializable {
	// Serializable이 1번 그리고 아이디 주기
	public static final long serialVersionIDUID = 123589798788979L;

	private String ssn;
	private String name;
	private int age;

	public People() {// 기본생성자
	}

	public People(String ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "People [ssn=" + ssn + ", "
				+ "name=" + name + ", age=" + age + "]";
	}

}
