package builder;

public class TextBuilder extends Builder {
	// 스레드 환경이면 Buffer를 하고, 스레드가 아니면 String Builder를 쓰자.
	StringBuilder sb = new StringBuilder();
	@Override
	public void makeTitle(String str) {
		sb.append("타이틀은 타이틀이다.");
	}
	@Override
	public void makeString(String[] strs) {
		for (String add : strs) {
			sb.append("이거나");
			sb.append("추가를");
			sb.append("하라고");
			sb.append("추가했니?");
		}
	}
	@Override
	public void makeItems(String str) {
		sb.append("item을");
		sb.append("뭐라고");
		sb.append("정의를");
		sb.append("똑바로해라!");
	}
	@Override
	public void getResult() {

	}

}
