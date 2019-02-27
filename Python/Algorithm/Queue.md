# Queue

FIFO(First-In-First-Out)

<br>

### Operation

삽입 : `enQueue(item)`<br>

​	Queue의 뒤쪽(rear 다음)에 원소를 삽입하는 연산<br>

삭제 : `deQueue()`<br>

​	Queue의 앞쪽(front)에서 원소를 삭제하고 반환하는 연산<br>

`createQueue()`<br>

​	: 공백 상태의 큐를 생성하는 연산<br>

`isEmpty()`<br>

​	: 큐가 공백상태인지를 확인하는 연산<br>

`isFull()`<br>

​	: 큐가 포화상태인지를 확인하는 연산<br>

`Qpeek()`<br>

​	: 큐의 앞쪽(front)에서 원소를 삭제 없이 반환하는 연산<br>

<br>

### Linear Queue

`선형큐`

<br>

#### enQueue(item)

```python
def enQueue(item):
    global rear
    if isFull():
        print("Queue_Full")
    else:
        rear += 1
        Q[rear] = item
```

<br>

#### deQueue()

```python
def deQueue():
    if isEmpty():
        Queue_Empty()
    else:
        front += 1
        return Q[front]
```

<br>

#### isEmpty()

```python
def isEmpty():
    return front == rear
```

<br>

#### isFull()

```python
def isFull():
    return rear == len(Q) -1
```

<br>

<br>

example

```python
def enq(n):
    global rear
    rear += 1
    q[rear] = n

q = [0]*10
front = -1
rear = -1

rear +=1
q[rear] = 1

enq(2)
enq(3)
enq(1)
enq(5)

while front != rear : #큐가 비어있지 않으면
    front += 1
    print(q[front])


### 파이썬으로 Queue 쉽게 구현하기
#createQueue()
queue = []

#enQueue(item)
queue.append(1)
queue.append(2)
queue.append(3)

#deQueue()
print(queue.pop(0))
print(queue.pop(0))
print(queue.pop(0))
```

<br>

<br>

**Circular Queue:vs:Linear Queue**

|        | 삽입 위치 | 삭제 위치                 |
| :----: | ----------------------- | ------------------------- |
| 선형큐 | rear = rear + 1         | front = front + 1         |
| 원형큐 | rear = (rear + 1) mod n | front = (front + 1) mod n |

<br>

### Circular Queue

`원형큐`

<br>

#### enQueue(item)

```python
def enQueue(item):
    global rear
    if isFull():
        print("Queue_Full")
    else:
        rear = (rear + 1) % len(cQ)
        cQ[rear] = item
```

<br>

#### deQueue()

```python
def deQueue():
    global front
    if isEmpty():
        print("Queue_Empty")
    else:
        front = (front + 1) % len(cQ)
        return cQ[front]
```

<br>

#### isEmpty()

```python
def isEmpty():
    return front == rear
```

<br>

#### isFull()

```python
def isFull():
    return (rear+1) % len(cQ) == front
```

<br>

<br>

### Linked Queue

`연결큐`

<br>

#### enQueue(item)

```python
class Node:
    def __init__(self, item, n=None):
        self.item = item
        self.next = n

def enQueue(item): #연결 큐의 삽입 연산
    global front, rear
    newNode = Node(item) #새로운 노드 생성
    if front == None: #큐가 비어있다면
        front = newNode
    else:
        rear.next = newNode
    rear = newNode
```

<br>

#### deQueue()

```python
def deQueue():
    global front, rear
    if isEmpty():
        print("Queue_Empty")
        return None
    item = front.item
    front = front.next
    if isEmpty(): #if front == None:
        rear = None
    return item
```

<br>

#### createLinkedQueue()

```python
front = None
rear = None
```

<br>

#### isEmpty()

```python
def isEmpty():
    return front == None
```

<br>

```python
def Qpeek():
    return front.item
```

```python
def printQ():
    f = front
    s = ""
    while f :
        s += f.item + " "
        f = f.next
    return s
```

<br>

<br>

### Priority Queue

`우선순위 큐`

<br>

