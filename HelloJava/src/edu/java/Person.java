package edu.java;

//public class Person {
//   
//   static int si = 1;
//   int nsi;
//   String name;
//   
//   String getName() {
//      return this.name;
//   }
//   
//   void setName(String name) {
//      this.name =name;
//   }
//
//   int getNsi() {
//      return this.nsi;
//   }
//   void setNsi(int nsi) {
//      this.nsi =nsi;
//   }
//   
//   int getSi() {
//	   return this.si;
//   }
//   
//   void setSi(int si) {
//	   this.si =si;
//   }
//   
//}
public class Person {
	int age;
	int birth;
	int height;
	int weight;
	String name;
	//사람이라고 생각하면 무엇이 필요할까요?
	public Person() {};//기본생성자는 무조건 적어주자
	
	public Person(int age, int birth) {//생성자1 나이와 생일만
		this.age=age;
		this.birth = birth;
	}
	
	public Person (String name , int height, int weight) {
		//생성자2 나머지것들인 이름 몸무게 키를 적어주자
		this.name=name;
		this.height = height;
		this.weight = weight;
		
	}

}


