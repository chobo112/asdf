package exam.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMain {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//상위로 받아라
		
		set.add("1번이다임마");
		set.add("2번이다임마");
		set.add("3번이다임마");
		set.add("4번이다임마");
		set.add("5번이다임마");
		set.add("6번이다임마");
		
		int size = set.size();//저장된 객체수 얻기 위에갯수
		//System.out.println(size);//이거 하면 6개 나옴
		
		Iterator<String> iterator = set.iterator();//반복자 그냥 루틴이다
		while(iterator.hasNext()) {//안녕 이터야 너 거거이써?/
			String element = iterator.next();
			//이름은 요소고 1개 가져온다음에 다음놈 오세요
			System.out.println("\t"+element);
			//set은 랜덤이고 아무튼 6개가 나옴
		}
		
		set.remove("2번이다임마");
		System.out.println(set); //랜덤이지만 2번이다임마는 사라져있음
		System.out.println("총 객체의 수 인트로해놓음 " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {//와일문에거에 set넣을거임
			System.out.println(element); //이것도 5개나오는데 그냥 for문으로 한듯
		}
		
		set.clear();//다꺼져
		if(set.isEmpty() ) {System.out.println(set);}
		//만약에 set이 다 비워진게 true면 set출력해라
		
	}

}
