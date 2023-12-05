package edu.java;

public class exam5 {

	public static void main(String[] args) {

		for (int i = 5; i>=1; i--) {/*i는 입력을 하고 싶은별의 개수*/
			for(int j=1; j<=i; j++) { /*j는 각줄에 생성되는 별의개수*/
//				i가 5가 들어오면 j값이 1이니까 5가될때까지 1씩 증가하면서 반복됨
				//그리고 마침네 j값이 5가 되는 순간에 작거나 같은순간에 끝남
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
