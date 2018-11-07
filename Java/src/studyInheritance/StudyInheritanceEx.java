package studyInheritance;

/* 
 * 
 * 객체 타입 확인(instanceof)
 * */
public class StudyInheritanceEx {
	public static void main(String[] args) {

		//자식 클래스는 부모 클래스의 필드와 메소드를 사용할 수 있다.
		//But, private일 때는 접근할 수 없다.
		Son son = new Son("BigBang","777",1);
		System.out.println("Name : " + son.getName());
		System.out.println("SSN : " + son.getSsn());
		System.out.println("No : " + son.getSonNo());
		
		//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능
		//예외)메소드가 자식 클래스에서 오버라이딩되었다면 자식 클래스의 메소드가 대신 호출됨
		Parent par = new Son();//자동타입변환
		par.method1();
		par.method2();
		
		//아래와 같이 하게 되면 3가지 method를 다 사용할 수 있다.
		Son son2 = (Son) par;
		son2.getSonNo();
		son2.method1();
		son2.method2();
		son2.method3();
//		Son son3 = (Son) new Parent();//studyInheritance.Parent cannot be cast to studyInheritance.Son
		
		//객체 타입 확인(instanceof)
		StudyInheritanceEx st = new StudyInheritanceEx();
		st.method(par);
		
	}//end of main
	public void method(Parent par) {
		if(par instanceof Son) {
				Son son = (Son) par;
				System.out.println("가능");
		}
	}
}//end of class

class Parent{
	
	private String name;
	private String ssn;
	
	public Parent() {
	}
	public Parent(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void method1() {
		System.out.println("Parent Method1");
	}
	public void method2() {
		System.out.println("Parent Method2 - Override할 것");
	}
	
}//end of Parent class

class Son extends Parent{
	
	private int sonNo;
	
	public Son() {
	}
	public Son(String name, String ssn, int sonNo) {
		super(name,ssn);
		this.sonNo = sonNo;
	}

	public int getSonNo() {
		return sonNo;
	}
	public void setSonNo(int sonNo) {
		this.sonNo = sonNo;
	}
	
	@Override
	public void method2() {
		System.out.println("Son method2 - Override한 것");
	}
	public void method3() {
		System.out.println("Son Method3");
	}
	
}//end of Son class