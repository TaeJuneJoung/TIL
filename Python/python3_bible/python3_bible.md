정리 아직 하지 않음.

```python
#eval() 함수
a = 3
a = eval('a+4')
print(a) #7


# eval('b = b+4')
"""
Traceback (most recent call last):
  File "test.py", line 6, in <module>
    eval('b = b+4')
  File "<string>", line 1
    b = b+4
      ^
SyntaxError: invalid syntax
"""


#exec() 함수
c = 5
exec('c = c+3')
print(c) #8



"""
[참조 횟수를 확인하는 방법]
getrefcount 횟수도 한번 포함하므로 정확한 횟수를 파악하고자 한다면
결과값에 -1을 한 값이다.
"""
import sys
cnt = sys.getrefcount(c)
print(cnt)


"""
[객체의 주소값 식별]
"""
print(id(a))
print(id(c))
print(id(cnt))
```

