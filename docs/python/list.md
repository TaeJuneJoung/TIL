# List

## append

​	cpython의 append 설명 일부를 보면

> The growth pattern is:  0, 4, 8, 16, 25, 35, 46, 58, 72, 88, ...

이렇게 나와 있는 것을 보면 list.append()를 한다고 해서 뒤에 하나의 공간만 만들어지는 것이 아님을 알 수 있다. 값은 하나가 들어가 나오는 것은 해당 길이가 맞지만, 자원할당을 받는 크기는 위의 패턴에 맞다고 보면 된다.

**append()**의 시간 복잡도(time complexity)는 **O(1)**



## extend

​	**extend()**의 시간 복잡도는 **O(len(...))**으로 확장 길이에 따라 다르다.



### append와 extend의 차이점

append는 해당 값이 하나의 인덱스에 추가된다.

extend는 해당 값이 뒤에 추가된다. **(단, extend의 인자는 iterable해야한다.)**



## insert

​	아래의 소스에서 결과값은 무엇일까?

```python
nums = [1,2,5]

nums.insert(2, 3)
nums.insert(3, 4)
nums.insert(100, 4)

print(nums)
```

​	**insert(i, v)**는 i위치에 v를 추가하겠다는 의미이다. 리스트의 길이가 넘어가는 index값이 주어지면 append와 같은 기능이 된다.

**insert()**의 시간 복잡도는 **O(N)**이다.



## pop()

​	아래의 소스에서 결과값은 무엇일까?

```python
nums = [1,2,3,4,5]
print(nums.pop())
```

​	**pop()**의 인자가 `default`일 때, 가장 뒤에 값부터 가져온다.

뒤에서부터 가져올 때는 시간 복잡도가 **O(1)**이다.

반면에, **pop(0)**가 같은 경우에는 시간 복잡도가 **O(N)**이 된다.





## index()

​	값의 index 위치를 찾고 싶을 때 사용한다.

```python
nums = [1,2,3,4,5,4]

idx = nums.index(4)
idx = nums.index(4, nums.index(4)+1)

print(idx)
```

첫번째 idx와 같은 경우는 처음 나온 4의 위치를 반환한다.

두번째 idx와 같은 경우는 처음 나온 4의 위치+1부터 시작하여 처음 나온 4의 위치를 반환한다.

**index()**의 시간 복잡도는 **O(N)**이다.

첫번째 경우는 O(N)의 시간 복잡도를 가지고 있지만, 두번째는 O(N^2^)의 시간 복잡도를 가지고 있는 것이다.





### 느낀 점

​	C를 잘 알고 있다면 cpython 내용을 보면서 내부 구조를 이해할 수 있었을텐데, 아직 내부 구조까지는 이해하기는 어렵다. C언어도 틈틈이 공부해보자.