package CollectionFramework;
import java.util.Arrays;

/*
 * Collection Framework
 * (Java)Collection : 객체를 수집해서 저장하는 역할
 * Framework : 사용 방법을 미리 정해 놓은 라이브러리
 * 
 * Collection
 *  - List
 *   : - 순서를 유지하고 저장
 *     - 중복 저장 기능
 *   구현 클래스 : ArrayList, Vector, LinkedList
 *     
 *  - Set
 *   : - 순서를 유지하지 않고 저장
 *     - 중복 저장 안 됨
 *   구현 클래스 : HashSet, TreeSet
 * 
 * Map
 *  - Map
 *   : - 키와 값의 쌍으로 저장(key,value)
 *     - 키는 중복 저장 안 됨
 *   구현 클래스 : HashMap, Hashtable, TreeMap, Properties
 *   
 * */
public class Collection{
	public static void main(String[] args) {
		
		Test[] array = new Test[10];
		
		array[0] = new Test("Model1");
		System.out.println(array[0]);
		
//		array[1] = "Model2";
		
		array[1] = new Test("Model2");
		System.out.println(array[1]);
		
		System.out.println(Arrays.deepToString(array));
	}
}//end of class

class Test {
	String str = "";
	
	//기본 생성자
	public Test() {
	}
	
	//매개변수 String 가지고 있는 생성자
	public Test(String str) {
		//생성자의 오버로딩
	}
}