# Sort

`정렬`<br>

ascending - 오름차순<br>

descending - 내림차순<br>

<br>

**대표적인 정렬 방식의 종류**

- :heavy_check_mark:Bubble Sort
- :heavy_check_mark:Counting Sort
- Selection Sort
- Quick Sort
- Insertion Sort
- Merge Sort

<br>

<img src="../../img/sort_time_complexity_1.png" alt="sort_time_complexity_1">

<br>

<br>

### Bubble Sort

`버블 정렬`

 : 인접한 두 개의 원소를 비교하며 자리를 계속 교환하는 방식

**정렬 과정**

- 첫 번째 원소부터 인접한 원소끼리 계속 자리를 교환하면서 맨 마지막 자리까지 이동
- <span style="color:#007bff;font-weight:bold">한 단계가 끝나면 가장 큰 원소가 마지막 자리로 정렬됨</span>
- 교환하며 자리를 이동하는 모습이 물 위에 올라오는 거품 모양과 같다고 하여 버블 정렬이라고 함

<span style="color:#007bff;font-weight:bold">시간 복잡도 : O(n^2^)</span>

```python
def bubble_sort(arr):
    for i in range(len(arr)-1, 0, -1):
        for j in range(i):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

print(bubble_sort([4,3,6,8,2])) #[2, 3, 4, 6, 8]
```

<br><br>

### Counting Sort

`카운팅 정렬`

 : 항목들의 순서를 결정하기 위해 집합에 각 항목이 몇 개씩 있는지 세는 작업을 하여, 선형 시간에 정렬하는 효율적인 알고리즘

- 정수나 정수로 표현할 수 있는 자료에 대해서만 적용 가능

  각 항목의 발생 회수를 기록하기 위해, 정수 항목으로 인덱스 되는 카운트들의 배열을 사용하기 때문

- 카운트들을 위한 충분한 공간을 할당하려면 집합 내의 가장 큰 정수를 알아야 한다.

<span style="color:#007bff;font-weight:bold">시간 복잡도 : O(n+k)</span> - n은 리스트 길이, k는 정수의 최대값

```python
def max_num(arr):
    num = 0
    for i in range(len(arr)):
        num = num if num > arr[i] else arr[i]
    return num

def counting_sort(arr):
    count_list = [0 for i in range(max_num(arr)+1)]
    res_list = []
    for i in range(len(arr)):
        count_list[arr[i]] += 1
    for i in range(len(count_list)):
        while count_list[i] > 0:
            res_list.append(i)
            count_list[i] -= 1
    return res_list

print(counting_sort([4,3,3,6,8,2,3,8])) #[2, 3, 3, 3, 4, 6, 8, 8]
```

<br><br>



