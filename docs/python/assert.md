# Assert

## 가정 설정문 assert

**assert 뒤의 조건이 True가 아니면 AssertError 발생**

```python
assert 조건문, '에러 메시지'
```



```python
def test(a):
    assert type(a) is int, '[Error]정수가 아닙니다.'
    print(a)

test(3)
test('error')

"""
결과값]
3
Traceback (most recent call last):
  File "test.py", line 6, in <module>
    test('error')
  File "test.py", line 2, in test
    assert type(a) is int, '[Error]정수가 아닙니다.'
AssertionError: [Error]정수가 아닙니다.
"""
```



위의 내용을 if문으로 바꿔서 사용할 수도 있다.

```python
def test(a):
    if type(a) is int:
        print(a)
    else:
        #raise를 이용해 에러를 발생시킴
        raise '[Error]정수가 아닙니다.'

test(3)
test('error')

"""
결과값]
3
Traceback (most recent call last):
  File "test.py", line 8, in <module>
    test('error')
  File "test.py", line 5, in test
    raise '[Error]정수가 아닙니다.'
TypeError: exceptions must derive from BaseException
"""
```



위의 a의 값이 숫자 값이 나오거나 숫자가 아닌 경우에는 `None`의 값을 나타내어 주는 소스를 나타내보자.

```python
def test(a):
    try:
        assert type(a) is int, '[Error]정수가 아닙니다.'
    except AssertionError as e:
        print(e)
        a = None
    print(a)

test(3)
test('error')
```



위의 문장을 if문으로 바꾸어 봤을 때,

```python
def test(a):
    if type(a) is not int:
        print('[Error]정수가 아닙니다.')
        a = None
    print(a)

test(3)
test('error')
```



## 왜 assert를 사용하는가?

단순히 에러를 찾는 것이 아니라 **값을 보증하기 위해 사용**

실수를 가정해 값을 보증하는 방식으로 코딩 하기 때문에 '방어적 프로그래밍'을 할 수 있다.



```python
#example)
def test(list_data):
    for i in range(len(list_data)):
        try:
            assert type(list_data[i]) is int, '[Error]정수가 아니기에 변경합니다 -> None값'
        except AssertionError as e:
            print(e)
            list_data[i] = None
    print(list_data)

list_data = [3,7,5,9,'abc',None,1]
test(list_data)
```

