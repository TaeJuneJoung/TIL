# list(리스트)

##### 리스트를 만들 때는 대괄호 [] 로 감싸 주고 각 요소값들은 쉼표 , 로 구분해 준다

```python
리스트명 = [요소1, 요소2, 요소3, ...]

#list 예시
list1 = []
list1 = list()
list2 = [1,2,3]
list3 = ['Hello', 1,'My', ['python','java'], 2]
```

<br>

```python
# 리스트의 인덱싱
list3[0]
print(list3[0],list3[2],list3[-1][0]) #Hello My python

# 리스트의 슬라이싱
list3[0::2]

# 리스트 더하기
list1 = [1, 2, 3]
list2 = [4, 5, 6]
list1 + list2

# 리스트 반복하기
list1*3

# 리스트 길이구하기
len(list3)
```

<br><br>

##### 리스트 요소 수정하기

```python
beforeId = id(list1)
list1[2] = 5
afterId = id(list1)
if(beforeId==afterId):
    print("동일함")
else:
    print("다름")
```

리스트에서 값을 수정해도 동일한 객체로 인식됨을 알 수 있다

<br>

<br>

##### del을 이용해 리스트 요소 삭제하기

```python
result = list1 + list2 #[1, 2, 5, 4, 5, 6]

del list1[2]

del result[2:]
```

리스트에서 요소 값을 삭제할 수 있는 방법은

- del
- remove
- pop

<br>

remove와 pop은 아래에서 다루도록 한다

<br><br><br>

### 리스트 관련 함수들

##### :one:append(x)

  : Add an item to the end of the list. Equivalent to `list1[len(list1):] = [x]`.

<br>

##### :two:extend(iterable)

 : Extend the list by appending all the items from the iterable. Equivalent to `list1[len(list1):] = iterable`.

```python
#extend(x)의 x는 iterable 해야한다.
x = [4,5]
list1 = [1,2,3]

list1.extend(x)
```

<br>

##### :three:insert(i, x)

 : Insert an item at a given position. The first argument is the index of the element before which to insert, so `list1.insert(0,x)` inserts at the front of the list, and `list1.insert(len(list1),x)` is equivalent to list1.append(x).

```python
list1 = [1,2,4]
list1.insert(2,3)
```

<br>

##### :four:remove(x)

 : Remove the first item from the list whose value is equal to x. It raises a ValueError if there is no such item.

```python
#list1.remove(5) #ValueError: list.remove(x): x not in list
list1.remove(4)
```

<br>

##### :five:pop([i])

 : Remove the item at the given position in the list, and return it. If no index is specified, `list1.pop()` removes and returns the last item in the list. (The square brackets around the i in the method signature denote that the parameter is optional, not that you should type square brackets at that position. You will see this notation frequently in the Python Library Reference.)

```python
#list1 = []
for i in range(0,len(list1)):
   print(list1.pop()) #3 2 1

print(list1) #[]
```

<br>

##### :six:clear()

 : Remove all items from the list. Equivalent to `del a[:]`.

<br>

##### :seven:index(x[, start[, end]])

 : Return zero-based index in the list of the first item whose value is equal to x. Raises a ValueError if there is no such item.

<br>

##### :eight:count(x)

 : Return the number of times x appears in the list.

<br>

##### :nine:sort(key=None, reverse=False)

 : Sort the items of the list in place (the arguments can be used for sort customization, see sorted() for their explanation).

<br>

##### :keycap_ten:reverse()

 : Reverse the elements of the list in place.

<br>

##### copy()

 : Return a shallow copy of the list. Equivalent to `a[:]`.