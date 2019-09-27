# 몫과 나머지

​	a, b 두 개의 자연수가 주어졌을 때,

a를 b로 나눈 몫과 나머지를 구하는 방법을 2가지 소개한다



## 일반적 방법(/ & %)

```python
a, b = map(int, input().split())
# Quotient: 몫
# Remainder: 나머지
Quotient, Remainder = a//b, a%b
```



## divmod

**python스러운 풀이**

```python
a, b = map(int, input().split())
Quotient, Remainder = divmod(a,b)
```



## 사용해야하는 경우

​	일반적인 경우는 작은 크기의 수를 계산할 때 효율적이다.

`divmod`는 크기가 큰 숫자를 계산할 때 효율적이다.