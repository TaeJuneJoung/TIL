# Graph Search

`그래프 탐색 방법`

<br>

### DFS

`Depth First Search, 깊이 우선 탐색`

<br>

### BFS

`Breadth First Search, 너비 우선 탐색`

- <span style="color:#007bff;font-weight:bold">큐 활용</span>

- 시작점의 인접한 정점들을 모두 차례로 방문 후,

  방문했던 정점을 시작점으로 하여다시 인접한 장점들을 차례로 방문하는 방식

- 인접한 정점들을 탐색 후,

  차례로 너비 우선 탐색을 진행해야 하므로, 선입선출 형태의 자료구조인 큐 활용

```python
def BFS(G, v): #G:그래프, v:탐색 시작점
    visited = [0]*n #n:정점의 개수
    queue = [] #큐 생성
    queue.append(v) #시작점 v를 큐에 삽입
    while queue: #큐가 비어있지 않은 경우
        t = queue.pop(0) #큐의 첫번째 원소 반환
        if not visited[t]: #방문하지 않은 곳이라면
            visited[t] = True #방문한 것으로 표시
            visit(t) ####???
        for i in G[t]: #t와 연결된 모든 선에 대해
            if not visited[i]: #방문되지 않은 곳이라면
                queue.append(i) #큐에 넣기
```

