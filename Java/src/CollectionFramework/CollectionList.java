package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/* #List#
 * 중복 가능, 순서를 유지하고 저장 됨
 * 
 * ArrayList
 *  : List 인터페이스의구현 클래스
 *  배열은 크기가 고정되어 있지만, List는 저장 용량(capacity)이 늘어난다.
 *  
 *  
 * List 앞에 인덱스가 존재하지 않으면 뒤 인덱스를생성할 수 없다.
 * ex) 0, 1 index 존재 / .add(3,Element) 불가
 * But, 0, 1, 2 index 존재 / .add를 한 후 index 2를 null 해준다.
 * 
 * list.get()을 해도 list에 담긴 객체는 계속 사용 가능하다
 * 
 * 
 * Vector
 *  : ArrayList와의 다른 점 -
 *   Vector는 동기화된(synchronized) 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고,
 *   하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다.
 *   
 * LinkedList
 *  : ArrayList와 내부 구조가 다르다.
 *  ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리
 *  LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.
 *  빈번한 객체 삭제와 삽입이 일어나는 곳에서는 LinkedList가 좋은 성능을 발휘한다.
 *  
 * */
public class CollectionList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		/* 객체 추가 */
		//add(E element) : 주어진 객체를 맨 뒤에 추가
		list.add("Test");
		list.add("Collection");
		list.add("List");
		
		//add(int index,E element) : 주어진 인덱스에 객체를 추가 - 해당 위치 뒤 객체들은 뒤로 밀려남
		list.add(0,"First");
		
		//set(int index,E element) : 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
		list.set(1, "Second");

		/* 객체 검색 */
		//contains(Object o) : 주어진 객체가 저장되어 있는지 여부 - boolean Type
		System.out.println(list.contains("Second"));//true
		
		//get(int index) : 주어진 인덱스에 저장된 객체를 리턴 - E
		System.out.println(list.get(1));//Second
		
		//isEmpty() : 컬렉션이 비어 있는지 조사 - boolean Type
		System.out.println(list.isEmpty());//false
		
		//size() : 저장되어 있는 전체 객체 수를 리턴 - int Type
		System.out.println(list.size());//4
		
		System.out.println(list);

		/* 객체 삭제 */
		//remove(Object o) : 주어진 객체를 삭제
		list.remove("Second");
		System.out.println(list);
		list.remove("Second");//없는 것을 삭제해도 오류가 발생하지 않음
		System.out.println(list);//없기에 변화가 없음
		
		//remove(int index) : 주어진 인덱스에 저장된 객체를 삭제
		list.remove(0);
		System.out.println(list);
		
		//clear() : 저장된 모든 객체를 삭제
		list.clear();
		System.out.println(list);
		
		//list는 Element를 String으로 설정하여 add할 때 다른 타입이 안됩니다.
		//list2는 설정해 주지 않음으로 다른 타입들도 가능하지만, 노란색 밑줄이 생깁니다.
		List list2 = new ArrayList();
		list2.add(1);
		list2.add("one");
		list2.add('A');
		list2.add(2.0);
		System.out.println(list2);
		
		System.out.println("-----반복문 시작-----");
		//반복문을 통하여 list 객체 꺼내기
		for (int i = 0; i < list2.size(); i++) {
			Object obj = list2.get(i);//변형하여 사용할수도 있기에 변수에 담아봤습니다.
			System.out.println(obj);//String으로 Casting 시 오류 발생으로 Object로 받습니다.
		}
		System.out.println("-----foreach문-----");
		for (Object object : list2) {
			System.out.println(object);
		}
		
		//ArrayList에 저장용량을 3으로 두고 늘어나는지 고정되는지 확인 -> capacity가 늘어난다.
		List<Integer> list3 = new ArrayList<Integer>(3);
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println(list3);
		
		List<Board> list4 = new Vector<Board>();
		list4.add(new Board(1,"Subject1","Content1","A"));
		list4.add(new Board(2,"Subject2","Content2","B"));
		list4.add(new Board(3,"Subject3","Content3","C"));
		list4.add(new Board(4,"Subject4","Content4","D"));
		
		for (int i = 0; i < list4.size(); i++) {
			Board board = list4.get(i);
			System.out.println(board.num +"\t"+ board.subject +"\t"+ board.content +"\t"+ board.writer);
		}
		
		/* ArrayList와 LinkedList의 성능 비교 
		 * add(index=0으로 시작해서 하나씩 밀어내기식,E)이면 LinkedList가 더 빠릅니다.
		 * add(index=i,E)이면 ArrayList가 더 빠릅니다.
		 * 결과적으로, 순차적 추가/삭제는 ArrayList가 더 빠르지만,
		 * 중간에 추가 또는 삭제할 경우는 LinkedList가 더 빠릅니다.
		 * */
		List list5 = new ArrayList<>();
		List list6 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list5.add(i,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : "+(endTime - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list6.add(i,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : "+(endTime - startTime));
		
	}//end of main

}//end of class

class Board{
	int num;
	String subject;
	String content;
	String writer;
	
	public Board() {
	}
	
	public Board(int num, String subject, String content, String writer) {
		this.num = num;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}
