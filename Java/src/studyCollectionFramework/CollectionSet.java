package studyCollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* #Set#
 * 저장 순서 유지X, 중복X
 * - HashSet, LinkedHashSet, TreeSet
 * 
 * HashSet : Set 인터페이스의 구현 클래스
 *  : 저장순서X, 중복X
 *   HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지는 않는다.
 *   HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어낸다.
 *   그리고 이미 있는 객체들의 해시코드와 비교한다. 동일 해시코드가 있다면 동일 객체로 판단하고 중복 저장을 하지 않는다.
 *   
 * */
public class CollectionSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		/* 객체 추가 */
		//add(E e) : 주어진 객체를 저장 - boolean Type[true:추가 성공/false:추가 실패]
		set.add("hello");
		System.out.println(set);
//		set.add(1,"hello");인덱스가 없습니다. 저장순서와 중복이 없기에
		set.add("apple");
		System.out.println(set);//[apple, hello] -> 알파벳 순서에 맞게 자동으로 앞으로 sort됨을 알 수 있습니다.
		
		/* 객체 검색 */
		//contains(Object o) : 주어진 객체가 저장되어 있는지 여부 - boolean Type
		boolean boo = set.contains("apple");
		System.out.println(boo);//true
		boo = set.contains("Apple");
		System.out.println(boo);//false
		
		//isEmpty() : 컬렉션이 비어 있는지 조사
		System.out.println(set.isEmpty());//false
		
		//size() : 저장되어 있는 전체 객체수 리턴 - int Type
		System.out.println(set.size());
		
		//iterator() : 저장된 객체를 한 번씩 가져오는 반복자 리턴 - Iterator<E>
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//hasNext() : 가져올 객체가 있으면 true/없으면 false return - boolean Type
			//next() : 컬렉션에서 하나의 객체를 가져온다 - Element
			//remove() : Set컬렉션에서 객체를 제거 - void
			String str = iterator.next();
			if(str.equals("hello"))
				iterator.remove();
			System.out.println(str);
		}
		//진행된 다음 삭제된다. - 실제 set 컬렉션에서도 삭제된다.
		System.out.println(set);
		
		
		set.add("hello");
		System.out.println("향상된 for문을 통한 컬렉션 객체 나타내기");
		for (String string : set) {
			if(string.equals("hello"))
				boo = set.remove(string);
			System.out.println(boo);
			System.out.println(string);
		}
		//진행된 다음 삭제된다.
		System.out.println(set);
		
		/* 객체 삭제 */
		//clear() : 저장된 모든 객체를 삭제 - void
//		set.clear();
		//remove(Object o) : 주어진 객체를 삭제 - boolean Type
//		set.remove("apple");
//		set.removeAll(set);//clear과 비슷한 효과 - boolean으로 받아 결과를 알 수 있습니다.
//		System.out.println(set);
		
		//[의문점]List는 Iterator을 사용하지 못하는가?
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("list");
		list.add("iterator");
		Iterator<String> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			String str = iterator2.next();
			System.out.println(str);
		}
		//iterator을 먼저 한 후 add를 하면 java.util.ConcurrentModificationException오류 발생
		
		
		
	}//end of main
}//end of main
