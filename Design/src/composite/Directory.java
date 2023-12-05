package composite;
//여기 extends Entry가 is a 관계가 됨
public class Directory extends Entry{
	//has a 관계+is a관계를 다 만족시키는 관계임 
	//Entry를 가지고있음
	Entry entry;//이것만으로 has a관계를 알수가 있음
	/*public Directory(Entry entry) {
		this.entry = entry;
	}*/
	
	
	@Override
	String getName() {
		return "";
	}
	@Override
	long getSize() {
		return 0L;
	}
	@Override
	void PrintList() {
	}
	
	void add() {
		
	}
	
}
