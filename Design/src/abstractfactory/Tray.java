package abstractfactory;

public abstract class Tray extends Item{
	
	private Item tray;
	//tray가 아이템을 상속받으니까 타입은 Item
	
	public Item getTray() {
		//똑같이 private니까 get만들어줌
		return tray;
	}
	
	
	public abstract void add();
	
	@Override
	public abstract String makeHTML();
}
