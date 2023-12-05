package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListex {
	
	public static void main(String[] args) {

	List<String> list = new ArrayList<String>();
	//제네릭 String을 줘서 타입을 String으로 제한 / List가 상위,ArrayList가 하위
	list.add("Java");
	list.add("JDBC");
	list.add("Servlet/JSP");
	list.add(2, "Database");
	//위에거는 add의 다른형태로 int string으로 받는게 들어간듯
	list.add("iB/ATIS");
	
	int size = list.size();
	System.out.println("총 개수 : "+size);
	System.out.println();
	
	String skill = list.get(2);
	System.out.println(skill);
	
	for(int i = 0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i+ ":" + str);
	}
	System.out.println();
	list.remove(2);
	list.remove(2);
	list.remove("iB/ATIS");
	System.out.println(list);
	}
	
	
}
