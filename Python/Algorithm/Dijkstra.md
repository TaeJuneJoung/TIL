# Dijkstra

```
1
6 11
1 2 3
1 3 5
2 3 2
2 4 6
3 2 1
3 4 4
3 5 6
4 5 2
4 6 3
5 1 3
5 6 6
```

```python
def dij(s, V):
    u = set([s])

    for i in range(1, V+1):
        D[i] = adj[s][i]
    
    # cnt = 1
    # while cnt != V: len의 연산을 줄이기 위해 _ 큰 차이는 없음
    while len(u) != V:
        minV = 1000000
        w = 0
        for i in range(1, V+1):
            if i not in u:
                if D[i] < minV:
                    minV = D[i]
                    w = i
        
        u.add(w)

        for i in range(1, V+1):
            if w != i and adj[w][i] != 1000000: #인접
                D[i] = min(D[i], D[w]+adj[w][i])

        # cnt += 1

T = int(input())
for t in range(1,T+1):
    V, E = map(int, input().split())
    adj = [[1000000]*(V+1) for i in range(V+1)]
    for i in range(V+1): #출발 도착이 같으면 0
        adj[i][i] = 0
    for i in range(E): #인접 정보 추가
        n1, n2, w = map(int, input().split())
        adj[n1][n2] = w
    s = 1 #출발지는 1, a
    D = [0]*(V+1)
    dij(s,V)
    print(D[6]) #a->f까지 최소
```

