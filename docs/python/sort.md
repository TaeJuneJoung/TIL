## 정렬

​	숫자의 정렬은 크기순으로 가능하지만, 문자열의 경우는 크기와 길이로 고려해야하는 점들이 있다.

아래의 소스를 보자.

```python
value = ['ab', 'cdef', 'gijklm', 'nop']

print(sorted(value)) #['ab', 'cdef', 'gijklm', 'nop']

print(sorted(value, key=len)) #['ab', 'nop', 'cdef', 'gijklm']
```



**sort**는 변수의 순서가 변경되어 적용되고, **sorted**는 변수의 순서가 적용된 것을 리턴한다는 것이다.

공통적으로 **iterable한 값과 key, reverse 파라미터를 요구**한다.

`key`는 lambda를 이용할 수도 있다. 

```python
sorted(value, key=lambda i: len(i)) #['ab', 'nop', 'cdef', 'gijklm']
```



## 1. Selection Sort

**선택 정렬**

```python
nums = [4,3,6,7,9,8,2,1,5]

for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if nums[i] > nums[j]:
            nums[i], nums[j] = nums[j], nums[i]

print(nums)
```

### 장점

1. 구현이 쉽다.

2. 정렬을 위한 비교 횟수는 많지만 실제 교환 횟수는 적기 때문에 **많은 교환이 일어나야 하는 자료상태에서 효율적**
3. 실제로 시간을 측정해보면 버블정렬에 비해 조금 더 빠른 정렬

### 단점

1. 항상 O(N^2^)의 시간복잡도를 갖기 때문에 **시간이 오래 걸리는 정렬 방식**





## 2. Insertion Sort

**삽입 정렬**

```python
nums = [4,3,6,7,9,8,2,1,5]

for i in range(1, len(nums)):
    key = nums[i]
    idx = i-1
    while idx >= 0 and key < nums[idx]:
        nums[idx], nums[idx+1] = nums[idx+1], nums[idx]
        idx -= 1
    nums[idx+1] = key

print(nums)
```

### 장점

1. **최선의 경우, 시간복잡도 O(N)**
2. 성능이 좋아 다른 정렬 알고리즘의 일부로 사용될 만큼 좋은 정렬법

### 단점

1. **최악의 경우, 시간복잡도 O(N^2^)**

   데이터의 상태 및 크기에 따라 성능의 편차가 굉장히 심한 정렬



## 3. Bubble Sort

**버블 정렬**

```python
nums = [4,3,6,7,9,8,2,1,5]

for i in range(len(nums)-1):
    for j in range(1, len(nums)-i):
        if nums[j-1] > nums[j]:
            nums[j-1], nums[j] = nums[j], nums[j-1]

print(nums)
```

### 장점

1. 구현이 쉽다.
2. 코드 자체가 직관적이다.

### 단점

1. 항상 **O(N^2^)의 시간복잡도**를 갖기 때문에 **시간이 오래 걸리는 정렬 방식**





## 4. Merge Sort

**합병 정렬**

```python
def merge(nums, s, e, m):
    ret = []
    i = s
    j = m+1
    copy = 0

    while i <= m and j <= e:
        if nums[i] < nums[j]:
            ret.append(nums[i])
            i += 1
        elif nums[i] > nums[j]:
            ret.append(nums[j])
            j += 1
    
    while i <= m:
        ret.append(nums[i])
        i += 1
    while j <= e:
        ret.append(nums[j])
        j += 1
    
    for k in range(s, e+1):
        nums[k] = ret[copy]
        copy += 1

def merge_sort(nums, s, e): #s: start, e: end
    if s < e:
        m = (s+e) // 2
        merge_sort(nums, s, m)
        merge_sort(nums, m+1, e)

        merge(nums, s, e, m)

        
nums = [4,3,6,7,9,8,2,1,5]
merge_sort(nums, 0, len(nums)-1)
print(nums)
```

### 장점

1. Quick Sort와 비슷하게 원본 배열을 반씩 분할해가면서 정렬하는 정렬법으로 **분할 하는 과정에서 O(logN) 시간 복잡도가 발생** 

   **O(NlogN) 시간 복잡도**를 갖는다.

2. 퀵소팅과 달리, **Pivot을 설정하거나 그런 과정 없이** 무조건 절반으로 분할하기 때문에 Pivot에 따라서 성능이 안좋아지거나 하는 경우가 없다. 따라서 **항상 O(NolgN)이라는 시간 복잡도**를 갖게 된다.

### 단점

1. **추가적인 메모리 필요**. 퀵보다 무조건 병렬정렬이 좋다고 할 수 없다.

   **추가적인 메모리를 할당할 수 없는 경우에는 퀵 정렬을 사용하는 것이 좋다.**



## 5. Quick Sort

**퀵 정렬**

```python
def qsort(nums, s, e):
    pivot = nums[s]
    bs = s
    be = e
    while s < e:
        while pivot <= nums[e] and s < e:
            e -= 1
        if s > e:
            break
        while pivot >= nums[s] and s < e:
            s += 1
        if s > e:
            break
        nums[s], nums[e] = nums[e], nums[s]
    
    nums[bs], nums[s] = nums[s], nums[bs]
    if bs < s:
        qsort(nums, bs, s-1)
    if be > e:
        qsort(nums, s+1, be)

nums = [4,3,6,7,9,8,2,1,5]
qsort(nums, 0, len(nums)-1)
print(nums)
```

### 장점

1. 기준값(Pivot)에 의한 분할을 통해서 구현하는 정렬법, 분할 과정에서 O(logN)이라는 시간이 걸리게 되고, **전체적으로 O(NlogN)의 시간**이 걸린다.

### 단점

1. 기준값에 따라서 시간복잡도가 크게 달라진다. **최악의 경우 시간 복잡도는 O(N^2^)**이다.





### 참고자료

기본 정렬 알고리즘:

https://hsp1116.tistory.com/33

정렬별 장단점 및 시간복잡도:

https://yabmoons.tistory.com/250

