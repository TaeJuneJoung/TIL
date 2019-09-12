# Java Install & Path Settings

---



## Install

https://www.oracle.com/technetwork/java/javase/downloads/index.html 에서

사용할 Java버전에 맞춰서 JDK다운로드를 진행하면 된다.



![JAVA8](../_asset/Java/java_download_01.png)

![JAVA8](../_asset/Java/java_download_02.png)

우리나라에서 많이 사용하는 Java8을 다운받아 학습을 하려고 한다.

이전에 다운받을 때는 쿠키 설정만 진행하면 되었는데, 이제는 로그인을 하라고 한다. 그래서 회원가입을 하여 다운로드를 진행하였다.



설치가 다 되었다면 Java가 잘 작동 되는지 확인해보기 위해 `cmd`명령창에

```bash
java

#java를 치면 나오는 내용들 일부
사용법: java [-options] class [args...]
           (클래스 실행)
   또는  java [-options] -jar jarfile [args...]
           (jar 파일 실행)
           
javac

#javac를 치면
'javac'은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는
배치 파일이 아닙니다.
```

위와 같은 결과를 볼 수 있다.

**javac**는 `java compiler`을 의미한다.







## Path설정

Java를 어디서든 실행하기 위해 환경변수를 설정해 놓는다.

### Path 설정 이유

JDK를 설치하면 JDK와 JRE가 설치된다.

JDK에는 javac와 api,  JRE에는 JVM(Java Virtual Machine)과 java.exe가 설치된다.

JRE는 자동으로 환경변수 설정이 되지만, JDK는 설정해주어야 하므로 javac와 api 등을 사용하기 위해서는 Path설정을 해주어야 한다.



### 환경 변수 설정

윈도우의 경우. 환경 변수 ->

| 변수 이름 | 변수 값                            | 비고                      |
| --------- | ---------------------------------- | ------------------------- |
| JAVA_HOME | C:\Program Files\Java\jdk1.8.0_221 | JDK가 설치되어 있는 경로  |
| Path      | %JAVA_HOME%\bin                    | 기존에 있는 Path에 추가함 |
| CLASSPATH | %JAVA_HOME%\lib                    |                           |



### CLASSPATH 설정 이유

'**CLASSPATH**를 설정하는 이유가 따로 있을까?'하여 없이 'Hello Word' 출력을 진행해 보았더니 아래와 같은 Error를 맞이 하였다.

```bash
ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840]
```

**JVM이 시작될 때, JVM의 클래스 로더가 CLASSPATH 환경변수를 호출하고 디렉토리에 있는 java library Class들을 JVM이 로드하기 위해 사용**된다.





## Hello Word

Java를 편리하게 쓰기 위해 툴을 설치

**Eclipse**를 다운 받아 진행하였으며, Web으로도 사용할 것이기에 두번째 `Enterprise`를 설치하였다.

설치 후, Java Project를 만들고 Class 생성 후, 실행하면 `Hello Java`를 만날 수 있다.

```java
public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
	}//end of main

}//end of class
```

