package edu.java.collection;

public class Company {
	private String ssn;    //사업자 번호
	private String name; //회사명
	private int income2022; //22년도수입 
	private int income2023; //23년도수입 
	//기본생성자
	public Company() {
	}
	public Company(String ssn, String name, int income2022, int income2023) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.income2022 = income2022;
		this.income2023 = income2023;
	}
//위에가 생성자
	
	//여기서부터는 get set터 메소드
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
	public int getIncome2022() {
		return income2022;
	}
	public void setIncome2022(int income2022) {
		this.income2022 = income2022;
	}
	public int getIncome2023() {
		return income2023;
	}
	public void setIncome2023(int income2023) {
		this.income2023 = income2023;
	}
	
	@Override
	//toString으로 받는 이유는 내가 보기 편함?을 위해서?
	//객체를 문자열로 받기 위해서 toString
	public String toString() {
		return "company [ssn=" + ssn + ", name=" + name + ", "
				+ "income2022=" + income2022 + ", "
						+ "income2023=" + income2023
				+ "]";
	}
	
	
	
}
