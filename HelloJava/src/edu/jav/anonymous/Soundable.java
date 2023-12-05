package edu.jav.anonymous;
//상수 Public static final 추상메서드만 가능
public interface Soundable {
	
	public abstract String sound();//.
	//sound라는 추상메서드를 적은 순간 구현해야하는 강제성(=override로)
	
	public abstract String name();
}
