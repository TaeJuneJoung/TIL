package studyGeneric;

import java.util.List;

import java.util.ArrayList;

/* 제네릭(Generic)
 * : Java5부터 추가
 * 제네릭 타입을 이용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 된다.
 * 컬렉션, 람다식, 스트림, NIO에서 널리 사용됨
 * - 컴파일 시 강한 타입 체크를 할 수 있다
 * - 타입 변화(casting)을 제거한다.
 * 
 * <타입 파라미터> - 타입 파라미터 이름은 T
 * public class 클래스명<T> {...}
 * public interface 인터페이스명<T> {...}
 * T를 다른 것으로 써도 된다. K 뭐 이런식으로...
 * 보편적으로
 * 	E - Element
 * 	K - Key
 * 	V - Value
 * 	N - Number
 * 	T - Type
 * 		으로 사용한다.
 * 
 * 제네릭 타입은 두 개 이상 멀티 타입 파라미터 사용 가능
 * ex) Map<Integer,String> map = new HashMap<>();
 * 
 * 제네릭 메소드 호출 방법
 * 1.명시적으로 구체적 타입을 지정
 * 2.매개값을 보고 구체적 타입을 추정
 * 
 * 제한된 타입 파라미터(<T extends 최상위타입>)
 *  -> 타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다.
 *  ex) 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 하위 클래스 타입(Byte, Short...)의 인스턴스만 가져야 한다.
 *  이것이 '제한된 타입 파라미터(bounded type parameter)'가 필요한 이유
 *  
 *  상위 타입은 클래스뿐만 아니라 인터페이스도 가능하다. 그러나, 인터페이스라고 해서 implements를 사용하지 않는다.
 *  
 *  public <T extends 상위타입> 리턴타입 메소드(매개변수,..){...}
 *  
 *  
 *  와일드카드 타입(<?>,<? extends ...>, <? super ...>)
 *   : 코드에서 ?를 일반저그올 와일드카드(wildcard)라고 부른다.
 *  
 *  1. 제네릭타입<?> : Unbounded Wildcards(제한 없음)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
 *  2. 제네릭타입<? extends 상위타입> : Upper Bounded Wildcards(상위 클래스 제한)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입만 올 수 있다.
 *  3. 제네릭타입<? super 하위타입> : Lower Bounded Wildcards(하위 클래스 제한)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
 * */
public class StudyGeneric {
	public static void main(String[] args) {
		
		/* 타입 변환을 제거 */
		List list1 = new ArrayList();
		list1.add("신재은");
		String str1 = (String) list1.get(0);
		
		//자바 7이전
		List<String> list2 = new ArrayList<String>();
		list2.add("신재은");
		String str2 = list2.get(0);//캐스팅을 하지 않아도 된다.
		
		//자바 7부터
		List<String> list3 = new ArrayList<>();
		list3.add("서새봄");
		String str3 = list3.get(0);
		
		
		//<타입 파라미터> - 타입 파라미터 이름은 T
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("서새봄");
		String strValue = box2.getT();
		System.out.println(strValue);
		
	}//end of main
}//end of class

class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
}//end of class

class Box<T>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}//end of class