package edu.jav.exception;

public class AgeOver50Exception extends Exception{
	
	@Override
	public String toString() {
		return "50세 이상은 못봐요";
	}

}
