package edu.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentMain {
	
	public static void main(String[] args) {
		Student hong = new Student("201212436","홍박사",100,90,80);
		hong.setKor(95);//아 홍의 점수 95점 이었구나 하고 내가 바꿔준거
		//hong.Kor(); 안되는 이유는 아까 private로 했기때문에 바로점수는 못가져오고
		hong.getKor();//여기서 메서드안에서 넣는 국어점수는 가져올수 있음
		Student kang = new Student("201412586","홍박사",100,50,50);
		//System.out.println(hong.getKor());
		//1. 두 학생의 데이터를 Collection으로 만들어서 국영수 각 점수의 평균을 출력
		Map<String, Student> map = new HashMap<String, Student>();
		//key는 학번을 쓸거임=String, 
		//Student는 전부를 넣은거임 새성자에 보면 5개 
		//sno(학번)부터 math까지 전부넣은걸 가져오겠다는말임
		map.put(hong.getSno(), hong);
		//key는 학번(hong.getSno로 학번을 가져옴, but private니까 메서드로 호출함
		map.put(kang.getSno(), kang); 
		//hong, kang에는 모든것이 들어가있음
		
		//평균을 넣을 배열
		List<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(0);
		al.add(0);
		//각 리스트들의 첫번째부터 3번째 값을 0 으로 세팅한것임 = al의 공간마련함
		Iterator it = map.entrySet().iterator();
		//위에 Map<String,Student> map = new넣은부분이 있음. 거기의 엔트리를 반복하겠다.
		while(it.hasNext()) {
			Map.Entry<String, Student> entry //it을 넣어주기위한 변수entry
			= (Map.Entry<String, Student>)it.next(); 
			//next();는 iterator 인터페이스에 있음
			//형변환을 해주는 이유는 next는 iterator에 잇고, 
			//해당 iterator의 타입으로 반환을 해줌
			Student student = (Student) entry.getValue(); 
			//value에 해당하는 Student클래스임. getValue에서 뽑음 
			//map.Entry에 있었음.
			
			al.set(0, al.get(0)+student.getKor());
			//0으로 세팅한뒤에 각 해당하는 학생들의 국어점수를 여기다가 세팅한거
			al.set(1, al.get(1)+student.getEng());//0으로 세팅한뒤에 각 해당하는 학생들의 영어점수를 여기다가 세팅한거
			al.set(2, al.get(2)+student.getMath());//0으로 세팅한뒤에 각 해당하는 학생들의 수학점수를 여기다가 세팅한거
			
		}
		for(Integer in : al) {
			System.out.println(/*al.get*/in/map.size());
		}
		
		
		
		
	}
	
	
	
	

}
