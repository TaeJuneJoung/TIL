# OSI 참조 모델

| OSI       | 참조 모델        | 대표 프로토콜        | 대표 통신 기기     |
| --------- | ---------------- | -------------------- | ------------------ |
| 7계층(L7) | 응용 계층        | HTTP, DNS, SMTP, SSH | 방화벽, 로드밸런서 |
| 6계층(L6) | 표현 계층        |                      |                    |
| 5계층(L5) | 세션 계층        |                      |                    |
| 4계층(L4) | 전송 계층        | TCP, UDP             |                    |
| 3계층(L3) | 네트워크 계층    | IP, ICMP             | 라우터, L3 스위치  |
| 2계층(L2) | 데이터 링크 계층 | Ethernet             | L2 스위치, 브리지  |
| 1계층(L1) | 물리 계층        |                      | 리피터 허브        |





## 응용 계층(레이어 7)

> 응용 계층은 웹의 HTTP나 메일 전송을 하는 SMTP 등과 같은 애플리케이션에 특화된 프로토콜을 규정





## 표현 계층(레이어 6)

> 표현 계층은 데이터의 저장 형식이나 압축, 문자 인코딩과 같은 데이터의 표현 형식을 규정





## 세션 계층(레이어 5)

> 세션 계층은 커넥션 확립 타이밍이나 데이터 전송 타이밍을 규정
>
> 세션은 애플리케이션간에 일어나는 요청(request)과 응답(response)으로 구성





## 전송 계층(레이어 4)

>  전송 계층은 데이터 전송을 제어하는 계층
>
> 전송 오류의 검출이나 재전송을 규정
>
> 대표적인 프로토콜로는 TCP와 UDP가 있다.
>
> 데이터를 통신 상대의 노드로 확실히 보내는 역할





## 네트워크 계층(레이어 3)

> 네트워크 계층은 서로 다른 네트워크 간에 통신을 하기 위한 규정
>
> `라우팅`: 서로 다른 네트워크에 데이터 패킷을 전송하는 것
>
> IP주소를 바탕으로 네트워크 계층에서 작동하는 대표적인 통신 장비로는 라우터나 레이어 3 스위치가 있다.





## 데이터 링크 계층(레이어 2)

> 데이터 링크 계층은 동일한 네트워크 안(동일 세그먼트)에 있는 노드 간의 통신을 규정
>
> 데이터 링크 계층에서는 MAC 주소로 데이터를 전송한다.





## 물리 계층(레이어 1)

> 물리 계층은 통신 장비의 물리적 및 전기적 특성을 규정







### 느낀점

: 뭔 소리인지 모르겠다.