# Jump to Python - Data Type

https://wikidocs.net/

<br><br>

### 파이썬의 자료형

- ##### 숫자형

  1. 정수(Integer)

     : 양의 정수, 음의 정수, 0<br>

  2. 실수(Floating-point)

     : 소수(소수점이 포함된 숫자들)<br>

  3. 2진수(Binary number)<br>

  4. 8진수(Octal)<br>

  5. 16진수(Hexadecimal)<br>

<br>

[참고자료 : [2, 8, 16진수 표현법]](https://github.com/TaeJuneJoung/TIL/blob/master/Python/beginner200/Python200ProblemsForBeginners_1.md#%EC%A7%84%EC%88%98-%ED%91%9C%ED%98%84%EB%B2%95)

<br><br><br>

​		**- 숫자열에서의 사칙연산**

​		<br>

| 연산자 | 설명            | 예시 \| 결과값 | 비고         |
| :----: | --------------- | -------------- | ------------ |
|   +    | 더하기          | 3+ 5 \| 8      |              |
|   -    | 빼기            | 7 - 2 \| 5     |              |
|   *    | 곱하기          | 3 * 2 \| 6     |              |
|   /    | 나누기          | 3 / 2 \| 1.5   | python2 -> 1 |
|   **   | 제곱            | 3**4 \| 81     |              |
|   //   | 나눗셈의 몫     | 7//2 \| 3      |              |
|   %    | 나눗셈의 나머지 | 7//2 \| 1      |              |

<br><br><br>



- ##### 문자열 자료형(String)

  : 

  char(Character)형은 없는지 알았으나, 있다.

  char형태는 문자를 의미

  String이 문장이라면 그 내부의 하나하나의 문자는 char라고 보면 된다.

  String을 index로 접근할 수 있는 이유라고 생각하면 쉽다.

  각 문자마다 숫자로 변경이 가능.

  ```python
  #[char -> int]
  >>> ord('a')
  #결과값 : 97
  
  # [int -> char]
  >>> chr(97)
  #결과값 : 'a'
  ```



  <br>

  <br>

  <br>

- ##### 리스트 자료형

  : 

  <br>

  <br>

  <br>

- ##### 튜플 자료형

  : 

  <br><br><br>

- ##### 딕셔너리 자료형

  : [참조 링크](https://github.com/TaeJuneJoung/TIL/blob/master/Python/Dictionary.md)

  <br><br><br>

- ##### 집합 자료형

  : 

  <br><br><br>

- ##### 불 자료형(bool)

  : **True**(참)과 **False**(거짓)을 나타내는 자료형

  문자열, 리스트, 튜플, 딕셔너리 등의 값이 비어 있으면 False(거짓)가 된다. 숫자에서는 값이 0일 때 False가 된다.

  ex) "", (), [], {}, 0, None 일 때는 False 



  ```python
  if(text.lower() == '!menu' or '!메뉴'):
      print(text)
  ```

<br>   처음 이러한 실수를 함. text가 '!menu'와 같지 않아도 뒤에 '!메뉴'가 True의 결과를 나타내기에 항상 결과는 True가 나온다. 올바른 결과를 실행하기 위해서는 아래와 같이 변경해주어야 한다.

  ```python
  if(text.lower() == '!menu' or text == '!메뉴'):
      print(text)
  ```
