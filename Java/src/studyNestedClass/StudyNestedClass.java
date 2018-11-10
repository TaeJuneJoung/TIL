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
public class StudyNestedClass {
	public class NestedClassEx{//중첩 클래스의 경우 public일 때 public 사용 가능
	//중첩 클래스를 사용하면 두 클래스의 멤버들을 서로 쉽게 접근할 수 있다는 장점과
	//외부에는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다
		
	}
	
	public interface NestedInterfaceEx{
	//해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해 인터페이스를 내부에 선언
	//중첩 인터페이스는 주로 UI프로그래밍에서 이벤트를 처리할 목적으로 많이 활용
	//	ex) 안드로이드에서 View클래스 내부에 OnClickListener
		
	}
	
}//end of class
