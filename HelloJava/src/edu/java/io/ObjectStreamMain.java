package edu.java.io;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {
	
	
	public static void main(String[] args) {
		People people = new People("123-123","강대수",28);
		ObjectOutputStream oos = null;
		//out풋 출력할거임 이건 직렬화가 필요함 => 
		
		ObjectInputStream ois = null;
		//이건 객체를 들여올거임 입력할때 객체를 직렬화할거임
		
	}
}
