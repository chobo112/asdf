package edu.java.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		//HashSet 상위인 Set을 만든다.
		
		set.add("사과1");
		set.add("사과2");
		set.add("사과3");
		System.out.println(set);
		//set.first가 안되는 이유는 set은 랜덤이기때문니까 순서가 없쥬
		SortedSet<Integer> sor = new TreeSet<Integer>();
		//소티드 셋도 인터페이스니까 하위에 상속받는 애들로 하면 됨
		//set은 순서가 없지만 SortedSet을 이용해서 순서를 주는것임
		sor.add(1);
		sor.add(2);
		sor.add(3);
		sor.add(4);
		sor.add(5);
		
		System.out.println(sor);
		
		System.out.println(sor.first()); //첫번째거를 꺼내는것
		
		
		
	}

}
