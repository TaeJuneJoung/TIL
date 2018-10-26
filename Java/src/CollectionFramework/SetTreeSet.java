package CollectionFramework;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* 이진 트리 구조
 * 이진 트리가 범위 검색을 쉽게 할 수 있는 이유는 값들이 정렬되어 있어 그룹핑이 쉽기 때문이다.
 * 루트노드를 중심으로 작은 것은 왼쪽/큰 것은 오른쪽
 * 루트 노드 연결된 노드에서 하위에 또 연결되어 있는 노드를 가지고 있으면 부모 노드라고 부르고 부모 노드의 하위노드는 자식 노드라고 한다.
 * */
public class SetTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("남희석");
		treeSet.add("허영지");
		treeSet.add("홍석천");
		treeSet.add("신이");
		
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//한글 가나다라마바사...의 순서대로 오름차순 정렬되어 있습니다.

		//first() : 제일 낮은 객체를 리턴 - Element
		System.out.println(treeSet.first());
		
		//last() : 제일 높은 객체를 리턴 - Element
		System.out.println(treeSet.last());
		
		//lower(E e) : 주어진 객체보다 바로 아래 객체를 리턴 - Element
		System.out.println(treeSet.lower("남희석"));//null - 가장 낮은것보다 낮은건 없기에 null
		System.out.println(treeSet.lower("신이"));//남희석
		
		//higer(E e) : 주어진 객체보다 바로 위의 객체를 리턴 - Element
		System.out.println(treeSet.higher("남희석"));//신이
		System.out.println(treeSet.higher("홍석천"));//null - 가장 높은것보다 높은건 없기에 null
		
		//floor(E e) : 주어진 객체와 동등한 객체가 있다면 리턴, 없다면 주어진 객체의 바로 아래의 객체를 리턴 - Element
		System.out.println(treeSet.floor("신이"));//신이 - 자신과 동등하다
		System.out.println(treeSet.floor("허영지"));//허영지 - 자신과 동등하다
		System.out.println(treeSet.floor("남희석"));//남희석 - 자신과 동등하다
		System.out.println(treeSet.floor("홍석천"));//홍석천 - 자신과 동등하다
		
		//ceiling(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 없다면 주어진 객체의 바로 위의 객체를 리턴 - Element
		System.out.println(treeSet.ceiling("신이"));//신이 - 자신과 동등하다
		System.out.println(treeSet.ceiling("허영지"));//허영지 - 자신과 동등하다
		System.out.println(treeSet.ceiling("남희석"));//남희석 - 자신과 동등하다
		System.out.println(treeSet.ceiling("홍석천"));//홍석천 - 자신과 동등하다
		
		//pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함 - Element
		System.out.println(treeSet.pollFirst());//남희석
		System.out.println(treeSet);//[신이, 허영지, 홍석천]
		
		//pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함 - Element
		System.out.println(treeSet.pollLast());//홍석천
		System.out.println(treeSet);//[신이, 허영지]
		
		System.out.println("Size : "+treeSet.size());
		
		
		
		System.out.println("--------------------------------");
		
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*100);
			treeSet2.add(num);//중복된 숫자는 하나로 인식된다.
		}
		System.out.println("Size = "+treeSet2.size() + "\n" + treeSet2);
		
		//descendingIterator() : 내림차순으로 정렬된 Iterator를 리턴 - Iterator<E>
		Iterator<Integer> deIterator = treeSet2.descendingIterator();
		while(deIterator.hasNext()) {
			System.out.print(deIterator.next()+"  ");
		}
		
		System.out.println();
		
		//descendingSet() : 내림차순으로 정렬된 NavigableSet을 반환 - NavigableSet<E>
		NavigableSet<Integer> descendingSet = treeSet2.descendingSet();
		for (Integer integer : descendingSet) {
			System.out.print(integer+"  ");
		}
		
		System.out.println();
		
		//descedingSet을 한번 더 하면 내림차순이었던게 오름차순으로 된다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		Iterator<Integer> ascIterator = ascendingSet.iterator();
		while(ascIterator.hasNext()) {
			System.out.print(ascIterator.next() + "  ");
		}
		
		System.out.println("\n이렇게해도 됩니다.");
		for (Integer integer : ascendingSet) {
			System.out.print(integer+"  ");
		}
		
		System.out.println();
		System.out.println("------------------------");
		
		/* headSet(
		*     E toElement,
		*     boolean inclusive
		*  ) : 주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴
		*    주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐 - NavigableSet<E>
		* */
		System.out.println(treeSet2.headSet(50, true));//숫자로 주어졌을 때는 해당 숫자 이하면 리턴
		NavigableSet<Integer> navHeadSet = treeSet2.headSet(50, true);
		for (Integer integer : navHeadSet) {
			System.out.print(integer + "  ");
		}
		System.out.println();
		
		/* tailSet(
		 *    E fromElement,
		 *    boolean inclusive
		 * ) : 주어진 객체보다 높은 객체들을 NavigableSet으로 리턴,
		 *   주어진 객체 포함 여부는 두 번째 매개값에 따라 달라짐 - NavigableSet<E>
		 * */
		System.out.println(treeSet2.tailSet(50, true));

		/* subSet(
		 *    E fromElement,
		 *    boolean fromInclusive,
		 *    E toElement,
		 *    boolean toInclusive
		 * ) : 시작과 끝으로 주어진 객체 사이의 객체들을 NavigableSet으로 리턴,
		 *   시작과 끝 객체의 포함 여부는 두 번째, 네 번째 매개값에 따라 달라짐 - NavigableSet<E>
		 * */
		System.out.println(treeSet2.subSet(20, true, 80, true));
		
		System.out.println(treeSet);//[신이, 허영지]
		System.out.println(treeSet.subSet("가", "헣"));//[신이, 허영지]
	}//end of main
}//end of class
