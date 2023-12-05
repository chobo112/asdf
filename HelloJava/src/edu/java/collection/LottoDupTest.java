package edu.java.collection;

import java.util.HashSet;
import java.util.Set;

public class LottoDupTest {
	
	public static void main(String[] args) {
		//밑에 메서드에서 num에 담긴 랜덤숫자 7개가 noDup7num에 담긴다.
		System.out.println(noDup());
	}
	//1부터 45중에서 중복되지 않는 7개의 숫자를 리턴
	static Set<Integer> noDup() {
		Set<Integer> set = new HashSet<Integer>();
		while (true) {//num의 사이즈가 7보다 작을때
           set.add((int) (Math.random() * 45) + 1);//로또번호는 1부터 45까지의 정수
           if(set.size()==7) break;
		}
		return set;
		
// for문으로 하는경우에는 if로 주고. num.add(lottoNum)은 = 7을 의미함		
//		for (int i = 0; i < 7; ) {
//            int lottoNum = (int) (Math.random() * 45) + 1;
//            if (num.add(lottoNum)) {
//                System.out.println(lottoNum);
//                i++; // 중복이 아닐 경우에만 카운트 증가
//            }
//        }
		
		
	}//랜덤번호 뽑는거고
	
}
