package edu.java;

//로또의 로직을 가진 클래스
public class LottoLogic {
	//재료는? 컴퓨터가 뽑은 로또번호7개와 사용자가 입력한 로또번호 7개
	LottoBall[] comNums;//컴퓨터가 뽑은거
	LottoBall[] userNums;//사용자가 뽑은거
	
	LottoLogic(){//기본생성자는 그냥 만들고 보자
	}
	
	LottoLogic(LottoBall[] comNums, LottoBall[] userNums){
		this.comNums=comNums;
		this.userNums=userNums;
	}
	
	//순위를 연산
	int getRank() {
		//순위 연산 로직
		return 0;
	}
	
	

}



