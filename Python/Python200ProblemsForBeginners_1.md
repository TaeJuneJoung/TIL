# 초보자를 위한 파이썬 200제

##### 출판사 : 정보문화사 / 저자 : 장삼용



파이썬은 알아서 변수 타입을 정해준다.

Java는 변수를 선언해주는데... 이러한 방도일까 생각해보았다.

제네릭을 이용한다. or Object로 받아서 이용한다.

```java
//Object이용
public class TypeEx {
	private Object object;
	
	public static void main(String[] args) {
		GenericEx ge = new GenericEx();
		String str = "Hello Generic";
		ge.object = str;
		System.out.println(ge.object);
		
		int data = 123;
		ge.object = data;
		
		System.out.println(ge.object);
	}
}

[결과값]
Hello Generic
123
```







### print()

 : 기본적으로 인자로 입력된 값을 화면에 출력한 후 줄바꿈.

만약, 줄바꿈을 하지 않으려면 print()의 두 번째 인자로 end=""를 지정하면 된다.

**print(인자값, end="")**



| 포맷 문자열 | 설명                       |
| :---------: | :------------------------- |
|     %s      | 문자열에 대응됨            |
|     %c      | 문자나 기호 한 개에 대응됨 |
|     %d      | 정수에 대응됨              |
|     %f      | 실수에 대응됨              |
|     %%      | '%'라는 기호 자체를 표시함 |



##### 캐리지 리턴 문자 '\r'

 : 현재 위치를 나타내는 커서를 화면 맨 앞으로 이동하라는 의미







### for~else

