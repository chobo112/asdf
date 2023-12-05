package exam.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//key값은 문자열 value값은 integer
		map.put("신용권", 30); //set과는 다르게 put으로 넣는구나
		map.put("기용권", 31); //set과는 다르게 put으로 넣는구나
		map.put("신니권", 35); //set과는 다르게 put으로 넣는구나
		map.put("규용권", 30); //set과는 다르게 put으로 넣는구나
		System.out.println("총entry 수 : "+map.size());
		
		
		System.out.println("\t기용권 : "+ map.get("기용권"));
		//즉, get을 하면 기용권을 찾아주고 entry가 한방에 출력됨
		System.out.println();//그냥 한줄 텀준거임
		
		//이걸 해 주는 이우가??뭘까용
		
		
		
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();//구문임
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value =map.get(key);//value는 key로찾아옴
			System.out.println("\t"+key+" : + "+ value);
		}
		System.out.println();
		
		map.remove("홍길동");//key를 통해서 entry 세트로지움
		System.out.println("\t총 entry수 : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		//p574
		
	}

}
