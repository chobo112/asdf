package edu.java;
//*별 모양 피라미드로 만들기
//       *
//     ****
//   *****
//  *******
// *********
//
//
public class exam6 {

	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) { //1 2 3 4 5
			System.out.println("");
			
			for (int j = 4; j >=i; j--) { //4 3 2 1
				System.out.print("0");
			}
			
			for(int k = 1; k<=(i*2)-1; k++) {//1 3 5 7 9
				System.out.print("*");
			}

			

		} 

}
}




// i줄   j줄    공백  공백은 딱 반로 잘라서 생각 뒷공백은 생각하지말고 앞공백만 생각하고 밀면 되는거임
//                2                *
//                1              ***
//                0             *****
//                1              ***
//                2                *
