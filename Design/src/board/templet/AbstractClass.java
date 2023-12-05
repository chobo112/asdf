package board.templet;

public abstract class AbstractClass {
	
	public abstract void printTop();
	public abstract void printMiddle();
	public abstract void printBottom();
	
	public void printList() {
		printTop();
		printMiddle();
		printBottom();
	}
	
}
