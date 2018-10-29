package studyCollectionFramework;

import java.util.HashSet;
import java.util.Set;

/* #HashSet : Set 인터페이스의 구현 클래스
 *  : 저장순서X, 중복X
 *  HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지는 않는다.
 *  HashSet은 객체를 저장하기 전에  먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어낸다.
 *  그리고 이미 있는 객체들의 해시코드와 비교한다. 동일 해시코드가 있다면 동일 객체로 판단하고 중복 저장을 하지 않는다.
 * */

public class SetHashSetEx {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("이정우",20));
		set.add(new Member("강혁",20));
		set.add(new Member("강후",20));
		set.add(new Member("이정우",20));//동일한 내용 반복
		set.add(new Member("강혁",20));//동일한 내용 반복
		set.add(new Member("강후",20));//동일한 내용 반복
		
		System.out.println("Result" + set.size());//Result : 3 - 중복은 되지 않는다.
		
		Member mem = new Member("이정우",20);
		Member mem2 = new Member("이정우",20);
		Member mem3 = new Member("하정우", 20);
		
		System.out.println(mem.equals(mem2));//true
		System.out.println(mem.equals(mem3));//false
		System.out.println(mem.hashCode());
		System.out.println(mem2.hashCode());
		System.out.println(mem3.hashCode());
		System.out.println(mem.hashCode()==mem2.hashCode());//true
		System.out.println(mem.hashCode()==mem3.hashCode());//false
		
	}//end of main
}//end of class

class Member{
	
	private String name;
	private int age;
	
	public Member() {
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}