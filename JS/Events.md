# Events

```html
<!--
getElementById("").innerHTML
버튼 클릭시, 오늘의 시간을 나타냄
-->
<button onclick="document.getElementById('test').innerHTML=Date()">Now</button>

<p id="test"></p>

<!-- 
this
p태그 클릭시, 오늘의 시간을 나타냄
-->
<p onclick="this.innerHTML=Date()">Now</p>
```

<br>

| Event       | Description                                        |
| :---------- | -------------------------------------------------- |
| onchange    | An HTML element has been changed                   |
| onclick     | The user clicks an HTML element                    |
| onmouseover | The user moves the mouse over an HTML element      |
| onmouseout  | The user moves the mouse away from an HTML element |
| onkeydown   | The user pushes a keyboard key                     |
| onload      | The browser has finished loading the page          |

[HTML DOM Events](https://www.w3schools.com/jsref/dom_obj_event.asp)

