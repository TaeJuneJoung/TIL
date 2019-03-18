# 2Dimensional_Array

`2차열 배열`

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

### 2 Dimensional array traversal

`2차열 배열 순회`

**행 우선 순회**

```python
arr = [[1,2,3],[4,5,6],[7,8,9]]

#행 우선 순회
for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[i][j], end=" ")
    print()
    
#1 2 3
#4 5 6
#7 8 9
```

**열 우선 순회**

```python
arr = [[1,2,3],[4,5,6],[7,8,9]]

#열 우선 순회
for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[j][i], end=" ")
    print()
    
#1 4 7
#2 5 8
#3 6 9
```

**지그재그 순회**

```python
#지그재그 순회
for i in range(len(arr)):
    if i%2 == 0:
        for j in range(len(arr[i])):
            print(arr[i][j], end=" ")
    else:
        for j in range(len(arr[i])-1,-1,-1):
            print(arr[i][j], end=" ")
    print()

#1 2 3
#6 5 4
#7 8 9
```

<br>

### 2 Dimensional array navigation

`2차열 배열 탐색`

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

<br>

### Transpose matrix

`전치 행렬`

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

zip함수

 : 동일한 개수로 이루어진 자료형들을 묶어 주는 역할을 하는 함수

`zip(iterable*)`

```python
alpha = ['a', 'b', 'c']
index = [1, 2, 3]
print(list(zip(alpha, index))) #[('a', 1), ('b', 2), ('c', 3)]

# zip(*matrix) : 전치 행렬
arr = [[1,2,3],[4,5,6],[7,8,9]]
print(list(zip(*arr))) #[(1, 4, 7), (2, 5, 8), (3, 6, 9)]

# 람다식을 이용한 방법
arr = [[1,2,3],[4,5,6],[7,8,9]]
for k in range(3):
    print(list(map(lambda i: i[k] , arr)))
```

