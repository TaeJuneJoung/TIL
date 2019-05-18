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

### Str

```python
"""
 -남은 자리는 white space가 들어간다
 -부족하면 해당 값만 출력
"""
res = '{0:5s}'.format('egg')
print(res) #egg 
print(len(res)) #5

"""
m개의 최소 자리를 확보하고,
n개의 소수점 이하 자리를 출력
반올림을 알아서 함
값과 공간할당에 빈공간만큼 처음 시작에 white space
왼쪽 정렬 출력으로 하고 싶으면 `<`사용하면 됨.
오른쪽 정렬은 반대로 `>`
"""
res = '{0:10.3f}'.format(123.456789)
print(res) #   123.456

res = '{0:<10.3f}'.format(123.456789)
print(res) #123.456

res = '{0:<+10.3f}'.format(123.456789)
print(res) #+123.456

#-는 출력되지 않음
res = '{0:<-10.3f}'.format(123.456789)
print(res) #123.456

#부호가 값과 반대일때는 적용되지 않음
res = '{0:<+10.3f}'.format(-123.456789)
print(res) #123.456

"""
2진수 출력에는 #b
8진수 출력에는 #o
16진수 출력에는 #x
"""
res = '{0:#b}'.format(123)
print(res) #0b1111011

res = '{0:#o}'.format(123)
print(res) #0o173

res = '{0:#x}'.format(123)
print(res) #0x7b

"""
빈공간 특정값 출력
"""
res = '{0:05d}'.format(123)
print(res) #00123



"""
문자열 메서드
"""
res = 'I like programming'
print(res.upper()) #I LIKE PROGRAMMING
print(res.lower()) #i like programming
print(res.swapcase()) #i LIKE PROGRAMMING
print(res.capitalize()) #I like programming
print(res.title()) #I Like Programming

print(res.rindex('i'))
print(len(res))

# res[res.rindex('i')] = 'I' TypeError: 'str' object does not support item assignment
#str타입은 아래와 같이 변경
res = res.replace(res[res.rindex('i')],'I', 1)
print(res) #I lIke programming
print(res.rindex('i'))

res = 'I like programming'
def replaceRight(original, old, new, count_right):
    repeat=0
    text = original
    
    count_find = original.count(old)
    if count_right > count_find : # 바꿀 횟수가 문자열에 포함된 old보다 많다면
        repeat = count_find # 문자열에 포함된 old의 모든 개수(count_find)만큼 교체한다
    else :
        repeat = count_right # 아니라면 입력받은 개수(count)만큼 교체한다

    for _ in range(repeat):
        find_index = text.rfind(old) # 오른쪽부터 index를 찾기위해 rfind 사용
        text = text[:find_index] + new + text[find_index+1:]
    
    return text

print(replaceRight(res, res[res.rindex('i')], 'I', 1))

res = '''I 
        like 
        programming'''
print(res.splitlines()) #['I ', 'like ', 'programming']
print(res.split(' ', 1)) #['I', '\nlike \nprogramming']

res = 'I like programing'
print(res.center(30, '-')) #------I like programing-------
print(res.ljust(30, '-')) #I like programing-------------
print(res.rjust(30, '-')) #-------------I like programing

instr = 'abcdef'
outstr = '123456'
trantab = ''.maketrans(instr, outstr)
print(trantab)
```

