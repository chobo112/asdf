package abstractfactory;

//item을 가지고있음 => 생성자로 가지자
public abstract class Page extends Item{
	
	private String title;
	private String author;
	private String content;
	//해당필드의 getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
	}
	
	private Item item;
	public Item getItem() {
		return item;
	}
	/*public Page(Item item) {//아이템을 가지자.
	}*/
	
	/*public*/ void add() {
		
	}
	
	/*public*/ void output() {
		
	}
	@Override
	public abstract String makeHTML();
	
}
