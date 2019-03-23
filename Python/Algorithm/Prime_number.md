# Prime_number

`소수`



### 에라토스테네스의 체

```python
N = int(input())
isPrime = [False, False] + [True]*(N-1)
primes = []

for i in range(2, N+1):
    if isPrime[i]:
        primes.append(i)
        for j in range(2*i, N+1, i):
            isPrime[j] = False
print(primes)
```

위의 소스는 인터넷을 참조하여 짠 소스



가독성이 좋지 않은 것 같아 가독성을 중요시하여 만든 소스

```python
N = int(input())
prime = []

for i in range(2, N+1):
    isPrime = 1
    for j in range(2, i):
        if i%j == 0:
            isPrime = 0
            break
    if isPrime:
        prime.append(i)
print(len(prime))
```

