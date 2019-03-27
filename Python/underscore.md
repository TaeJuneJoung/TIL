### :one:

### underscore

`_ (underscore)`

python에서의 `_`는 크게 5가지의 경우로 사용된다.

1. **인터프리터(Interpreter)에서 마지막 값을 저장할 때**

   ```python
   #인터프리터에서 실행할 때(python)
   >>> 10
   10
   >>> _
   10
   >>> _ *2
   20
   >>> _ *2
   40
   ```

2. **값을 무시하고 싶을 때**

   ```python
   x, _, y = (1,2,3)
   print(x,y)	#1 3
   print(_)	#2
   
   x,*_,y = [1,2,3,4,5,6,7]
   print(x,y)	#1 7
   print(_)	#[2,3,4,5,6]
   ```

   for문에서도 사용될 수 있다. 예로서는 '프로그래머스 문제답안 일부분에서 볼 수 있다.'

   ```python
   for _ in range(arrA_len):
       if arrA == arrB:
           return True
       arrA = rotate(arrA)
   ```

   

3. **특별한 의미의 네이밍을 할 때**

   파이썬 컨벤션 가이드라인 `PEP8`에서는 다음과 같은 4가지의 언더스코어 활용 네이밍 컨벤션을 권장한다.

   `_single_leading_underscore`

   ​	: private class/function/method/variable를 선언할 때 사용하는 컨벤션

   ​	private는 주로 한 모듈 내부에서만 사용

   ​	해당 컨벤션을 사용하면 `from module import *`시 _로 시작하는 것들은 모두 임포트에서 무시

   ​	But, python에서는 private를 지원하고 있지는 않기 때문에 완전히 강제할 수는 없다.

   ​	 <span style="background-color:yellow">import문에서는 무시되지만 직접 가져다 쓰거나 호출을 할 경우엔 사용이 가능하다.</span>

   `__double_leading_underscores`

   ​	: 컨벤션이라기보다는 하나의 문법적인 요소.

   https://mingrammer.com/underscore-in-python/

   ​	클래스 속성명을 Mangling하여 

   <span style="color:green">Mangling 알아보기</span>

4. 국제화(Internationalization, i18n) / 지역화(Localization, l10n)함수로써 사용할 때

5. 숫자 리터럴값의 자릿수 구분을 위한 구분자로써 사용할 때

<span style="color:green">국제화와 지역화에 대해서 알아보기</span>



