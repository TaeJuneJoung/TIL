# CORS

**Cross-Origin Resource Sharing**

## 의미

: 다른 도메인에서의 자원을 호출하는 행위에 제한이 없을 경우 안전하지 않다.

CORS는 이렇게 시스템 수준에서 타 도메인 간 자원 호출을 승인하거나 차단하는 것을 결정하는 것이다. 웹 서버에서 보안 cross-domain 데이터 전송을 활성화하는 cross-domain 접근 제어권을 부여한다.



## 사례

​	Back 서버에서 REST API를 만들어서 Front에서 해당 내용을 받아 작업을 하는 프로젝트를 진행 중에 있었다. Front에서 Back 서버에 웹 요청을 통해 `Get`하여 내용을 가져와야하는데 접근 제어권이 허가되지 않아 가져오지 못했다. 이를 해결하기 위해서 Back 서버에서 CORS를 적용하여 제어권을 주었다.

> **살펴보아야할 점.**
>
> CORS권한을 모두에게 열어둔다면 막아둔 본래의 의미가 없다.
>
> 그러면 해당 URL에 대해서만 CORS 제어권을 부여할 수 있는가?
>
> - Flask CORS 제어권 부여:
>
> https://flask-cors.readthedocs.io/en/latest/#resource-specific-cors
>
> - Django CORS제어권 부여:
>
> https://pypi.org/project/django-cors-headers/