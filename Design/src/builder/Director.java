package builder;

public class Director {
	
	static Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("오늘은 추움");
		builder.makeString(new String[] {"String이 뭔데",
				"날씨가 추워서 졸림", " 손난로 가져올걸"});
		builder.makeItems("아이템이랑 String이 말이되냐 구분좀 잘하자");
	}
	
}
