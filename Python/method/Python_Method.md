# Python Method

### replace

>   example. 빠른 타이핑
>
>   긴 문장 A가 주어졌을 때 B키에 저장되어 있는 문장이 나온다면 B를 눌러 횟수를 하나로 취급한다. A문장을 작성하는데 걸리는 횟수는?
>
>   입력1)
>
>   aaaa aa
>
>   출력1)
>
>   2
>
>   입력2)
>
>   asddfssdfsdf dfs
>
>   출력2)
>
>   8
>
>   ```python
>   #replace사용
>   A, B = map(str, input().split()) #혹여나 숫자에 대비
>   res = A.replace(B, "_")
>   print(len(res))
>   
>   #replace사용X
>   A, B = map(str,input().split())
>   res = 0
>   idx = 0
>   while idx < len(A):
>       cnt = 0
>       for j in range(len(B)):
>           if idx+j < len(A):
>               if A[idx+j] == B[j]:
>                   cnt += 1
>               else:
>                   break
>               if cnt == len(B):
>                   res += 1
>                   idx += len(B)-1
>       idx += 1
>   res += len(A) - len(B)*res
>   print(res)
>   ```

<br>