# 2Dimensional_Array

2차열 배열

### Empty array

```python
# 5x5 빈 리스트 작성
empty_arr = [[0]*5 for i in range(5)]
```

<br>

### 2 Dimensional array

```python
# NxN 2차열 배열 생성 - 주어진 값을 받아 진행
import sys
sys.stdin = open('test.txt', 'r')

N = int(input())
arr = [list(map(int, input().split())) for n in range(N)]
```

input.txt

```
5
38 79 1 73 44
17 76 36 63 92
7 46 30 67 19
20 86 46 47 46
1 7 81 26 63
```

<br>

### Transpose matrix

전치 행렬

```python
# 전치행렬
A = [[1,2,3],[4,5,6],[7,8,9]]
N = 3 #3x3 배열인 경우

for i in range(N):
    for j in range(N):
        if i < j :
            A[i][j], A[j][i] = A[j][i], A[i][j]

print(A)
```

<br>

### 2 Dimensional array navigation

2차열 배열 탐색

```python
#방향탐색
A = [[1,2,3],[4,5,6],[7,8,9]]
N = 3 #3x3 배열인 경우

#오른쪽부터 시계방향으로
di = [0,1,0,-1]
dj = [1,0,-1,0]

# i, j = 1, 1
for i in range(N):
    for j in range(N):
        for k in range(4): #k번 방향 탐색
            ni = i + di[k]
            nj = j + dj[k]
            if ni >= 0 and ni < N and nj >=0 and nj < N:
                print(A[ni][nj], end=" ")
        print()
```

