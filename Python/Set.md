# Set(집합)

### 집합 자료형의 특징

- ##### 중복을 허용하지 않는다.

- ##### 순서가 없다(Unordered).

<br>

set 자료형은 순서가 없기(unordered) 때문에 인덱싱으로 값을 얻을 수 없다.

set자료형에 저장된 값을 인덱싱으로 접근하려면 리스트나 튜플로 변환한 후 해야 한다.

```python
#리스트로 변환하여 인덱싱
l1 = list(s1)
l1[0:3]
print(l1[0:3])

t1 = tuple(s1)
print(t1[0:3])
```

<br><br><br>

```python
s1 = set([1,2,3,4,5,6])
s2 = set([4,5,6,7,8,9])
```

<br>

##### intersection(교집합)

```python
#intersection 교집합
#방법1
s1 & s2

#방법2
s1.intersection(s2)
```

<br><br>

#### union(합집합)

```python
#union 합집합
#방법1
s1 | s2

#방법2
s1.union(s2)
```

<br>

<br>

#### difference(차집합)

```python
#difference 차집합
s1 - s2 #{1, 2, 3}

s2 - s1 #{8, 9, 7}

s1.difference(s2) #{1, 2, 3}
```

<br><br>

#### 대차차집합

```python
s1 ^ s2 #{1, 2, 3, 7, 8, 9}
```

<br><br>

### 집합 자료형 관련 함수들

##### add(elem)

 : 1개의 값만 추가할 때

```python
s1.add(4)
```

<br>

##### update(x)

  : 여러 개의 값을 한꺼번에 추가할 때

```python
s1.update([5,6,7])
```

<br>

##### remove(x)

 : 특정 값을 제거

```python
#remove - 1개의 값 제거
s1.remove(7)
```





