# n진법 10진법 변환


## int를 이용한 변환

​	n진법인 base값이 주어지고, n진법의 num값이 주어졌을 때 10진법으로 변환하면 값이 얼마인지 확인해보기

> **example.**
>
> input: 12 3
>
> output: 5
>
> 
>
> input: 444 5
>
> output: 124



```python
num, base = map(int, input().split())
print(int(str(num), base=base))
```

​	여기서 고려해야할 점이 `int(value, base=base)` 

> base: n진법
>
> value: n진법의 숫자값, **(단,타입은 string)**



## 보통 알고리즘 로직

```python
num, base = map(int, input().split())

value = 0
num = str(num)
for idx, n in enumerate(num[::-1]):
    value += int(n) * (base ** idx)
print(value)
```

