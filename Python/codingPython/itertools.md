### itertools

 : 자신만의 반복자를 만드는 모듈

<br>

**chain()**

```python
import itertools

a = [1,2,3]
b = ['a','b','c']
c = [0.1,0.2,0.3]

print(list(itertools.chain(a,b,c))) # [1, 2, 3, 'a', 'b', 'c', 0.1, 0.2, 0.3]
```

list의 `extend`와 비슷함

<br>

**count()**

```python
from itertools import count

for number, letter in zip(count(0, 10), ['a', 'b', 'c', 'd', 'e']):
    print(f"{number}: {letter}")
```

python3에서는 itertools의 `izip`은 사용불가하며, `zip`을 사용하면 된다.. zip은 itertools 모듈을 받지 않아도 사용 가능하게 되었다.<br>

`count` 반복하고자 하는 최대수를 미리 알지 않아도 되는 경우 사용<br>

위 소스에는 0으로 시작하여 요소에 대해 10씩 증가하게 되어있음. step만 있는 range와 비슷함<br>

`imap` 또한 `map`을 사용하면 된다.

<br>

**islice()**

```python
from itertools import islice

for i in islice(range(10), 5):
    print(i)
```

`islice(반복 가능 객체, 시작 색인, 끝 색인, step)`

<br>

**tee()**

```python
from itertools import tee

i1, i2 = tee(range(10), 2)
print(i1==i2) # False
print(i1 is i2) # False
print(i1) # <itertools.tee object at ...>
print(list(i1)) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(list(i1)) # []
print(i2) # <itertools.tee object at ...>
print(list(i2)) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(list(i2)) # []
```

`tee(반복 가능 객체, 복사본 갯수)`<br>

한번 사용된 reference는 더 이상 값을 참조 하지 않는다.

<br>

**permutations()**

```python
from itertools import permutations
mylist = [1,2,3]
mypermuatation =  permutations(mylist)
for i in mypermuatation:
    print(i)
# (1, 2, 3)
# (1, 3, 2)
# (2, 1, 3)
# (2, 3, 1)
# (3, 1, 2)
# (3, 2, 1)
```

`permutations(반복 가능 객체[,만들 수 있는 길이])`

<br>

<br>

이외에도 다양하게 있지만 위에 나오는 메소드들과 동일하게 다른 방도로 구현할 수 있는 방법이 많아 링크만 첨부

[참조링크](https://hamait.tistory.com/803)