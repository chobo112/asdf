package edu.java;

public class Lottery { //로또기계
	//로또기계에는 뭐가 있어야할까? - 1부터 45있어야됨(로또볼)
	//추첨?선택하는거 있어야됨 / 6번만 선택을 해야함
	
	// 로또번호 추첨에 대한 객체화를 해보자 
	LottoBall[] lottoBalls;//로또볼의숫자45까지니까 배열
	
	Lottery(){}//로터리 기본생성자 필요함
	Lottery(LottoBall[] lottoBalls){
		this.lottoBalls = lottoBalls;
		//good은 당첨되면 좋으니까 당첨번호
	} //생성자 1개 일단 생성
	
	
	//메소드를 만들건데/ 로또기계가 하는게 뭐가있어? 섞고 뽑는다.
	//로또볼을 섞는 메소드 void를 할지 return할지
	LottoBall[] shuffle() {//셔플로 섞은 다음에 섞여진 볼을 받을건데..
		//로직구현 해야함 여기서... 
		
		return null;//널을 줘야지 컴파일오류가 안남
	}
	
	
	//로또볼을 하나씩 추출하는 메소드 
	LottoBall getLottoBall(/*int lottoBalls*/) {
		//여기에 로직을 작성..7번째는 보너스번호다.
		
		return null;
	}
	
	//현실에서는 중복을 제거 해서 나옵니다. 그러면 중복체크없애는건 어디서?
	//중복제거는 로터리에서 하자
	//로또볼의 중복여부 체크 = 중복되면 true, 중복안하면 false
	boolean isDuplicate(LottoBall lottoBall) {
		//로직구현
		return false;//임의로 false해놓은거 로직구현해서 바꿔야됨
	}
	
}
