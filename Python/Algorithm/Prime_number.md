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

