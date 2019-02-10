# DataType

JavaScript

 : 느슨한 타입(loosely typed) 언어, 혹은 동적(dynamic) 언어이다. 변수의 타입을 미리 선언할 필요가 없다는 뜻이다.

<br>

**ECMAScript표준 7개의 자료형**

1. Boolean
2. Null
3. Undefined
4. Number
5. String
6. Symbol(ECMAScript 6에 추가)
7. Object

<br>

## Primitive values

 : 기본 타입. 오브젝트를 제외한 모든 값은 변경 불가능한 값(immutable value).

<br>

### Boolean

- true / false

<br>

### Null

- null

<br>

### Undefined

- undefined

  : 값을 할당하지 않은 변수는 undefined를 가진다.

<br>

Boolean, Null, Undefined 타입은 상수이므로, 다른 오브젝트를 표현할 수 없다.

<br>

### Number

- 숫자

- NaN

  : Not a Number

- +/-Infinity

  ```js
  /* 0과 -0은 같지만 `/`연산자를 사용하였을 때는 다르다. */
  > +0 === -0
  true
  > 42 / +0
  Infinity
  > 42 / -0
  -Infinity
  ```

<br>

### String

 : 변경 불가능하나, 원래 문자열에서 일부가 수정된 다른 문자열을 만드는건 가능.

##### String.substring(indexStart[, indexEnd])

 : String.substr이 있었으나, deprecated가 되었으니 substring()을 사용하길 권장.

:egg:**Parameters**

`indexStart`

```
The index of the first character to include in the returned substring.
```

`indexEnd`

```
Optional. The index of the first character to exclude from the returned substring.
```

:hatching_chick:**Return value**​

```
A new string containing the specified part of the given string.
```

<br>

```js
/*
String.substring(시작인덱스[, 종료인덱스) - 종료 인덱스는 미포함
exclude : 들어오지 못하게 하다, 배제하다

Hello
01234
인덱스에 Python과 달리 -인덱스의 개념은 없음
*/

> "Hello".substring(0,2)
He

> "Hello".substring(0,2) + " study JS"
He study JS

> "Hello".length
5

/*
-인덱스를 사용하고 싶다면 slice()를 사용하여도 된다.
slice(indexStart[, indexEnd]) - 마지막 인덱스도 포함한다.
*/
```

<br>

##### String.concat(String2[, String3, ... , StringN])

:egg:**Parameters**

`String2 ... StringN`

```
Strings to concatenate to this string.
```

:hatching_chick:**Return value**

```
A new string containning the combined text of the strings provided.
```

<br>

```js
/*
String.concat(String2[, String3, ... , StringN])
+와 += 같은 역할을 함. +=로 여러개를 해야할 때,
반복문없이 메소드로 이용할 수 있기에 편리함
*/
> "Hello".concat(" study"," JS")
Hello study JS
```

<br>

### Symbol

 : 유일하고 변경 불가능한 기본값. 객체 속성의 key값으로도 사용될 수 있다.

 C언어의 이름있는 열거형(enum)과도 비슷.

<br>

<hr>

### Object

 : 식별자(Identifier)로 참조할 수 있는, 메모리에 있는 값



