# 초보자를 위한 파이썬 200제

##### 출판사 : 정보문화사 / 저자 : 장삼용

<br><br>

파이썬은 알아서 변수 타입을 정해준다.

Java는 변수를 선언해주는데... 이러한 방도일까 생각해보았다.

제네릭을 이용한다. or Object로 받아서 이용한다.<br>

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

<br>

<br>

<br>

### print()

 : 기본적으로 인자로 입력된 값을 화면에 출력한 후 줄바꿈.

만약, 줄바꿈을 하지 않으려면 print()의 두 번째 인자로 end=""를 지정하면 된다.

**print(인자값, end="")**

<br>

| 포맷 문자열 | 설명                       |
| :---------: | :------------------------- |
|     %s      | 문자열에 대응됨            |
|     %c      | 문자나 기호 한 개에 대응됨 |
|     %d      | 정수에 대응됨              |
|     %f      | 실수에 대응됨              |
|     %%      | '%'라는 기호 자체를 표시함 |
|     %o      | 8진수에 대응됨             |
|     %x      | 16진수에 대응됨            |

<br>

##### 캐리지 리턴 문자 '\r'

 : 현재 위치를 나타내는 커서를 화면 맨 앞으로 이동하라는 의미



##### escape String

 : 이스케이프 문자는 키보드로 입력하기 어려운 기호를 나타내기 위해 역슬래쉬 '\'로 시작하는 문자

| 이스케이프 문자 | 설명        |
| :-------------: | ----------- |
|       \n        | 줄 바꾸기   |
|       \t        | 탭          |
|       \ \       | \           |
|   \ ' or \ "    | ' or "      |
|       \r        | 캐리지 리턴 |
|       \f        | 폼 피드     |
|       \a        | 벨 소리     |
|       \b        | 백 스페이스 |
|      \000       | 널문자      |

(md에서도 \(기호)를 붙여쓰면 '하나로 인식해서 보여주기 위해 한번 띄어 씀.)

활용 빈도가 높은 것은 `\n`, `\t`, `\\`, `\'`, `\"`이다.

<br>

<br>

<br>

### for~else

```python
for 변수 in 범위:
    반복 실행 코드
else:
    for구문이 모두 실행되었을 때 실행할 코드
```

<br>

<br>

<br>

### None

 : 아무것도 없다는 의미의 상수

<br>

<br>

<br>

### 복소수(Complex Number)

```python
#복소수는 j로 나타낸다
a = 5
b = 3
complexNumber = a + bj
```

<br>

<br>

<br>

### 진수 표현법

| N진수  | 표현법 |
| :----: | ------ |
| 2진수  | 0b     |
| 8진수  | 0o     |
| 16진수 | 0x     |

<br>

<br>

<br>

### 비트 연산자(Bitwise operation)

| 비트 연산자 | 의미                                           |
| :---------: | ---------------------------------------------- |
|    A & B    | A와 B의 비트간 and 연산을 수행함               |
|   A \| B    | A와 B의 비트간 or 연산을 수행함                |
|    A ^ B    | A와 B의 비트간 배타적 논리합 xor 연산을 수행함 |
|     ~A      | A의 비트를 반점시킴. 즉 A의 1의 보수를 만듦    |
|   A >> n    | A의 모든 비트를 n만큼 오른쪽으로 시프트 시킴   |
|   A << n    | A의 모든 비트를 n만큼 왼쪽으로 시프트 시킴     |

<br>

<br>

<br>

### 시퀀스 자료형

 : 어떤 객체가 순서를 가지고 나열되어 있는 것

ex) 문자열, 리스트, 듀플

<br>

|   특성   | 설명                                                         | 예시                            |
| :------: | ------------------------------------------------------------ | ------------------------------- |
|  인덱싱  | 인덱스를 통해 해당 값에 접근<br>인덱스는 0부터 시작          | index[0]                        |
| 슬라이싱 | 특정 구간의 값을 취할 수 있음<br>구간은 시작 인덱스와 끝 인덱스로 정의 | index[시작점:끝점(미포함):간격] |
|   연결   | '+'연산자를 이용해 두 시퀀스 자료를 연결                     |                                 |
|   반복   | '*'연산자를 이용해 시퀀스 자료를 여러 번 반복                |                                 |
| 멤버체크 | 'in' 키워드를 사용하여 특정 값이 시퀀스 자료의 요소에 속해 있는지 확인 | <value> in <data>               |
| 크기정보 | 'len()'을 이용해 시퀀스 자료의 크기를 알 수 있음<br>문자열의 경우 문자의 개수, 리스트와 튜플인 경우 멤버의 개수 | len(index)                      |

<br><br><br>

### 가변인자(*변수명)

 : 인자의 개수가 불명확한 경우 사용

가변 인자는 *args와 같이 인자 이름 앞에 *를 붙인다. args는 함수 내부에서 튜플로 처리됨

```python
def function1(*args):
    print(args)
```

<br>

### 미정 키워드 인자(**변수명)

 : 키워드 인자가 불명확한 경우 사용

함수 내부에서 dictionary로 처리됨

```python
def function2(**kwargs):
    print(kwargs)
```

<br><br><br>

### return - java와의 차이점

return이 ,로 여러개가 가능하다

```python
# Python
def reverse(x,y,z):
    return z,y,x
```



```java
//Java
public class ReturnTest {

	String returnStr(String x, String y, String z) {
		return z+y+x;
	}
//	int returnInt(int x, int y, int z) {
//		return z,y,x;
	/*
	 Multiple markers at this line
	- void is an invalid type for the variable x
	- Syntax error on token "return", void expected
	- void is an invalid type for the variable z
	- void is an invalid type for the variable y
	 */
//	}
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		
		String result = rt.returnStr("잘 부탁해", "파이썬", "안녕");
		System.out.println(result);	//안녕파이썬잘 부탁해
	}//end of main
}//end of class
```

Java로 reverse를 사용하려면 reverse함수를 쓰거나 알고리즘으로 처리할 것 같다.

<br>

