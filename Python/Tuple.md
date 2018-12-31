# Tuple(튜플)

 : 리스트와 거의 비슷<br>

**리스트와 다른 점**

- 리스트는 []로 둘러싸지만 튜플은 ()로 둘러싼다
- 튜플은 그 값을 바꿀 수 없다.

<br><br>

```python
#Tuple
tuple1 = ()
tuple2 = (1,2,3)
tuple3 = 1,2,3
```

값을 변경시킬 수 있는가 없는가

리스트의 항목값은 변경이 가능하고, 튜플의 항목값은 변경이 불가능

<br>

```python
# Tuple 선언

tuple1 = (1,2,3,'a','b')
```

<br>

##### 튜플 요소값 삭제 시 오류

```python
# 튜플 요소값 삭제 시 오류
del tuple1[0]
'''
Traceback (most recent call last):
  File "tupleStudy.py", line 6, in <module>
    del tuple1[0]
TypeError: 'tuple' object doesn't support item deletion
'''
```

<br>

##### 튜플 요소값 변경 시 오류

```python
# 튜플 요소값 변경 시 오류
tuple1[0] = 5
'''
Traceback (most recent call last):
  File "tupleStudy.py", line 15, in <module>
    tuple1[0] = 5
TypeError: 'tuple' object does not support item assignment
'''
```

<br>

```python
#튜플 인덱싱
tuple1[0]

#튜플 슬라이싱
tuple1[3:]

#튜플 더하기
tuple2 = (4,5,'c')
tuple1 + tuple2

#튜플 곱하기
tuple1*3

#튜플 길이 구하기
len(tuple1)
```

<br>

```python
# 하나 더 이해하고 넘어갈 것
beforeId = id(tuple1)
tuple1 = tuple1 + (4,)
afterId = id(tuple1)
print(tuple1)
print(beforeId, afterId) # 두 값은 다름
#튜플의 값이 변경된 것이 아니라 새로운 tuple1가 생겨 값을 저장했음을 알 수 있다.
```

<br>