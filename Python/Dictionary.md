# 딕셔너리(Dictionary)

##### : 대응관계를 나타낼 수 있는 자료형을 연관 배열(Associative array) 또는 해시(Hash)라고 한다.

##### 파이썬은 이러한 기능을 딕셔너리(Dictionary)가 한다. 딕셔너리는 리스트나 튜플처럼 순차적으로 해당 요소값을 구하지 않고 Key를 통해 Value를 얻는다. - Java의 컬렉션 Map과 동일

<br><br>

```python
dic = {'name':'TaeJune', 'birth':'0525', 'hobby':'coding'}
```

|  key  |  value  |
| :---: | :-----: |
| name  | TaeJune |
| birth |  0525   |
| hobby | coding  |

<br>

```python
dic['name']
dic['birth']
dic['hobby']

[결과값]
TaeJune
0525
coding
```

<br>

<br>

### :one:딕셔너리 요소 삭제하기

```python
del dic['hobby']
dic

[결과값]
{'name': 'TaeJune', 'birth': '0525'}
```

| key   | value   |
| ----- | ------- |
| name  | TaeJune |
| birth | 0525    |

<br>

<br>

### :two:딕셔너리 요소 추가하기

```python
dic['hobby'] = ['coding','listen to music','play a game']
dic

[결과값]
{'name': 'TaeJune', 'birth': '0525', 'hobby': ['coding', 'listen to music', 'play a game']}
```

| key   | value                                        |
| ----- | -------------------------------------------- |
| name  | TaeJune                                      |
| birth | 0525                                         |
| hobby | ['coding', 'listen to music', 'play a game'] |

<br>

<br>

### :three:딕셔너리를 만들 때 주의사항

- ##### key 값은 고유해야 하므로 중복하게 놓으면 하나를 제외한 나머지는 무시된다는 점. 가장 뒤에 쓰인 것을 인식한다.

- ##### key에 리스트는 쓸 수 없다. 그러나, 튜플은 사용할 수 있다. key값이 변하는 것인지 변하지 않는 것인지에 key값을 쓸 수 있느냐, 없느냐가 달려 있다.

<br>

<br>

### :four:딕셔너리 관련 함수들

<br>

##### len(dic)

 : Return the number of items in the dictionary dic.

<br>

##### key in dic

 : Return `True`  if dic has a key *key*, else `False`.

<br>

##### key not in dic

 : Equivalent to `not key in dic`.

<br>

##### :question:iter(dic)

 : Return an iterator over the keys of the dictionary. This is a shortcut for `iter(dic.keys())`.

<br>

##### keys()

 : Return a new view of the dictionary's keys.

##### values()

 : Return a new view of the dictionary's values.

##### items()

 : Return a new view of the dictionary's items(`(key, value)` pairs).

<br>

##### get(key,[, *default*])

 : Return the value for key if key is in the dictionary, else *default*. **If defaults is not given, it defaults to None, so that this method never raises a keyError.**

<br>

##### clear()

 : Remove all items from the dictionary.

<br>

##### copy()

 : Return a shallow copy of the dictionary.

<br>

##### :question:fromkeys(iterable[, *value*])

 : Create a new dictionary with keys from iterable and values set to value.

  fromkeys() is a class method that returns a new dictionary. value defaults to `None`.

<br>

##### pop(key[, `default`])

 : If key is in the dictionary, remove it and return its value, else return default. If default is not given and key is not in the dictionary, a KeyError is raised.

<br>

##### popitem()

 : Remove and return a `(key, value)` pair from the dictionary. Pairs are returned in <u>LIFO</u> order.

<br>

##### :question:setdefault(key[, `default`])

 : If key is in the dictionary, return its value. If not, insert key with a value of default and return default. default defaults to `None`.

<br>

##### :question:update([other])

 : Update the dictionary with the key/value pairs from other, overwriting existing keys. Return `None`.

<br>

<br>

<br>

<hr>

2018.12.24

:question: 표시된 내용들 추후에 다뤄볼 것

document를 보는 연습을 위해 영어로 작성함.

