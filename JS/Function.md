# function

```js
var x = test();

function test(){
    return "test";
}

> x
test
```

Python과 Browser Console에서는 함수를 먼저 선언한 후 함수를 써야한다. 그렇지만 JavaScript에 전체적으로 볼 때는 위와 같이 사용할 수 있다.

<br>

## function*

 : generator function을 정의. 이 함수는 `Generator` 객체를 반환한다.

<br>

#### yield

```js
[rv] = yield [expression];
```

`expression`

 : Generator 함수에서 Generator 프로토콜을 통해 반환할 값을 정의한다. 값이 생략되면 undefined를 반환한다.

`rv`

 : Generator 실행을 재개 하기 위해서, optional value을 Generator의 `next()` 메서드로 전달하여 반환한다.

<br>

```js
/* yield를 사용한 예제 */
function* test(){
    var index = 0;
    while(index < 3){
        yield index++;
    }
}

var x = test();

/* done속성은 Generator 함수가 완전히 종료되었는지 여부를 Boolean 형태로 보여줌 */
> x.next()
{value: 0, done: false}
> x.next()
{value: 1, done: false}
> x.next()
{value: 2, done: false}
> x.next()
{value: undefined, done: true}
```

```js
/* Generator에 인자값을 넘기는 예제 */
function* test(){
    alert(yield);
}

var x = test();

x.next();
x.next("Test"); //alert message "Test"
//현 예제는 yield를 사용한 수만큼 작동할 수 있다.
```

