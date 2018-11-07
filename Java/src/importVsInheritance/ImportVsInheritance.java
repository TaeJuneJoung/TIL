package importVsInheritance;

//동일한 패키지에 없다면 import 위치 쓰여짐
import importVsInheritance.importEx.Phone;

/* Import와 Inheritance의 차이점?
 * 상속은 이전에 배웠듯 부모의 것들을 가지고 쓸 수 있다.
 * import는 이러한 속성이 아닌,
 * 가지고 있는 것을 불러와서 쓰는 격.
 * 
 * 아래 예시를 보면
 * SmartPhone은 Phone의 자식 클래스이다.
 * SmartPhone은 부모 클래스 Phone의 요소들을 가지고 와서 쓸 수 있다.
 * 
 * import를 Phone으로 했을 경우,
 * SmartPhone의 요소는 사용할 수 없다.
 * SmartPhone을 import 해서 사용하면 되지 않느냐?
 * ->SmartPhone을 import하면 된다. 그렇지만 SmartPhone이 Phone을 상속받기에 가능한 것
 * import와 상속은 유사하면서도 확연히 다르다.
 * 다른 것에 속성을 이용하는 점에서는 같지만, 상속은 부모가 가진 것을 물려 받아 사용할 수 있다.
 * 
 * 이제, 상속(Inheritance)에서 extends와 implements의 차이를 보자.
 * 흔히 알고 있는 차이는 extends는 클래스를 상속하는 것이고, java에서는 단 1개만 상속할 수 있다.(c++, 코틀렌... 2개 이상 가능)
 * implements는 인터페이스를 상속하는 것이고, 2개 이상 가능하다.
 * 
 * 차이점이 드러나는 것은 클래스와 인터페이스의 차이점이다.
 * 이제 인터페이스를 다룰 예정이니 차이점에 대해서 알아보자.
 * */

public class ImportVsInheritance {
	public static void main(String[] args) {
		Phone phone = new Phone();
		//Phone Field 접근
		String str = phone.owner;
		//Phone Method 접근
		phone.turnOn();
		phone.turnOff();
		

	}//end of main
}//end of class