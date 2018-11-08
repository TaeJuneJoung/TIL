package studyInterface;

/* Interface : 객체의 사용 방법을 정의한 타입
 * 인터페이스는 객체의 교환성을 높여주기 때문에 다형성을 구현하는 매우 중요한 역할
 * Java8의 람다식은 함수적 인터페이스의 구현 객체를 생성하기 때문에 중요성이 더욱 커짐
 * 
 * 인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역할
 * 개발 코드가 인터페이스의 메소드를 호출 -> 인터페이스는 객체의 메소드 호출
 * 그렇기에 개발 코드는 객체의 내부 구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 된다.
 * 
 * [public] interface 인터페이스명 {...}
 * #인터페이스 구성 멤버
 *  - 상수(변수명 대문자로 적을것)
 *   : public static final의 특성을 갖는다. <ㅡ 생략하여도 자동적으로 컴파일 과정에서 붙게 됨
 *    인터페이스 상수는 static {} 블록으로 초기화할 수 없기 때문에 반드시 선언과 동시에 초기값을 지정해야 한다.
 *  - 추상 메소드
 *   : 리턴 타입, 메소드명, 매개 변수만 기술되고 중괄호 {}를 붙이지 않는 메소드
 *    public abstract의 특성을 갖는다. <- 생략하더라도 자동적으로 컴파일 과정에서 붙게 됨
 *  - 디폴트 메소드		//java8부터 추가됨
 *    [public] default 리턴 타입 메소드명(매개변수,...){...} 
 *  - 정적 메소드		//java8부터 추가됨
 *   : 형태는 클래스의 정적 메소드와 완전 동일
 *    public 특성을 갖는다 <- 자동적으로 컴파일 과정에서 붙게 됨 
 *   [public] static 리턴 타입 메소드명(매개변수,...){...}
 *   
 * 개발코드 -> 인터페이스 메소드 호출 -> 인터페이스는 객체의 메소드 호출
 * 
 * #추상 메소드의 실체 메소드를 작성하는 방법
 *  - 메소드의 선언부가 정확히 일치해야 한다.
 *  - 인터페이스의 모든 추상 메소드를 재정의하는 실체 메소드를 작성해야 한다.
 *   -> 일부만 재정의할 경우, 추상 클래스로 선언해야 하며 abstract 키워드를 붙여야 한다.
 *   
 * 구현 클래스
 * public class 구현클래스명 implements 인터페이스명 { 인터페이스에 선언된 추상 메소드의 실체 메소드 선언 }
 * 
 * 인터페이스에서 인터페이스를 상속 받을 때는 extends를 사용하고 2개 이상 사용 가능
 * 클래스를 상속 받을 때는 2개 이상 불가지만, 인터페이스를 상속 받을 때는 2개 이상 가능
 * */
public class StudyInterface {

	/* 상위 1: 동물
	 * 상위 2: 육식 / 초식
	 * 상위3: 사자,늑대/소,말 
	 * */
	
	public static void main(String[] args) {
		
		Animal animal = new Lion();
		animal.sound();
		animal.walk(true);
		animal.walk(!true);
		
		Carnivores carnivores = new Lion();
		carnivores.sound();
		
	}//end of main
}//end of class

interface Animal {
	//상수
	public static final int MIN_NUMBER = 0;
	public static final int MAX_NUMBER = 10;
	//추상 메소드
	public abstract void sound();
	
	//디폴트 메소드
	public default void walk(boolean isWalk) {
		if(isWalk) {
			System.out.println("활보합니다.");
		}else {
			sweeping();
			System.out.println("우리에 가둡니다.");
		}
	}
	//정적 메소드
//	public static void buy() {
//		//정적 메소드는 오버라이드 하여 재정의 할 수 없다. <-buy요소로 사용하면 맞지 않음
//	}
	public static void sweeping() {//정적 메소드는 인터페이스 내에서 사용함(?) <- 사용법을 정확히 모르겠음
		System.out.println("가두기 전에 우리를 청소합니다.");
	}
	
	//디폴트 메소드와 정적 메소드 사용법에 대해서 아직 잘 이해하지 못함
	//추상 메소드를 통해 재정의를 해서 이용하면 되는거 아닌지. 필요성을 굳이 못 느낌
	
}

class Herbivores implements Animal {//herbivores - 초식동물

	@Override
	public void sound() {
		System.out.print("초식동물_ ");
	}
}

class Carnivores implements Animal {//carnivores - 육식동물

	@Override
	public void sound() {
		System.out.print("육식동물 _ ");
	}
}

class Lion extends Carnivores {
	private int number = 0;
	private final String NAME = "Lion";
	@Override
	public void sound() {
		System.out.println("크ㅡ헝");
	}
	@Override
	public void walk(boolean isWalk) {
		super.walk(isWalk);
	}
}

class Wolf extends Carnivores {
	private int number = 0;
	private final String NAME = "Wolf";
	@Override
	public void sound() {
		System.out.println("아ㅡ울");
	}
	@Override
	public void walk(boolean isWalk) {
		if(isWalk)
			System.out.println(this.NAME+"이 산책을 시작합니다.\n"+this.NAME+"이 기분이 좋아집니다.");
		else
			System.out.println(this.NAME+"을 우리에 가둡니다.");
	}
}

class Bull extends Herbivores {
	private int number = 0;
	private final String NAME = "Bull";
	@Override
	public void sound() {
		System.out.println("모ㅡ오");
	}
	@Override
	public void walk(boolean isWalk) {
		if(isWalk)
			System.out.println(this.NAME+"이 산책을 시작합니다.\n"+this.NAME+"이 기분이 좋아집니다.");
		else
			System.out.println(this.NAME+"을 우리에 가둡니다.");
	}
}

class Horse extends Herbivores {
	private int number = 0;
	private final String NAME = "Horse";
	@Override
	public void sound() {
		System.out.println("히ㅡ잉");
	}
	@Override
	public void walk(boolean isWalk) {
		if(isWalk)
			System.out.println(this.NAME+"이 산책을 시작합니다.\n"+this.NAME+"이 기분이 좋아집니다.");
		else
			System.out.println(this.NAME+"을 우리에 가둡니다.");
	}
}