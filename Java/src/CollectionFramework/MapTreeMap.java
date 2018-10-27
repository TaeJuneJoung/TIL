package CollectionFramework;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

/* TreeMap
 * 이진트리 기반으로 한 Map컬렉션[키 값을 비교]
 * TreeSet과의 차이점 -> Map.Entry key,value(Map의 특성)
 * */
public class MapTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(1, "Save");
		treeMap.put(new Integer(2), "바뀌니");
		treeMap.put(2, "물어");
		treeMap.put(3, "소방차");
		treeMap.put(4, "Hate");
		treeMap.put(5, "XXL");
		treeMap.put(6, "아름다워");
		
		System.out.println(treeMap);//{1=Save, 2=물어, 3=소방차, 4=Hate, 5=XXL, 6=아름다워}
		
		//firstEntry() : 제일 낮은 Map.Entry 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.firstEntry());
		
		//lastEntry() : 제일 높은 Map.Entry 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.lastEntry());//6=아름다워

		Entry<Integer,String> lastEntry = treeMap.lastEntry();
		System.out.println("Key : " + lastEntry.getKey() + "\t Value : " + lastEntry.getValue());
		
		//lowerEntry(K key) : 주어진 키보다 바로 아래 Map.Entry를 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.lowerEntry(3));//2=물어
		
		//higherEntry(K key) : 주어진 키보다 바로 위에 Map.Entry를 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.higherEntry(3));//4=Hate
		
		//floorEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴,
		//					  없다면 주어진 키 바로 아래의 Map.Entry 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.floorEntry(3));//3=소방차
		
		//ceilingEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴,
		//						없다면 주어진 키 바로 위의 Map.Entry 리턴 - Map.Entry<K,V>
		System.out.println(treeMap.ceilingEntry(3));//3=소방차
		
		//pollFirstEntry() : 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
		System.out.println(treeMap.pollFirstEntry());//1=Save
		
		//pollLastEntry() : 제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거함
		System.out.println(treeMap.pollLastEntry());//6=아름다워
		
		System.out.println(treeMap);//{2=물어, 3=소방차, 4=Hate, 5=XXL}
		
		
		
		TreeMap<Character,String> treeMap2 = new TreeMap<Character,String>();
		treeMap2.put('d', "DUCK");
		treeMap2.put('a', "ALPACA");
		treeMap2.put('l', "LION");
		treeMap2.put('f', "FOX");
		treeMap2.put('c', "CAT");
		treeMap2.put('j', "JAGUAR");
		treeMap2.put('h', "HORSE");
		
		//자동으로 오름차순 순서로 만들어줍니다.
		System.out.println(treeMap2);//{a=ALPACA, c=CAT, d=DUCK, f=FOX, h=HORSE, j=JAGUAR, l=LION}
		
		//descendingKeySet() : 내림차순으로 정렬된 키의 NavigableSet을 리턴 - NavigableSet<K>
		NavigableSet<Character> descendingKeySet = treeMap2.descendingKeySet();
		for (Character character : descendingKeySet) {
			System.out.print(character + "=" + treeMap2.get(character)+"  ");
		}
		System.out.println();
		
		//descendingMap() : 내림차순으로 정렬된 Map.Entry의 NavigableMap을 리턴 - NavigableMap<K,V>
		NavigableMap<Character, String> descendingMap = treeMap2.descendingMap();
		Set<Entry<Character,String>> descendingEntrySet = descendingMap.entrySet();
		Iterator<Entry<Character,String>> iterator = descendingEntrySet.iterator();
		while(iterator.hasNext()) {
			//java.util.NoSuchElementException - next가 두번이라 생기는 문제 <- iterator에서 next.key/next.value로 받다가 발생했었음
			Entry<Character,String> entry = iterator.next();//윗 문제를 해결하기 위해 Entry로 받아 실행
			char key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : " + key + "\t Value : " + value);
		}
		
		//아래와 같이 할수도 있다.
		for (Entry<Character, String> entry : descendingEntrySet) {
			char key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
		/* headMap(
		 *    K toKey,
		 *    boolean inclusive
		 * ) : 주어진 키보다 낮은 Map.Entry들을 NavigableMap으로 리턴,
		 *    주어진 키의 Map.Entry 포함 여부는 두 번째 매개값에 따라 달라짐 - NavigableMap<K,V>
		 * */
		
		/* tailMap(
		 *    K fromKey,
		 *    boolean inclusive
		 * ) : 주어진 객체보다 높은 Map.Entry들을 NavigableMap으로 리턴,
		 *    주어진 키의 Map.Entry 포함 여부는 두 번째 매개값에 따라 달라짐 - NavigableMap<K,V>
		 * */
		
		/* subMap(
		 *    K fromKey,
		 *    boolean fromInclusive
		 *    K toKey,
		 *    boolean toInclusive
		 * ) : 시작과 끝으로 주어진 키 사이의 Map.Entry들을 NavigableMap 컬렉션으로 반환,
		 *   시작과 끝 키의 Map.Entry 포함 여부는 두 번째, 네 번째 매개값에 따라 달라짐 - NavigableMap<K,V>
		 * */
		System.out.println(treeMap2.subMap('c', 'j'));//inclusive를 쓰지 않으면 false로 인식
		NavigableMap<Character, String> rangMap = treeMap2.subMap('c', true, 'j',true);
		Iterator<Entry<Character,String>> iteratorEntry = rangMap.entrySet().iterator();
		while(iteratorEntry.hasNext()) {
			Entry<Character,String> entry = iteratorEntry.next();
			char key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "\t" + value);
		}

		//#주의
		//아래와 같이 한다면 반복문을 사용하여 다 꺼낼수가 없다.
		Entry<Character,String> entryTest = rangMap.entrySet().iterator().next();
		System.out.println(entryTest);//c=CAT
		
	}//end of main
}//end of class
