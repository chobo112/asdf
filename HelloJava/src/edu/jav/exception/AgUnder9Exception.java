package edu.jav.exception;

public class AgUnder9Exception extends Exception {
	//
	
	@Override
	public String toString() {
				
		//return super.toString(); 처음만들면 Exception의 toString이 나옴
		return"19세미만 관람불가";
	}

}
