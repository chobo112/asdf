package edu.java;

public class Car2 { //오버라이딩의 이해를 돕자
	
	String name = "포르쉐";
	int tireCount = 4;
	
	@Override
	 public String toString() {
		 //이거는 오브젝트에있는 toString의 시그니쳐를 복붙함
		return this.name+"차량이며 바퀴가 "+
				 this.tireCount + "개 입니다!";
	 }
	
	
	
	
}
