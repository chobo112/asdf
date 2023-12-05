package factorymetodframework;

public abstract class examFactory {
	public final examProduct create(String owner) {
		examProduct P = createProduct(owner);
		registerProduct(P);
		return P;
	}
	protected abstract examProduct createProduct(String owner);
	protected abstract void registerProduct(examProduct examProduct);
	
}
