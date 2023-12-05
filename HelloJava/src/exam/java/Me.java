package exam.java;

public class Me extends Mom{
	String name;
	String stat;
	String value;
	
	Me(){}
	Me(String name, String value){
		this.name = name;
		this.stat = stat;
	}
	Me(String name,String stat, String value){
		this.name = name;
		this.stat = stat;
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return this.name + "는 어머니에게 상속받았고 \n" +  
				"상속받은 아들의 나이는 : " + this.stat  + 
				 this.value;
	}
}
