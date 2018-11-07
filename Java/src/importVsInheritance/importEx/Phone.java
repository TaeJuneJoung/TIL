package importVsInheritance.importEx;

public class Phone {
	//Field
	public String owner;
	//Constructor
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	//Method
	public void turnOn() {
		System.out.println("[System]전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("[System]전원을 끕니다.");
	}
}//end of Phone abstract class
