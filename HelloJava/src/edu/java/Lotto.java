package edu.java;

import java.util.Scanner;

public class Lotto {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int lottoCount = 6; //
      int userLotto[] = new int[lottoCount];//userlotto[] = int[6] 
      int pcLotto[] = new int[lottoCount];  //유저로또라는 배열은 숫자배열, index값6개를 가진다는 말
      //즉, 피시로또는 메인메소드 안에 있으니까 변수는 스택이지만 값을 참조하는 부분은 힙영역임. 따라서 변수의 값은 힙에 있다.
      int bonusNumber;

      // 사용자 입력창 생성
      System.out.println(" 1~45까지의 중복 되지 않는 6개의 로또 번호를 입력하시오 ");
      for (int i = 0; i < userLotto.length; i++) {//6개
         System.out.print(" 로또번호 " + (i + 1) + " : ");//0부터니까 로또번호 1 : ~로또번호 6:은? 생성
         userLotto[i] = scanner.nextInt();
      }

      // PC 로또 번호 생성
      for (int i = 0; i < lottoCount; i++) {
         pcLotto[i] = (int) (Math.random() * 45) + 1;
      }

      // 보너스 로또 번호 생성
      bonusNumber = (int) (Math.random() * 45) + 1;

      // 사용자가 입력한 로또 번호 출력
      System.out.print(" 사용자가 입력한 로또 번호 : ");
      for (int i = 0; i < lottoCount; i++) {
         System.out.print(userLotto[i] + " ");
      }

      // PC가 입력한 로또 번호 생성
      System.out.println(); // 줄 바꿈
      System.out.print(" PC가 생성한 로또 번호 : ");
      for (int i = 0; i < lottoCount; i++) {
         System.out.print(pcLotto[i] + " ");
      }

      // 보너스번호 출력
      System.out.println(); // 줄 바꿈
      System.out.println(" 보너스 번호: " + bonusNumber);

      // 맞춘 번호 개수 계산
      int matchCount = 0;
      for (int i = 0; i < lottoCount; i++) {
         for (int j = 0; j < lottoCount; j++) {
            if (userLotto[i] == pcLotto[j]) {
               matchCount++;
            }
         }
      }

      System.out.println(" 맞춘 번호 개수: " + matchCount);

      switch (matchCount) {
      case 6:
         System.out.println(" 헉! 1등 당첨! 축하합니다! ");
         break;
      case 5: // 보너스 번호와 사용자 번호중 하나라도 같을시 2등 당첨 아닐시 3등
         if (bonusNumber == userLotto[0] || bonusNumber == userLotto[1] || bonusNumber == userLotto[2]
               || bonusNumber == userLotto[3] || bonusNumber == userLotto[4] || bonusNumber == userLotto[5]) {
            System.out.println(" 2등 당첨! 잠 못자! ");
         } else {
            System.out.println(" 3등 당첨! 까비.. ");
         }
         break;
      case 4:
         System.out.println(" 4등 당첨! ");
         break;
      case 3:
         System.out.println(" 5등 당첨! ");
         break;
      default:
         System.out.println(" 꽝입니다. 다음 기회에! ");
      }

      scanner.close();

   } // main

} // class