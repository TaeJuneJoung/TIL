package CollectionFramework;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/* Collection Framework에는
 * Collection과 Map이 있다.
 * Collection으로는 지금까지 다룬 List와 Set이 있다.
 * List : 중복O, 순서O -List(인터페이스), ArrayList(구현클래스), Vector, LinkedList
 *  - ArrayList
 *  - Vector : 동기화
 *  - LinkedList : 인접 참조를 링크해서 체인처럼 관리
 * Set : 중복X, 순서X - Set(인터페이스), HashSet(구현클래스), TreeSet[다루지 않았음]
 * 
 * 이번에 다룰 Map에는 Map, HashMap, HashTable, TreeMap, LinkedHashMap, Properties이 있다.
 *  - Map : 인터페이스
 *  - HashMap : 구현클래스
 *  - HashTable
 *  - TreeMap
 *  - LinkedHashMap
 *  - Properties
 *  
 * Map 컬렉션은 key,value로 구성된 Entry 객체를 저장하는 구조를 가지고 있다.
 *  - key,value는 객체, key는 중복X value는 중복O
 *   기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치된다.
 * 
 * */
public class MapMap {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		/* 객체 추가 */
		//put(K key,V value) : 주어진 키와 값을 추가, 저장되면 값을 리턴 - Value
		map.put(1, "CollectionFramework");
		map.put(2, "Map");
		map.put(3, "HashMap");
		map.put(4, "Put");
		
		/* 객체 검색 */
		//containsKey(Object key) : 주어진 키가 있는지 여부 - boolean Type
		//containsValue(Object value) : 주어진 값이 있는지 여부 - boolean Type
		
		//isEmpty() : 컬렉션이 비어 있는지 여부 - boolean Type

		//size() : 저장된 키의 총 수를 리턴 - int Type
		
		//get(Object key) : 주어진 키가 있는 값을 리턴 - Value
		System.out.println(map.get(3));
		String str = map.get(4);//Value Type에 맞게 받을 수 있습니다. Value v = map.get(key);
		System.out.println(str);
		
		//Set<Map.Entry<K,V>> entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()){
			Entry<Integer,String> entry = entryIterator.next();
			System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}

		//Set<K> keySet() : 모든 키를 Set객체에 담아서 리턴
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			String value = map.get(key);
			System.out.println(value);
		}
		
		//Collection<V> values() : 저장된 모든 값을 Collection에 담아서 리턴
		java.util.Collection<String> values = map.values();//Collection Class가 있기에 길게 나옴. Class명 명명규칙 지킬것!
		Iterator<String> valuesIterator = values.iterator();
		while(valuesIterator.hasNext()) {
			String value = valuesIterator.next();
			System.out.println(value);
		}
		
		/* 객체 삭제 */
		//clear() : 모든 Map.Entry(키와 값)를 삭제 - void
		//remove(Object key) : 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴 -Value
		
		System.out.println();
		
		/* Properties */
		Properties properties = new Properties();
		try {
			String path = "test.properties위치";//공유된 파일이라 경로 붙여넣지 않음 - 사용시 붙여넣을것
			path = URLDecoder.decode(path, "utf-8");
			properties.load(new FileReader(path));
			Set proSet = properties.keySet();
			Iterator<String> proIter = proSet.iterator();
			while(proIter.hasNext()) {
				String key = proIter.next();
				String value = properties.getProperty(key);
				System.out.println(key + "\t : \t" +value);
			}
		} catch (IOException e) {
			System.out.println("지정경로를 넣어주지 않으면 안돼요!");
			e.printStackTrace();
		}
		
	}//end of main
}//end of class