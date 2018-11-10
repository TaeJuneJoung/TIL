package studyException;

/* 오류
 * 	1. 에러(error)
 * 	2. 예외(exception)
 * 		: 예외는 예외 처리(Exception Handling)를 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다.
 * 
 *  #예외 처리 코드
 *  try {
 *		예외 발생 가능 코드
 *	} catch (예외클래스 e) {
 *		예외 발생 시 예외처리
 *	}finally {
 *		항상 실행;
 *	}
 *
 *	#다중 예외 처리
 *	try {
 *		예외 발생 가능 코드
 *	} catch (예외클래스1 e) {
 *		예외1 발생 시 예외처리
 *	} catch (예외클래스2 e) {
 *		예외2 발생 시 예외처리
 *	} finally {
 *		항상 실행;
 *	}
 *
 *	#멀티 catch
 *   : 자바7부터 하나의 catch 블록을 통해 예외 연결 가능
 *   ex) catch (예외클래스1 | 예외클래스2 e){...}
 * */
public class StudyException {
	public static void main(String[] args) {

		//NullPointerException
		// : 객체가 없는 상태에서 객체를 사용하려 해서 발생
		String data = null;
//		System.out.println(data.toString());
		
		//ArrayIndexOutOfBoundsException
		// : 배열에서 인덱스 범위를 초과하여 사용할 경우
		
		//NumberFormatException
		// : 숫자로 변경할 수 없는 문자열을 숫자열로 변경할 때
		data = "123";
		Integer.valueOf(data);
		System.out.println(data);
		data = "Hello";
//		Integer.valueOf(data);//java.lang.NumberFormatException: For input string: "Hello"
		//parseInt도 valueOf와 같은 역할을 함
		
		//ClassCastException
		// : 타입 변환(Casting)은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터페이스 간에도 발생
		//  억지로 타입 변환을 시도할 경우 ClassCastException이 발생한다.
		
	}
}//end of class
