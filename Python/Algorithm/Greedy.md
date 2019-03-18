# Greedy

`탐욕 알고리즘`<br>

 : 최적해를 구하는 데 사용되는 근시안적 방법<br>

여러 경우 중 하나를 결정해야 할 때마다 그 순간에 최적이라고 생각되는 것을 선택해 나가는 방식으로 진행하여 최종적인 해답에 도달<br>

단, 각 선택의 시점에서 이루어지는 결정은 지역적으로는 최적이지만, 그 선택들을 계속 수집하여 최종적인 해답을 만들었다고 하여, 그것이 최적이라는 보장은 없다.<br>

일반적으로, 머릿속에 떠오르는 생각을 검증 없이 바로 구현하면 Greedy 접근이 된다.<br>

<br>

1. 해 선택

   : 현재 상태에서 부분 문제의 최적 해를 구한 뒤, 이를 부분해 집합(Solution Set)에 추가

2. 실행 가능성 검사

   : 새로운 부분해 집합이 실행 가능한지를 확인

   곧, 문제의 제약 조건을 위반하지 않는지를 검사

3. 해 검사

   : 새로운 부분해 집합이 문제의 해가 되는지를 확인

   아직 전체 문제의 해가 완성되지 않았다면 1번의 해 선택부터 다시 시작한다.

<br>

>   **example. Baby-gin**
>
>   0 ~ 9 사이의 숫자 카드에서 임의의 카드 6장을 뽑았을 때, 3장의 카드가 연속적인 번호를 갖는 경우를 run이라 하고, 3장의 카드가 동일한 번호를 갖는 경우를 triplet이라고 한다. 6자리의 숫자를 입력받아 baby-gin 여부를 판단하는 프로그램을 작성하라.
>
>   ```python
>   """
>   입력 및 출력 예)
>   	667767 / triplet
>   	054060 / baby-gin
>   	101123 / triplet	#triplet을 run보다 우선시함
>   	112233 / Not baby-gin
>   """
>   
>   numbers = list(range(10))
>   count_list = [0 for i in range(10)]
>   arr = list(map(int, input().split()))
>   for i in range(6):
>       count_list[arr[i]] += 1
>   
>   cnt = 0
>   isTriplet = False
>   isRun = False
>   
>   for i in range(10):
>       if count_list[i] >= 3:
>           isTriplet = True
>           count_list[i] -= 3
>       if i >= 2:
>           if count_list[i] and count_list[i+1] and count_list[i+2]:
>               isRun = True
>               count_list[i] -= 1
>               count_list[i+1] -= 1
>               count_list[i+2] -= 1
>   
>   res = ""
>   if isTriplet and isRun:
>       res = "baby-gin"
>   elif isTriplet:
>       res = "triplte"
>   elif isRun:
>       res = "run"
>   else:
>       res = "Not baby-gin"
>   
>   print(res)
>   ```

<br>

> **example. 거스름돈 줄이기**
>
> 지폐와 동전의 개수를 최소한으로 거스름돈을 주는 방법
>
> ```python
> """
> 지폐의 종류는
> 5만원, 1만원, 5천원, 1천원
> 동전의 종류는
> 5백원, 1백원, 50원, 10원, 1원
> """
> 
> change_money = 76692
> # 5만원 1, 1만원 2, 오천원 1, 천원 1,
> # 오백원 1, 백원 1, 오십원 1, 십원 4, 일원 2
> 
> money = 50000
> change = [0 for i in  range(9)]
> 
> for i in range(len(change)):
>     change[i] = change_money//money
>     change_money -= money * change[i]
>     if i%2 == 0:
>         money //= 5
>     else:
>         money //= 2
> change[-1] = change_money # change[-1] == change[len(change)-1]
> print(change)
> ```