# this

파이썬을 하다 궁금증이 생긴 java의 this

python은 `self`가 독립적으로 사용이 가능하다.

'java는 독립적으로 사용이 불가할텐데...'라는 의문으로 시작한 this 알아보기

```java
public class InstanceTest {
	static String name = "Java에서는 this만 사용할수 없으니...";

	public static void main(String[] args) {
		Person iu = new Person();
		String result = iu.greeting(name);
		System.out.println(result);
	}//end of main
    
}//end of class

class Person {
	String name = "홍길동";
	
    public String greeting(String name) {
		return name+ "입니다";
	}
    
}//end of class
```

instance를 만드는 Person class와 테스트를 하는 공간인 InstanceTest에 name 변수를 만들어 테스트

<br>

결과 : `Java에서는 this만 사용할수 없으니...입니다`

static으로 인하여 먼저 스택에 쌓이기에 발생하는 문제가 아닐까라는 의문으로 다시 테스트



```java

public class InstanceTest {
	static String name = "Java에서는 this만 사용할수 없으니...";

	public static void main(String[] args) {
		Person iu = new Person();
		String result = iu.greeting(name);
		System.out.println(result);
	}//end of main
	
}//end of class

class Person {
	static String name = "홍길동";
	public String greeting(String name) {
		return name+ "입니다";
	}
}
```

결과 : `Java에서는 this만 사용할수 없으니...입니다`

Person class에서 인스턴스를 만들지만 InstanceTest에서 출력하기에 똑같은 결과가 나옴<br>

그렇다면, 다른 값으로 나타태는 방법들은 없을까?



##### 출력하는 공간. main method에서 변수에 값을 선언하여 진행

```java

public class InstanceTest {
	static String name = "Java에서는 this만 사용할수 없으니...";

	public static void main(String[] args) {
		String name = "임꺽정";
		Person iu = new Person();
		String result = iu.greeting(name);
		System.out.println(result);
	}//end of main
	
}//end of class

class Person {
	String name = "홍길동";
	public String greeting(String name) {
//		name = this.name;
		return name+ "입니다";
	}
}
```

결과 : `임꺽정입니다`

그렇지만, main method에서 값을 변형하는 것은 사용하지 않고 출력만 위주로 하도록...



##### Person에 있는 값 this를 이용하여 가져오기

```java

public class InstanceTest {
	static String name = "Java에서는 this만 사용할수 없으니...";

	public static void main(String[] args) {
		String name = "임꺽정";
		Person iu = new Person();
		String result = iu.greeting(name);
		System.out.println(result);
	}//end of main
	
}//end of class

class Person {
	String name = "홍길동";
	public String greeting(String name) {
		name = this.name;
		return name+ "입니다";
	}
}
```

결과 : `홍길동입니다`

greeting method에 클래스 변수를 매개변수값에다가 넣어 결과값을 만들어냅니다.

