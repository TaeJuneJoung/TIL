# Servlet Request

## Servlet의 기본 기능

![Servlet 기본 기능](../_asset/spring/servlet_base_process.png)

1. Client로부터 요청을 얻음
2. 데이터베이스 연동과 같은 비즈니스 로직을 처리함
3. 처리된 결과를 클라이언트에 응답



### Servlet의 요청과 응답

- 요청과 관련된 API: Javax.servlet.http.HttpServletRequest 클래스
- 응답과 관련된 API: Javax.servlet.http.HttpServletResponse 클래스

:pencil2:Tomcat 10사용시 javax -> `jakarta`



#### HttpServletRequest의 Method

| 메서드 이름                                | 기능                                                         | 반환형                |
| ------------------------------------------ | ------------------------------------------------------------ | --------------------- |
| authenticate(HttpServletResponse response) | 현재 요청한 사용자가 servletContext 객체에 대한 인증을 하기 위한 컨테이너 로그인 메커니즘을 사용하는지 | boolean               |
| changeSessionId()                          | 현재 요청과 연관된 현재 세션의 id를 변경하여 새 세션 id를 반환 | String                |
| getContextPath()                           | 요청한 컨텍스트를 가리키는 URI를 반환                        | String                |
| getCookies()                               | 클라이언트가 현재의 요청과 함께 보낸 쿠키 객체들에 대한 배열을 반환 | cookie[]              |
| getHeader(String name)                     | 특정 요청에 대한 헤더 정보를 문자열로 반환                   | String                |
| getHeaderNames                             | 현재의 요청에 포함된 헤더의 name 속성을 enumeration으로 반환 | Enumeration`<String>` |
| getMethod()                                | 현재 요청이 GET, POST 또는 PUT방식 중 어떤 HTTP 요청인지를 반환 | String                |
| getRequestURI()                            | 요청한 URL컨텍스트 이름과 파일 경로까지 반환                 | String                |
| getServletPath()                           | 요청한 URL에서 Servlet이나 JSP이름을 반환                    | String                |
| getSession()                               | 현재의 요청과 연관된 세션을 반환<br />만약 세션이 없으면 새로 만들어서 반환 | HttpSession           |
| getPathInfo()                              | 클라이언트가 요청시 보낸 URL과 관련된 추가 경로 정보를 반환  | String                |



#### HttpServletResponse의 Method

| 메서드 이름                          | 기능                                                         | 반환형               |
| ------------------------------------ | ------------------------------------------------------------ | -------------------- |
| addCookie(Cookie cookie)             | 응답에 쿠키를 추가                                           | void                 |
| addHeader(String name, String value) | name과 value를 헤더에 추가                                   | void                 |
| encodeURL(String url)                | 클라이언트가 쿠키를 지원하지 않을 때 세션 id를 포함한 특정 URL을 인코딩 | String               |
| getHeaderNames()                     | 현재 응답의 헤더에 포함된 name을 가져옴                      | Collection`<String>` |
| sendRedirect(String location)        | 클라이언트에게 redirect 응답을 보낸 후 특정 URL로 다시 요청하게 함 | void                 |



### form 태그를 이용한 servlet 요청

```html
<form name="login" method="get" action="login" encType="UTF-8">
    ID: <input type="text" name="user_id"> <br/>
    PWD: <input type="password" name="user_pwd"> <br/>
    <input type="submit" value="LOGIN"> <input type="reset" value="RESET">
</form>
```

- form 태그의 action 속성에 지정한 jsp나 servlet으로 name/value 전송



#### `<form>`태그와 관련된 여러 가지 속성

| 속성    | 기능                                                         |
| ------- | ------------------------------------------------------------ |
| name    | - form 태그의 이름을 지정<br />- 여러 개의 form이 존재할 경우 구분하는 역할 |
| method  | - form 태그 안에서 데이터를 전송할 때 전송 방법을 지정(GET/POST, default=GET) |
| action  | - form 태그에서 데이터를 전송할 servlet이나 jsp를 지정<br />- servlet으로 전송할 때는 매핑 이름을 사용 |
| encType | - form 태그에서 전송할 데이터의 encoding 타입을 지정<br />- 파일을 업로드할 때는 `multipart/form-data`로 지정 |



#### form 태그로 전송된 데이터를 받아 오는 메서드

- HttpServletRequest 클래스의 메서드를 이용해서 전송된 데이터를 가져옴

| Method                                   | 기능                                                         |
| ---------------------------------------- | ------------------------------------------------------------ |
| String getParameter(String name)         | name의 값을 알고 있을 때 그리고 name에 대한 전송된 값을 받아오는데 사용 |
| String[] getParameterValues(String name) | 같은 name에 대해 여러 개의 값을 얻을 때 사용                 |
| Enumeration getParamterNames()           | name값을 모를 때 사용                                        |



## Servlet에서 Client 요청을 얻는 방법

### 여러 개의 값을 전송할 때의 요청 처리

- 한번에 여러 개의 값이 전송되는 경우 `getParamterValues()` 이용

```html
<form name="login" method="get" action="login" encType="UTF-8">
    ID: <input type="text" name="user_id"> <br/>
    PWD: <input type="password" name="user_pwd"> <br/>
    
    <input type="checkbox" name="subject" value="java" checked> JAVA
    <input type="checkbox" name="subject" value="c"> C
    <input type="checkbox" name="subject" value="jsp"> jsp
    <input type="checkbox" name="subject" value="android"> Android
    <input type="submit" value="LOGIN"> <input type="reset" value="RESET">
</form>
```



```java
// doGet 내용만 기재
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pwd = request.getParameter("user_pwd");
    System.out.println("ID:" + user_id);
    System.out.println("PWD:" + user_pwd);
    String[] subject = request.getParameterValues("subject");
    System.out.println(Arrays.toString(subject));
    System.out.println("선택완료");
}
```



#### getParameterNames() 메서드를 이용한 요청 처리

- 전송되는 데이터가 많은 경우 name의 값을 일일이 기억할 필요없이 getParameterNames() 메서드를 이용해서 name을 얻음

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    Enumeration<String> enu = request.getParameterNames();
    while (enu.hasMoreElements()) {
        String name = (String) enu.nextElement();
        String[] values = request.getParameterValues(name);

        for (String value : values) {
            System.out.println("name:" + name + "value:" + value);
        }
    }
}
```



## Servlet 응답 처리

### 응답 처리 방법

1. doGet()이나 doPost Method 안에서 처리
2. HttpServletResponse객체를 이용
3. setContentType()을 이용해 클라이언트에게 전송할 **데이터 종류(MIME-TYPE)를 지정**
4. 클라이언트(브라우저)와 servlet의 통신은 **Java I/O의 스트림 이용**



#### MIME-TYPE

- Tomcat 컨테이너에 미리 지정해 놓은 데이터 종류로 Servlet에서 브라우저로 전송시 설정해서 사용

**MIME-TYPE 지정 예**

- HTML로 전송시: `text/html`
- 일반 텍스트 전송시: `text/plain`
- XML 데이터로 전송시: `application/xml`



```xml
<mime-mapping>
    <extension>xsl</extension>
    <mime-type>application/xml</mime-type>
</mime-mapping>
<mime-mapping>
    <extension>xslt</extension>
    <mime-type>application/xslt+xml</mime-type>
</mime-mapping>
<mime-mapping>
    <extension>xsm</extension>
    <mime-type>application/vnd.syncml+xml</mime-type>
</mime-mapping>
```

위의 내용은 tomcat에 `web.xml`의 일부 내용이다.

이러한 방식으로 tomcat 컨테이너에서는 MIME-TYPE들이 정의되어 있다.



#### HttpServletResponse를 이용한 Servlet 응답 과정

![HttpServletResponse 응답과정](../_asset/spring/httpservlet_response_process.png)



```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset-utf-8");
    PrintWriter out = response.getWriter();

    String user_id = request.getParameter("user_id");
    String user_pwd = request.getParameter("user_pwd");

    String data = "<html><body>";
    data += "ID:" + user_id;
    data += "PWD:" + user_pwd;
    data += "</body></html>";
    out.println(data);
}
```



기본적인 GET방식으로 처리를 해왔는데 POST방식으로 form 태그에 method를 변경하고 doPost에 작성하면 된다.



### JavaScript로 Serlvet 요청

- 실무에서는 js에서 입력한 값을 유효성 검사 후에 servlet으로 요청함

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form name="login" method="post" action="login" encType="UTF-8">
	    ID: <input type="text" name="user_id"> <br/>
	    PWD: <input type="password" name="user_pwd"> <br/>
	    <input type="hidden" name="user_hidden" value="hidden_test" />
	    <input type="button" onClick="validate()" value="LOGIN"> <input type="reset" value="RESET">
	</form>
	
	<script type="text/javascript">
		function validate() {
			const formLogin = document.login;
			const user_id = formLogin.user_id.value;
			const user_pwd = formLogin.user_pwd.value;
			
			if ((user_id.length == 0 || user_id == "") || (user_pwd.length == 0 || user_pwd == "")) {
				alert("ID나 비밀번호가 입력이 안되었습니다.");
			} else {
				formLogin.method = "POST";
				formLogin.action = "login";
				formLogin.submit();
			}
		}
	</script>
</body>
</html>
```

