package edu.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		//상위타입인 List로 받아라
		
		al.add("ㅇㅇ");
		al.add("ㅋㅋ");
		al.add("ㅎㅎ");//al리스트에 1개씩 추가한거임
		
		System.out.println(al);
		int alSize = al.size();
		for(int i= 0; i<alSize; i++) {
			
		}
		
		al.clear();
		System.out.println(al);
		
		List<Integer> abc = new ArrayList<Integer>();
		
		abc.add(1);
		abc.add(2);
		System.out.println(abc);
		
		abc.size();
		System.out.println(abc.size());
		
		abc.lastIndexOf(2);
		System.out.println(abc.lastIndexOf(2));
		
		
		
	}
	
	
	
}
