# ISSUE



## Eclipse IDE - JDK 권장 버전 문제

```
Version 1.8.0_333 of the JVM is not suitable for this product. version: 11 or greater is required.
```

이클립스 최신버전의 경우에는 JDK 11 이상을 권장하고 있다.

이러한 부분을 무시하고 1.8로 설치하여 진행했는데 초기에는 되다가 이후에 안되는 불상사가 발생했다.

이러한 경우에는 이클립스 경로에 가서 `eclipse.ini`파일을 수정해주면 된다.

```ini
-Dosgi.requiredJavaVersion=1.8
```

해당 부분을 1.8로 수정하였다. (총 2군데가 있어서 동일하게 다 수정함)



그리고 가장 상단에 해당 부분을 추가했다.

```ini
-vm
C:\Program Files\Java\jdk-15.0.1\bin\javaw.exe
```

`javaw.exe`파일의 경로는 따라 다를 것이다.

jdk15가 있어서 해당 경로 설정해주었다.

참고 사이트 또한 15로 한 것으로 보아 안전하게 그대로 했다.



### 참고링크

https://wooncloud.tistory.com/48

