# Range 구현

## 필요한 요소

파이썬에서 **Overloading**을 사용하기 위해서 설치

자체적으로 가지고 있는 overload annotation도 있는데, 사용에 오류를 껶어 방향을 돌렸다.

```bash
pip install multipledispatch
```



## 구현 내용

```python
from multipledispatch import dispatch

"""
Class Range:

# Variance
start: 시작점
end: 끝점
step: 간격
isReverse: 시작점이 큰지 끝점이 큰지 판별

# Method
__init__(): 기본 생성자[overloading]
i) 끝점을 받아 처리
ii) 시작점, 끝점, 간격을 받아 처리

__iter__(): 이터레이터
return self

__next__(): self 내용을 다음으로 넘어갈 수 있게 처리
value: self.해당값
return value
"""
class Range:
    #dispatch를 이용하여 overloading처리
    @dispatch(int)  
    def __init__(self, end):
        self.end = end
        self.start = 0
        self.step = 1

    @dispatch(int, int, int)  
    def __init__(self, start, end, step=1):
        self.start = start
        self.end = end
        self.step = step
        self.isReverse = True if start <= end else False 

    def __iter__(self):
        #이터레이터로 자신을 리턴
        return self
    
    def __next__(self):
        if self.isReverse:
            if self.step < 0:
                raise StopIteration
            if self.start < self.end:
                value = self.start
                self.start += self.step
                return value
            else:
                raise StopIteration
        else:
            if self.step > 0:
                raise StopIteration
            if self.start > self.end:
                value = self.start
                self.start += self.step
                return value
            else:
                raise StopIteration

```

