package edu.java;

import java.util.ArrayList;

public class TypeCastingMain2 {
	
	public static void main(String[] args) {
		
	
	ArrayList<Object> al = new ArrayList<Object>();
	//객체들의 리스트를 만드는 것. 즉 오브젝트를 담는 통인 어레이리스트=클래스(배열아님)
	al.add(new Parent());//객체 전부 다담김
	al.add(new Child()); 
	//상위형변환/오브젝트 올자리에 child가 옴 작은게 큰것으로 바뀜(상위형변환)
	
	/*Parent parent = (Parent) al.get(0); 
	//첫번째로 넣음. 꺼낼때는 하위로 꺼내야하니까 원래타입 붙여줌
	Child child = (Child) al.get(1);*/
	//두번째로 넣었으니 index값이 1
	
	//근데 정말 모르겠다??
	Object parent = al.get(0);
	Object child = al.get(1);
	
	System.out.println(parent); //이렇게 출력하는 객체참조값 16바이트가 나옴
	

	
	}
	
	
	
	
}
