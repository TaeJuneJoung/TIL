# Java_basic

### Abstraction(추상화)

 : 현상에 존재하는 객체의 주요특징을 추출하는 과정

<br>

### Encapsulation(캡슐화)

 : 하나의 클래스 안에 데이터와 기능을 담아 정의하고, 중요한 데이터나 복잡한 기능 등은 숨기고, 외부에서 사용에 필요한 기능만을 공개하는 것

<br>

### Inheritance(상속)

 : 객체 정의 시 기존에 존재하는 객체의 속성과 기능을 상속받아 정의하는 것

<br>

### Polymorphism(다형성)

 : 같은 타입 또는 같은 기능의 호출로 다양한 효과를 가져오는 것

<br><br><br>

##### Framework

 : 프레임워크란 기본적인 SW의 구조(Architecture)를 구현하고, 프로그래밍에 필요한 라이브러리를 포함하고 있는 반제품 형태의 SW를 의미. 잘 짜인 구조가 미리 프로그래밍화 되어 있기 때문에 안정적이고, 빠른 개발을 할 수 있다. 개발자가 추가적으로 프로그램을 작성하여 실행하면 프레임워크에 의해 실행된다.

<br>

##### plateform

 : 어떤 작업을 하기 위한 기반을 의미. 이야기하고자 하는 작업이 무엇이냐에 따라 Platform은 달라질 수 있다.

컴퓨팅에서 platform은 소프트웨어가 구동 가능한 하드웨어 아키텍처나 소프트웨어 프레임워크의 종류를 설명하는 단어.

<br>

##### Application Framework

 : 프로그래밍에서 특정 운영체제 위한 응용 프로그램 표준 구조를 구현하는 클래스와 라이브러리 모임

<br>

<br>

## 자바의 특징

1. 객체지향
2. 플랫폼 독립적
3. 간단하다
4. 분산 프로그래밍 지원
5. 멀티 스레드

<br><br><br>

### Java 설치

- JavaSE SDK<br>

##### 환경변수 설정(Window 기준)

- JAVA_HOME : javaSE 설치경로

  ex) C:\Program Files\Java\jdk...

- Path : JavaSE설치경로\bin;

  ex)C:\Program Files\Java\jdk...\bin

<br>

##### Eclipse Java EE 설치

<br><br><br>

##### :wave: Java "Hello Java"

```java
public class HelloJava {
	
	/* Console에 찍어서 확인해보기 위해선 main method가 필요 */
	public static void main(String[] args) {
		
		System.out.print("Hello,\t");
		System.out.println("Java\nString + Int : " + 5);
		/*
		 * Python은 인터프리터가 데이터의 형태를 결정하기에 String + Integer에서
		 * 명시적 변환을 하여야하지만, Java에서는 컴파일러가 소스를 읽으며 자동 변환이 된다.
		 * String이 Integer보다 크기에 Promotion이 일어난다.
		 */
		
	}//end of main
}//end of class
```

<br><br>

##### Java에서 합집합, 차집합, 교집합, 대칭차집합 구하기

```python
array1 = [1,2,3,4,5]
array2 = [4,5,6,7,8]

print(array1 | array2) #합집합
print(array1 - array2) #차집합
print(array1 & array2) #교집합
print(array1 ^ array2) #대칭차집합
```

<br>

```java
//자바에서는 위의 python소스처럼 합집합, 차집합, 교집합, 대칭차집합을 구할순 없다.
int array1[] = {1,2,3,4,5};
int array2[] = {4,5,6,7,8};

System.out.println(array1 - array2);
```

:grey_question:   Java에서는 어떻게 해야 구할 수 있을까?

