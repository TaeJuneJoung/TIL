# JavaScript

`[소년코딩`분이 정리한 것을 보고 학습을 위해 작성하였습니다. 문제가 될시 삭제하겠습니다.](https://boycoding.tistory.com)

자바스크립트 구현은 3가지고 나뉜다.

1.  코어(ECMAScript)
2.  문서 객체 모델(DOM)
3.  브라우저 객체 모델(BOM)

<br>

### ECMAScript

>   **<span style="color:#007bff;font-weight:bold;">ECMAScript</span>**
>
>   **자바스크립의 핵심 기능**
>
>   문법, 타입, 선언문, 키워드, 예약어, 연산자, 객체 등 언어의 저수준에 해당하는 부분
>
>   'ECMAScript'언어는 웹 브라우저에 종속되지 않으며, 브라우저는 ECMAScript를 구현하는 호스팅환경일 뿐
>
>   호스트환경은 ECMAScript를 기본적으로 구현하고 DOM, BOM 등과 같은 확장을 제공

<br>

### DOM

>   **<span style="color:#007bff;font-weight:bold;">Document Object Model (문서 객체 모델)</span>**
>
>   **웹 페이지 콘텐츠를 조작하는 메서드와 인터페이스**
>
>   XML을 HTML에서 사용할 수 있도록 확장된 애플리케이션 프로그래밍 인터페이스
>
>   DOM은 전체페이지를 노드 계층 구조로 변환하며, HTML페이지의 각 부분은 각기 다른 데이터를 포함하는 다양한 타입의 노드로 표현된다.

<br>

### BOM

>   **<span style="color:#007bff;font-weight:bold;">Browser Object Model (브라우저 객체 모델)</span>**
>
>   **브라우저와 상호작용하는 메서드와 인터페이스**
>
>   BOM을 이용하면 브라우저 창에 접근하고 조작할 수 있다.
>
>   <br>
>
>   ```
>   ex)
>   - 브라우저 창을 새로 띄움
>   - 브라우저 창을 움직이거나 크기를 조절
>   - 브라우저의 실제 정보를 반환하는 navigator 객체
>   - 사용자의 화면 해사동에 대한 정보를 반환하는 location 객체
>   - 쿠키 지원
>   - XMLHttpRequest와 같은 커스텀 객체
>   ```

<br><br><br>

기본사용

```javascript
document.getElementById("demo").innerHTML = "확인"
```

```html
<p id="demo">
    Test
</p>
```