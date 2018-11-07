package studyInheritance;

/* 추상(Abstract)
 *  : 실체 간에 공통되는 특성을 추출한 것
 * 
 * 실체 클래스 - 객체를 직접 생성할 수 있는 클래스
 * 추상 클래스 - 클래스들의 공통적인 특성을 추출해서 선언한 클래스
 * - 추상 클래스와 실체 클래스는 상속의 관계를 가지고 있다.
 *  추상 클래스가 부모이고 실체 클래스가 자식으로 구현되어 실체 클래스는 추상 클래스의 모든 특성을 물려받고, 추가적인 특성을 지닌다.
 *  
 * 추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없다.
 * -> 추상 클래스는 new 연산자를 사용해서 인스턴스를 생성시키지 못한다.
 * 
 * 추상 클래스를 만드는 이유?
 * 1. 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
 * 2. 실체 클래스를 작성할 때 시간을 절약
 *  -> 동일하게 사용해야하는 내용을 추상 클래스에 만들어두고 상속받으면 사용가능하기에...
 * 
 * public abstract class 클래스 {...}
 * */
public class StudyAbstract {
	public static void main(String[] args) {
		
		//추상 클래스는 new 연산자를 사용해서 인스턴스를 생성시키지 못한다.
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("User001");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}//end of main
}//end of class

abstract class Phone {
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

class SmartPhone extends Phone{
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