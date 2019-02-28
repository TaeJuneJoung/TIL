# Stack

후입선출(LIFO, Last-In-First-Out)

<br>

선형구조 : 자료 간의 관계가 1 대 1의 관계를 가짐

비선형구조 : 자료 간의 관계가 1 대 N의 관계를 가짐 (ex. 트리구조)

<br>

### Operatation

`연산`

**삽입**<br>

 : 저장소에 자료를 저장하고 보통 `push`라고 부름<br>

**삭제**<br>

 : 저장소에서 자료를 꺼냄<br>

꺼낸 자료는 삽입한 자료의 역순으로 꺼냄<br>

보통 `pop`이라고 부름<br>

**isEmpty**<br>

 : 스택이 공백인지 아닌지를 확인하는 연산<br>

**peek**<br>

 : 스택의 top에 있는 item(원소)을 반환하는 연산<br>

<br>

#### push

```python
stack = []
def push(item):
    stack.append(item)
```

#### pop

```python
def pop():
    if len(stack) == 0 :
        #underflow
        return
    else:
        return stack.pop(-1)
```

<br>

example

```python
def push(item):
    s.append(item)

def pop():
    if len(s) == 0:
        #underflow
        print("stack is empty")
        return
    else:
        return s.pop(-1)

s = []
push(1)
push(2)
push(3)
print("pop item ->", pop()) #3
print("pop item ->", pop()) #2
print("pop item ->", pop()) #1
```

<br>

### 고려사항

list를 사용하여 스택을 구현하는 경우<br>

장점<br>

 : 구현이 용이하다<br>

단점<br>

 : 리스트의 크기를 변경하는 작업은 내부적으로 큰 `overhead` 발생 작업으로 많은 시간이 소요<br>

<br>

list에 변경이 많이 일어난다면, 이를 해결하기 위해

- 리스트의 크기가 변동되지 않도록 배열처럼 크기를 미리 정해놓고 사용 방법
- 동적 연결리스트를 이용하여 저장소를 동적으로 할당하여 스택을 구현 방법

이 있다. 이에 대한 단점은 리스트를 구현하는 것보다 구현이 복잡하는 것이다.

<br>

<br>

### Stack_Application_Problems

#### :one:Parentheses_Check

괄호의 종류 : 대괄호`[ ]`, 중괄호`{ }`, 소괄호`( )`<br>

조건<br>

1. 왼쪽 괄호의 개수와 오른쪽 괄호의 개수가 같아야 한다.
2. 같은 괄호에서 왼쪽 괄호는 오른쪽 괄호보다 먼저 나와야 한다.
3. 괄호 사이에는 포함 관계만 존재한다.

잘못된 괄호 예시

- (a(b)
- a(b)c)
- a{b(c[d]e}f)
- {(})

<br>