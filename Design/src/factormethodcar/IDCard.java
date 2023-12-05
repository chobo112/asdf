package factormethodcar;

import factorymetodframework.examProduct;
//Product클래스를 실제로 구현한 구현클래스 따라서 Product라는것을 실제로 만든 구체화된 상품인
//IDCard를 여기서 만드는거임
public class IDCard extends examProduct{
	private String owner;
	IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "[IDCard: " + owner + "]";
	}
	public String getOwner() {
		return owner;
	}
	@Override
	public void use() {
		System.out.println(this + "을 사용합니다.");
	}
}
