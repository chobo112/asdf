package exam.java;

import java.util.HashSet;
import java.util.Set;

//member랑 셋트임
public class HashSetMain {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		//상위로 받고 타입은 맴버로만 받는다. 해쉬는 set아래사람

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		//동일한거는 set이니까 1개만 저장됨
		set.add(new Member("채승기", 29));
		System.out.println(set);
	}
}
