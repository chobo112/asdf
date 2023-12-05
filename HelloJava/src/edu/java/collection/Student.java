package edu.java.collection;
//이게 기본적인 데이터만들때의 형식
//학생 데이터
public class Student {
//private // 여기서만 볼수있게함 / 캡슐화
	private String sno; // 학번
	private String name; // 성명
	private int kor; // 국어성적
	private int eng; // 영어성적
	private int math; // 수학성적

	public Student() {// ctrl space 누르면 기본생성자 만들어짐
	}
//5자리 생성자를 만들면 객체를 만들면 이렇게 쓰겟구나 하는거임
	public Student(String sno, String name, int kor, int eng, int math) {
		super(); //5가지 모두 포함한 생성자
		this.sno = sno;//학번
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//게터 세터 하는법
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", " 
	+ "kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

}
