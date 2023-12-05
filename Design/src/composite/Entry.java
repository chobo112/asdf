package composite;

public abstract class Entry {
	
	String Name;//여기만들면 file이랑 Directory에 있음
	
	abstract String getName();
	
	abstract long getSize();
	
	abstract void PrintList();

	
}
