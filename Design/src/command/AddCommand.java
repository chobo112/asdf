package command;
//이건 명령임 //커맨드 1개당 4개의 클래스가 필요함


public class AddCommand implements Command{
	
	@Override
	public float calc(int i, int j) {
		return i+j;
	}
	
	
}
