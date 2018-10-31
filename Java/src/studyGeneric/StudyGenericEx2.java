package studyGeneric;

/* 제한된 타입 파라미터(<T extends 최상위타입>)
 *  -> 타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다.
 *  ex) 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 하위 클래스 타입(Byte, Short...)의 인스턴스만 가져야 한다.
 *  이것이 '제한된 타입 파라미터(bounded type parameter)'가 필요한 이유
 *  
 *  상위 타입은 클래스뿐만 아니라 인터페이스도 가능하다. 그러나, 인터페이스라고 해서 implements를 사용하지 않는다.
 *  
 *  public <T extends 상위타입> 리턴타입 메소드(매개변수,..){...}
 * */
public class StudyGenericEx2 {
	public static void main(String[] args) {

		/* 제한된 타입 파라미터(<T extends 최상위타입>) */
		StudyGenericEx2 sge = new StudyGenericEx2();
		double doubleValue = sge.compare(5.6, 4.2);
		System.out.println(doubleValue);
		doubleValue = sge.compare(4.2, 5.6);
		System.out.println(doubleValue);
		doubleValue = sge.compare(5, 5);
		System.out.println(doubleValue);
		//본래 int형으로 나와야 정상이나 제한된 타입 파라미터를 이용해서 Number면 된다 하였는데,
		//메소드 내용에서 double로 바꿔서 return되게 하여 소수형태로 나오게 된다.
		
		int result = sge.genericType(123, 456);
		System.out.println(result);
		result = sge.genericType(987, 654);
		System.out.println(result);
		
		String strResult = sge.genericType("Java", "Generic");
		System.out.println("Java : "+("Java".hashCode()));
		System.out.println("Generic : "+("Generic".hashCode()));		
		System.out.println(strResult);
		
		strResult = sge.genericType("Arduino", "Being");
		System.out.println("Arduino : "+"Arduino".hashCode());
		System.out.println("Being : "+"Being".hashCode());
		System.out.println(strResult);
		
	}//end of main
	
	public <T extends Number> int compare(T t1, T t2) { //t1>t2이면 양수, t1==t2 0, t1<t2 음수
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
	
	public  <T>T genericType(T t1, T t2) {
		if(t1.hashCode()>t2.hashCode()) return t1;
		else if(t1.hashCode()==t2.hashCode()) return t1;
		else  return t2;
	}

}//end of class
