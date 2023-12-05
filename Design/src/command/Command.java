package command;
//두개의 숫자와 연산자를 입력하면 사칙연살을 하는 프로그램개발
//Command패턴을 활요해서 사친연산의 각 명령(add, sub, multi, dev)을 클래스화 하여 사용

//입출력의 예시
//10 20 +
//결과 : 30
//5 10 *
//결과 : 50
public interface Command {
	public abstract float calc(int i, int j);
	//인트값 2개로 float을 반환하는 calc메서드 => execute로 일반적으로 씀
	//명령을 주는 추상 메서드임
}
