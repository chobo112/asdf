package Facade.pagemaker;

public class OddState implements State {

	private static OddState oddState = new OddState();

	private OddState() {
	}

	public static State getInstance() {
		return oddState;
	}

}
