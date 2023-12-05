package edu.java;

//public class Perso {//person이어야 함 이건 이해를 쉽게하기위한 설명으로 만든거
//	static int[] si = {1, 2, 3};
//	int[] nsi = {4, 5, 6};
//	String name = "hong";
//	int age = 30;
//	public static void main(String[] args) {
//		int i = 3;
//	}
//
//}

public class Perso {
    int age = 30;

    public static void main(String[] args) {
        Perso person1 = new Perso();
        Perso person2 = new Perso();

        System.out.println(person1.age); // 30
        System.out.println(person2.age); // 30

        person1.age = 40;
        System.out.println(person1.age); // 40
        System.out.println(person2.age); // 40 (같은 클래스 변수를 공유하므로 값이 변경됨)
    }
}
