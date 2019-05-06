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



i = iter(range(10))
print(i) #<range_iterator object at 0x0000025DCC628F30>
print(next(i)) #0
print(next(i)) #1
print(next(i)) #2

'''
with
: 두개의 관련된 연산들 사이에서 어떤 작업을 수행할 때 유용
두개의 관련된 연산들이란, open()-close(), save()-restore() 같은 작업을 의미
'''
# with open('output.txt', 'w') as f:
#   f.write('Hello')

# #위의 문장은 아래와도 같다
# f = open('output.txt', 'w')
# f.write('Hello')
# f.close()
# #with문장은 이러한 작업을 자동으로 알아서 처리한다.


"""
bin(num) : 2진수 변환
oct(num) : 8진수 변환
hex(num) : 16진수 변환
"""
#2진수 길이를 알 수 있다.
n = 3
print(n.bit_length())

"""
int(num, N)
10진수인 num을 N진수로 변환
"""

"""
복소수
complex()
page105부터 다루면 됨
"""
```

