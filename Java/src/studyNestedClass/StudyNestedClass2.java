package studyNestedClass;

/* 중첩 클래스(Nested Class)를 왜 사용하는가?
 * -> 어떤 클래스는 여러 클래스와 관계를 맺지만 -> 독립적 선언
 * 어떤 클래스는 특정 클래스와 관계를 맺는다. -> 클래스 내부 선언(중첩 클래스)
 * 
 * #선언 위치에 따른 구분
 *  1. 멤버 클래스
 *  	- 인스턴스 멤버 클래스 : A객체를 생성해야만 사용할 수 있는 B중첩 클래스
 *  		class A{
 *  			class B{...}
 *  		}
 *  	- 정적 멤버 클래스 : A클래스로 바로 접근할 수 있는 B중첩 클래스
 *  		class A{
 *  			static class B{...}
 *  		}
 *  2. 로컬 클래스 : method()가 실행할 때만 사용할 수 있는 B중첩 클래스
 *  	: 메소드 안에 쓰여진 중첩 클래스
 *  		class A{
 *  			void method(){
 *  				class B{...}
 *  			}//end of method
 *  		}//end of class
 * */
public class StudyNestedClass2 {
	
	public StudyNestedClass2() {
		System.out.println("[System]StudyNestedClass2의 생성자");
	}
	
	public class MemberA{//인스턴스 멤버 클래스
		
		//Field
		public int numberA;						//인스턴스 필드
//		public static int numberA2;				//정적 필드X
		public static final int NUMBER = 10;	//상수O ->값을 정해줘야함
		
		//Constructor
		MemberA() {								//생성자
			System.out.println("-----인스턴스 멤버A의 생성자-----");
		}
		
		//Method
		void methodA() {						//인스턴스 메소드
			System.out.println("인스턴스 멤버A의 MethodA");
		}
//		static void methodA2() {}				//정적 메소드X
		
	}//end of NestedCalss
	
	public static class MemberB{//정적 멤버 클래스
		
		//Field
		int numberB;							//인스턴스 필드
		static int numberB2;					//정적 필드
		static final int NUMBER = 10;			//상수
		
		//Constructor
		MemberB() {								//생성자
			System.out.println("-----정적 멤버B의 생성자-----");
		}
		
		//Method
		void methodB() {						//인스턴스 메소드
			System.out.println("정적 멤버B의 MethodB");
		}
		static void methodB2() {				//정적 메소드
			System.out.println("정적 멤버B의 static MethodB2");
		}
		
	}//end of static NestedClass
	
	void method() {
		System.out.println("--본 클래스의 메소드--");
		class LocalA{//로컬 클래스는 접근 제한자[public,private] 및 static를 붙일 수 없다.
			//로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문.
			
			//Field
			int numberA;						//인스턴스 필드
//			static int numberA2;				//정적 필드X
			static final int NUMBER = 10;		//상수O ->값을 정해줘야함
			
			//Constructor
			public LocalA() {					//생성자
				System.out.println("-----로컬 생성자-----");
			}
			//Method
			public void methodA() {				//인스턴스 메소드
				System.out.println("로컬 클래스의 메소드A");
			}
//			static void methodB() {}			//정적 메소드X
			
		}//end of local NestedClass
		
		LocalA local = new LocalA();
		local.numberA = 6;
		System.out.println(local.numberA);
		System.out.println(LocalA.NUMBER);
		local.methodA();
	}
	
	public static void main(String[] args) {
		
		StudyNestedClass2 nested = new StudyNestedClass2();
		StudyNestedClass2.MemberA memberA = nested.new MemberA();
		//아래와 같이 할 때는 안됨.
//		nested.MemberA memberA1 = nested.new MemberA();
//		StudyNestedClass2.MemberA memberA2 = StudyNestedClass2.new MemberA();
		
		memberA.numberA = 5;
		System.out.println(memberA.numberA);
		System.out.println(memberA.NUMBER);
		memberA.methodA();
		
		StudyNestedClass2.MemberB memberB = new MemberB();
//		StudyNestedClass2.MemberB memberB2 = new StudyNestedClass2.MemberB();//이렇게 하는게 정석
		//아래와 같이 할 때는 안됨
//		StudyNestedClass2.MemberB memberB3 = nested.new MemberB();//위와 같이 하였으나 안됨 <- 정적 방법과 인스턴스는 다르다.
		
		memberB.numberB = 3;
		memberB.numberB2 = 7;
		System.out.println(memberB.numberB);
		System.out.println(memberB.numberB2);
		System.out.println(memberB.NUMBER);
		memberB.methodB();
		memberB.methodB2();
		
		//정적인 부분에서는 아래와 같이 쓰는게 더 편리하고 나은듯하다.
		MemberB.numberB2 = 8;
		System.out.println(MemberB.numberB2);
		System.out.println(MemberB.NUMBER);
		MemberB.methodB2();
		
		//로컬 클래스
		nested.method();
		/* 로컬 클래스
		 *  : 메소드 내에서 선언
		 *  로컬 클래스는 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용하여아 한다.
		 *  주로,비동기 처리를 위해 스레드 객체를 만들 때 사용한다.
		 * */
		
		nested.methodEx();
		
	}//end of main
	
	//로컬 클래스 사용 예제
	void methodEx() {
		class DownloadThread extends Thread {
			public DownloadThread() {
				System.out.println("-----로컬 클래스 사용 예제-----");
			}
		}
		DownloadThread thread = new DownloadThread();
		thread.start();
	}
	
}//end of class
