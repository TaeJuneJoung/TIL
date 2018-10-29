package studyCollectionFramework;

import java.util.Comparator;

public class ComparatorEx implements Comparator<Price>{

	public static void main(String[] args) {
		
		//Override를 위해선 Comparable을 implements(상속) 받아야합니다.
		/* compareTo(T o) - int
		 * : 주어진 객체와 같으면 0을 리턴
		 *  주어진 객체보다 적으면 음수 리턴
		 *  주어진 객체보다 크면 양수 리턴
		 */
		
		int booNum = new Integer(5).compareTo(new Integer(4));
		System.out.println(booNum);//1 - 5과 4보다 크다
		booNum = new Integer(5).compareTo(new Integer(7));
		System.out.println(booNum);//-1 - 5과 7보다 작다
		booNum = new Integer(5).compareTo(new Integer(5));
		System.out.println(booNum);//0 - 주어진 객체와 같다
		
		/* compare(T o1, T o2) - int
		 * : o1과 o2가 동등하다면 0을 리턴
		 *  o1과 o2보다 앞에 오게 하려면 음수를 리턴
		 *  o1과 o2보다 뒤에 오게 하려면 양수를 리턴
		 * */
		
		ComparatorEx com = new ComparatorEx();
		int result = com.compare(new Price("콘서트티켓",70000), new Price("미니콘서트티켓",60000));
		System.out.println(result);//-1 - o1이 뒤에 오기 때문에 음수(재정의이기에 편한대로 해도 된다.)
		
	}//end of main

	@Override
	public int compare(Price o1, Price o2) {
		if(o1.getPrice() < o2.getPrice()) return 1;
		else if(o1.getPrice() == o2.getPrice()) return 0;
		return -1;
	}
}//end of class

class Price {
	
	private String name;
	private int price;
	
	public Price() {
	}
	
	public Price(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}//end of class