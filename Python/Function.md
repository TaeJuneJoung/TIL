# Function

`함수`

## Type Hinting, 타입 힌팅

> 파이썬 3.5 버전 이후 사용 가능

: 함수가 어떤 타입을 파라미터로 전달받고,

어떤 타입을 반환 값으로써 전달하는지 코드상에 작성할 수 있다.

IDLE 및 개발자가 함수를 읽을 때 의미를 파악하기 쉽다.

```python
def <함수이름>(<파라미터이름:<파라미터타입>) -> <반환타입>:
    return 
```

>ex)
>
>```python
>def typeHinting(paramInt : int, paramStr : str) -> int:
>    return paramInt
>
>print(typeHinting(28, 'Hello'))
>print(type(typeHinting(28, 'Hello')))
>```

<br>

## 함수를 변수처럼 전달

```python
def add_with_transform(left, right, transform_func):
    # transform_func(left) = add_plus(2) = 3
    # transform_func(right) = add_plus(3) = 4
    tmp_val = transform_func(left) + transform_func(right)
    # tmp_val = 7
    # transform_func(tmp_val) = add_plus(7) = 8
    return transform_func(tmp_val)

def add_plus(num):
    return num+1

# # 람다식
# add_plus = lambda x:x+1

res_value = add_with_transform(2, 3, add_plus)
print(res_value)
```

