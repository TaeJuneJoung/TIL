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
 * */
public class studyGeneric {
	public static void main(String[] args) {
		
		/* 타입 변환을 제거 */
		List list1 = new ArrayList();
		list1.add("신재은");
		String str1 = (String) list1.get(0);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("신재은");
		String str2 = list2.get(0);//캐스팅을 하지 않아도 된다.
		
		
		
	}//end of main
}//end of class
