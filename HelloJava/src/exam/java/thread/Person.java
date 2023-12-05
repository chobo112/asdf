package exam.java.thread;
//동기화 연습-은행계좌
public class Person {

	private String name;
	private Account account;
	
	public Person() {//기본생성자는 내가만들어야됨
	}
	public Person(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
