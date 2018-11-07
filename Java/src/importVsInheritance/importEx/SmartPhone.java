package importVsInheritance.importEx;

public class SmartPhone extends Phone{
	//Constructor
	public SmartPhone() {}
	public SmartPhone(String owner) {
		super(owner);
	}
	//Method
	public void internetSearch() {
		System.out.println("[User]Surf the Internet");
	}
}//end of SmartPhone class