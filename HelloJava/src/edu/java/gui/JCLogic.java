package edu.java.gui;

public class JCLogic {
	
	static String content = "";
	static String operator = "";
	
	float calc(String content) {
		String prev = content.substring(0, content.indexOf(operator));
		//content(내가 계산기에서 누른것들)의 0번째index = 시작점부터
		//content의 indexof(문자열추출)=>operator를 누른시점까지의 문자열을 추출해서 prev에 담음
		String next = content.substring(content.indexOf(operator)+1);
		//indexOf는 내차례에 멈추니까 +1을 해서 operator다음문자열부터는 next로 담는다는것
		if ("+".equals(operator)) {//"+"라는 문자열과 내가 누를 오페레이터가+인경우 같을떄
			return Float.parseFloat(prev) + Float.parseFloat(next);
			//prev를 내가 파라세인트처럼 파라세플롯 => 실수로 반환해준다.앞에 Float은 문자열을 소수로 형변환
		} else if ("-".equals(operator)) {
			return Float.parseFloat(prev) - Float.parseFloat(next);
		} else if ("*".equals(operator)) {
			return Float.parseFloat(prev) * Float.parseFloat(next);
		} else if ("/".equals(operator)) {
			return Float.parseFloat(prev) / Float.parseFloat(next);
		} else {
			return 0;
		}
	}

}
