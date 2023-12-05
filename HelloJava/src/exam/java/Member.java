package exam.java;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			//만약에 오브젝트가 맴버이면?  하위형변환을 해라
			return member.name.equals(name)&&(member.age==age);
			//String으로 필드정한것들이 값이 같으면(객체가 같으면아 아니고 value)
		}else
			return false;
	}
	
	@Override
	public int hashCode() { // name과 이름이 같으면 동일한 해휘코드내놔
		return name.hashCode() + age;
	}
	
	

}
