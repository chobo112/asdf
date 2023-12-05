package abstractfactory;

public abstract class Factory {
	
	//싱글톤임 factory는 1개만 됨
	private static Factory factory;
	private Factory() {
	}
	private static Factory getFactory() {
		return factory;
	}
	
	public abstract Link createLink(); 
	
	public abstract Tray createTray();
	
	public abstract Page createPage();
	
	
}
