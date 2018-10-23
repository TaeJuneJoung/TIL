package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

/* #Set#
 * 저장 순서 유지X, 중복X
 * - HashSet, LinkedHashSet, TreeSet
 * */
public class CollectionSet {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		/* 객체 추가 */
		set.add("hello");
		System.out.println(set);
//		set.add(1,"hello");인덱스가 없습니다. 저장순서와 중복이 없기에
		set.add("apple");
		System.out.println(set);//[apple, hello] -> 알파벳 순서에 맞게 자동으로 앞으로 sort됨을 알 수 있습니다.
		
		System.out.println(set.iterator());
	}
}//end of main
