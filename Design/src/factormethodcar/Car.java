package factormethodcar;

import factorymetodframework.Product1;

public class Car extends Product1 {

	private String carName;
	
	public Car(String carName) {
		this.carName = carName;
	}
	
	@Override
	public void use() {
		System.out.println(carName + "자동차가 사용됨");
	}

}
