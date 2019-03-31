# Exaustive Search

`완전 검색`

 : 문제의 해법으로 생각할 수 있는 모든 경우의 수를 나열해보고 확인하는 기법

**Brute-force** 혹은 **Generate-and-test** 기법이라고도 한다.

일반적으로경우의 수가 상대적으로 작을 때 유용

<br>

- <span style="color:#007bff;">모든 경우의 수를 생성하고 테스트하기에 수행 속도는 느리지만, 해답을 찾아내지 못할 확률이 작다.</span>
- 자격검정평가 등에서 주어진 문제를 풀 때, 우선 완전 검색으로 접근하여해답을 도출 후, 성능 개선을 위해 다른 알고리즘을 사용하고 해답을 확인하는 것이 바람직하다.

<br>

### Sequential Search

`순차 검색`

 : 자료들의 리스트에서 키 값을 찾기 위해 첫 번째 자료부터 비교하면서 진행

```python
def sequentialSearch(a,n,key):
    i = 0
    while i < n and a[i] ! = key:
        i += 1
    if i < n:
        return i #성공
    else:
        return -1 #실패
```

순차 검색에서 리스트에 키 값이 존재하지 않는다는 것을 확신하기 위해서는 **모든 자료들에 대해 키 값과 비교 작업 수행**

<br>

### Permutation

`순열`

- 서로 다른 것들 중 몇 개를 뽑아서 한 줄로 나열하는 것

- 서로 다른 n개 중 r개를 택하는 순열 `nPr`

  > cf. 순열(nPr)과 조합(nCr)의 차이
  >
  > nPr = n개에서 r개를 뽑아 정렬하는 경우의 수
  >
  > nCr = n개에서 r개를 뽑는 경우의 수
  >
  > <br>
  >
  > 4P2 = 4 * 3 = 12
  >
  > 4C2 = 4! / (2! * (4-2)!) = 6 
  >
  > <br>
  >
  > 4P3 = 4 * 3 * 2 = 24
  >
  > 4C3 = 4! / (3! * (4-3)!) = 4

- nPn = n!이라고 표기하며 `Factorial`이라 한다

> example.
>
> {1, 2, 3} 을 포함하는 모든 순열을 생성하는 함수
>
> ```python
> for i in range(1, 4):
>  for j in range(1, 4):
>      if i != j:
>          for k in range(1, 4):
>              if k != i and k != j:
>                  print(i, j, k)
> ```
>
> <br>
>
> <span style="color:#007bff;font-weight:bold">재귀 호출을 통한 순열 생성</span>
>
> ```python
> """
> a[] : 데이터가 저장된 리스트
> n : 원소의 개수, k : 현재까지 선택된 원소의 수
> """
> def perm(k, n):
>     if k == n: #하나의 순열이 생성됨
>         print(a)  #원하는 작업 수행
>     else:
>         for i in range(k, n):
>             a[k], a[i] = a[i], a[k] #교환을 통한 선택
>             perm(k+1, n) #재귀 호출
>             a[k], a[i] = a[i], a[k] # 이전 상태 복귀
> ```
>
> <br>
>
> 라이브러리를 이용한 순열 생성방법
>
> ```python
> import itertools
> 
> a = [1,2,3]
> result = itertools.permutations(a) #(a, 3) r생략시 기본값은 리스트의 크기
> print(list(result))
> ```
>
> ```python
> #라이브러리를 활용한 중복순열
> import itertools
> 
> a = [1,2,3]
> result = itertools.product(a, repeat=3)
> print(list(result))
> ```

<br>

#### 조합적 문제

- 순서화된 요소들의 집합에서 최선의 방법을 찾는 것

### <span style="color:#007bff;font-weight:bold">TSP</span>

**순회 외판원 문제(Traveling Salesman Problem)**

- 여러 도시들이 있고 한 도시에서 다른 도시로 이동하는 비용이 주어짐

- 출발 도시에서 시작해서 다른 모든 도시들을 단 한 번만 방문하고 출발

- 방문할 도시들을 순서대로 나열하면 하나의 경로가 됨

<br>

**Lexicographic-Order(사전식 순서)**

 : 요소들이 오름차순으로 나열된 형태가 시작하는 하나의 순열

<br>

**Minimum-exchange requirement(최소 변경을 통한 방법)**

 : 각각의 순열들은 이전의 상태에서 단지 두 개의 요소들 교환을 통해 생성

- Johnson-Trotter 알고리즘

```
 ex)
 {1, 2, 3}순열에서 1과 3을 교환해서 {3, 2, 1}순열을 만듦
```

<br>

<br>

### 부분집합

: 집합에 포함된 원소들을 선택하는 것

 다수의 중요 알고리즘들이 원소들의 그룹에서 최적의 부분 집합을 찾는 것

> **배낭 짐싸기(Knapsack problem)**
>
> - 배낭과 물건들의 집합이 주어지며, 배낭은 무게가 있고 아이템들은 각각 무게와 가치가 있음
> - 배낭에 담는 무게의 총합 < 배낭의 무게
> - 물건의 총합이 배낭의 무게를 초과하지 않으면서 가치의 합이 최대가 되는 물건들을 선택하는 문제

N개의 원소를 포함한 집합

- 자기 자신과 공집합을 포함하여 모든 부분집합(Power set)의 개수는 2^n^ 개

> 비트 표현을 이용해서 부분집합을 생성하는 간단한 방법
>
> 바이너리 카운팅(Binary Counting)을 통한 사전적 순서
>
> - 부분집합을 생성하기 위한 가장 자연스럽고 간단한 방법
> - 바이너리 카운팅은 사전적 순서로 생성하기 위한 가장 간단한 방법
>
> ```python
> #바이너리 카운팅을 통한 부분집합 생성 코드
> arr = [1,2,3,4]
> N = len(arr) #원소의 개수
> 
> for i in range(1<<n): #1<<n 부분집합의 개수
>     for j in range(n): #원소의 수만큼 비트를 비교함
>         if i&(1<<j): #i의 j번째 비트가 1이면 j번째 원소 출력
>             print(arr[j], end=" ")
>     print()
> ```
>
> ```python
> #간결한 식
> arr = [1,2,3,4]
> for i in range(1<<len(arr)):
>     print([arr[j] for j in range(len(arr)) if & (1<<j)])
> ```

<br>

<br>

### Combination

`조합`

 : 서로 다른 n개의 원소 중 r개를 순서 없이 골라낸 것

<span style="color:#007bff;font-weight:bold">~n~C~r~ = ~n-1~C~r-1~ + ~n-1~C~r~ </span>#재귀적 표현

> <span style="color:#007bff;font-weight:bold">재귀 호출을 이용한 조합 생성</span>
>
> ```python
> """
> a[] : n개의 원소를 가지고 있는 리스트
> tr[] : 조합이 임시 저장될 r 크기의 리스트
> """
> def comb(n,r):
>     if r == 0:
>         print(tr)
>     elif n < r:
>         return
>     else:
>         tr[r-1] = a[n-1]
>         comb(n-1, r-1)
>         comb(n-1, r)
> ```
>
> <br>
>
> 라이브러리를 이용한 조합 생성방법
>
> ```python
> import itertools
> 
> a = [1,2,3]
> result = itertools.combinatoins(a, r=2) #r 생략불가
> print(list(result))
> ```
>
> ```python
> #라이브러리를 활용한 중복조합
> import itertools
> 
> a = [1,2,3]
> result = itertools.cominations_with_replacement(a, r=2)
> print(list(result))
> ```

