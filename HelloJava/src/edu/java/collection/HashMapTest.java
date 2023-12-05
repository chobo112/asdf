package edu.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		//hashmap의 상위인 map으로 만들어줘야한다.
		Map<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("시과", /*new Interger(100)*/100);
		//오토박싱. 원래는 이렇게 new Interger(100)으로 해야하긴함
		
		map.put("딸기", 2123);
		map.put("바나나", 4000);
		
		System.out.println(map);
		
		//entry에 해당하는 set을 얻은것임
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			//map.entrySet API를 보면 써있는게 있어.
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
		}
		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
		
		//map에서 키만 뽑는 작업
		Set keySet = map.keySet(); //일단 set을 통해서
		Iterator it = keySet.iterator(); //
		try {
		while(it.hasNext()) {
			String nextItem = (String)it.next();
			System.out.println(nextItem);
		}
		}catch(NoSuchElementException nsee) {
			System.out.println("엘리먼트가없음");
		}
		
		
		
		
	}

}
