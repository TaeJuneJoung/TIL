# XHR

```javascript
//실행을 해보기 위해서는 하나씩 실행해보거나 const를 조정해줘야한다.

/* GET */
const URL = 'https://jsonplaceholder.typicode.com/posts?userId=1'
const XHR = new XMLHttpRequest()
//어떤 방식으로 보낼지, 어디로 보낼지
XHR.open('GET', URL)
//보내기
XHR.send()
XHR.addEventListener('load', e => {
    const result = e.target.response
    console.log(result)
    const parseData = JSON.parse(result)
    console.log(parseData)
})

/* POST */
const URL = 'https://jsonplaceholder.typicode.com/posts'
const XHR = new XMLHttpRequest()
//어떤 방식으로 보낼지, 어디로 보낼지
XHR.open('POST', URL)
//보내기
XHR.setRequestHeader(
    'Content-Type', 'application/json;charset=UTF-8'
)

const data = {
    userId:1,
    title:"Lunch",
    body:"오늘 점심은 무엇?",
}
const jsonData = JSON.stringify(data)

XHR.send(jsonData)

XHR.addEventListener('load', e => {
    const result = e.target.response
    const parseData = JSON.parse(result)
    console.log(parseData)
})

/* PUT */
const URL = 'https://jsonplaceholder.typicode.com/posts/1'
const XHR = new XMLHttpRequest()
//어떤 방식으로 보낼지, 어디로 보낼지
XHR.open('PUT', URL)
//보내기
XHR.setRequestHeader(
    'Content-Type', 'application/json;charset=UTF-8'
)

const data = {
    userId:1,
    title:"Lunch",
    body:"오늘 점심은 무엇?",
}
const jsonData = JSON.stringify(data)

XHR.send(jsonData)

XHR.addEventListener('load', e => {
    const result = e.target.response
    const parseData = JSON.parse(result)
    console.log(parseData)
})

/* PATCH */
const URL = 'https://jsonplaceholder.typicode.com/posts/1'
const XHR = new XMLHttpRequest()
//어떤 방식으로 보낼지, 어디로 보낼지
XHR.open('PATCH', URL)
//보내기
XHR.setRequestHeader(
    'Content-Type', 'application/json;charset=UTF-8'
)

const data = {
    userId:3,
    title:"Lunch",
    body:"오늘 점심은 무엇?",
}
const jsonData = JSON.stringify(data)

XHR.send(jsonData)

XHR.addEventListener('load', e => {
    const result = e.target.response
    const parseData = JSON.parse(result)
    console.log(parseData)
})

/* DELETE */
const URL = 'https://jsonplaceholder.typicode.com/posts/1'
const XHR = new XMLHttpRequest()
//어떤 방식으로 보낼지, 어디로 보낼지
XHR.open('DELETE', URL)
//보내기
XHR.setRequestHeader(
    'Content-Type', 'application/json;charset=UTF-8'
)

const data = {
    userId:3,
    title:"Lunch",
    body:"오늘 점심은 무엇?",
}

const jsonData = JSON.stringify(data)

XHR.send(jsonData)
console.log(XHR)
XHR.addEventListener('load', e => {
    const result = e.target.response
    const parseData = JSON.parse(result)
    console.log(parseData)
})
```

