package prototypeframework;

public interface Product {
	
	public abstract void use();
	
	public abstract Object createClone() throws CloneNotSupportedException;
	//Object를 반환하는거... 클론을 복제하면 제일 최상위인 객체로 받자
	//.clone이 애초에 객체를 복사함
	
}
