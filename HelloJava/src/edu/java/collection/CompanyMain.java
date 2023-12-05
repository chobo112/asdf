package edu.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompanyMain {
	public static void main(String[] args) {
		Company ABC = new Company("123", "ABC", 100, 200);
		Company DEF = new Company("456", "DEF", 200, 600);
		//각 년도별 회사별 합계 출력
		
		//Map이라는 타입의 map은 hashMap의 객체를 참조함.
		Map<String, Company> map = new HashMap<String, Company>();
		//Map으로 키와 벨류값 설정하고 참조타입까지만 만들어둔 상태
		//키가 스트링인 이유는 : 회사사업자번호로 찾기위함이고
		//Company로 value를 받는 이유는 클래스에 내가 다 정의해 놨으니까
		
		map.put(ABC.getSsn(), ABC);
		map.put(DEF.getSsn(), DEF);
		//일단 map에다가 ABC와 DEF관련된것을 전부 다 때려박음
		System.out.println(ABC); //잘들어갔나 확인
		System.out.println(DEF); //잘들어갔나 확인
		
		//list로 순서대로 값을 넣는거 0 0을 2개 넣어서 2자리 확보해둔거
		List<Integer> list = new ArrayList<Integer>();
		list.add(0); //22년도 수입들이 들어갈곳?공간을 추가한 느낌 index0
		list.add(0); //23년도 수입들이 들어갈곳? 거기를 만들어준느낌 index1
		
		Iterator what = map.entrySet().iterator();
		//?여기 만들어놓은걸 밑에 while문에서 쓰려고?
		//회사 개수만큼 반복함 while구문은
		while(what.hasNext()) {//이게true일때까지 돌린다는건데
			Map.Entry<String, Company> incomSum 
			= (Map.Entry<String, Company>)what.next();
			//기본타입을 참조타입으로 바꿔서 넣기 위함이다??
			
			Company company = (Company) incomSum.getValue();
			list.set(0, list.get(0)+company.getIncome2022());
			list.set(1, list.get(1)+company.getIncome2023());
		}
//		for (int i = 0; i < list.size(); i++) {
//		    Integer in = list.get(i);
//		    System.out.println(/*list.get*/in);
//		} 
		for(Integer in : list) {
			System.out.println(/*list.get*/in);
		//Map.Entry<String/*사업자번호*/, Integer/*22년,23년합계들*/>
		}
	}
	
}
