### :one:

### Local&Global Variable

```java
public class LocalGlobal {
	public static void main(String[] args) {
		
		Test test = new Test();
		test.my_func_1();//1
		System.out.println(test.a);//1
        //결과값 : 11
		
	}
}


class Test{
	
	int a = 1;
	
	void my_func_1() {
		int a = 5;
		my_func_2();
	}
	
	void my_func_2() {
		System.out.print(a);
	}
}
```

