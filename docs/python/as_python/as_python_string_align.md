# 문자열 정렬

## 정렬하기

- 좌측정렬: `ljust`
- 가운데정렬: `center`
- 우측정렬: `rjust`

```python
s = 'abc'
n = 10 #문자열 크기

print(s.ljust(n))
print(s.center(n))
print(s.rjust(n))
```

```bash
#결과값
abc       
   abc    
       abc
```



## 추가학습

​	10개의 공간에서 문자열이 차지한 공간을 제외한 부분은 '-'표시한다

```python
s = 'abc'
n = 10 #문자열 크기

print(s.ljust(n, '-'))
print(s.center(n, '-'))
print(s.rjust(n, '-'))
```

```bash
#결과값
abc-------
---abc----
-------abc
```



**format string**

- 참고 링크: https://docs.python.org/3/library/string.html#formatstrings

```python
s = 'abc'
n = 10 #문자열 크기

for align in '<^>':
    print('{:{align}{width}}'.format(s, align=align, width=n))
```

이 부분은 이해하기 어렵다... 그래도 익숙해지면 당연히 좋다.





## 일반적인 방법

```python
s = 'abc'
n = 10 #문자열 크기

print(s) #좌측정렬
print(' '*((n-len(s))//2) + s) #중앙정렬
print(' '*(n-len(s)) + s)
```

