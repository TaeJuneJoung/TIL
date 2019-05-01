# 컴퓨터에서의 음의 정수 표현 방법

### 1의 보수

 : 부호와 절대값으로 표현된 값을 부호 비트를 제외한 나머지 비트들을 0은 1로, 1은 0으로 변환

```python
-6
#부호와 절대값 표현
1 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0
#1의 보수 표현
1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1
```





### 2의 보수

 : 1의 보수방법으로 표현된 값의 최하위 비트에 1을 더함

```python
#2의 보수 표현
1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0
```
