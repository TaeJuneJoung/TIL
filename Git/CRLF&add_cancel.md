### LF_CRLF

Windows에서 `git add`를 하였을 때 아래와 같이 뜨는 문구를 제거하고 싶을 때,<br>

`warning: LF will be replaced by CRLF in ...`

```bash
$ git config --global core.autocrlf false
```

문구가 뜨지 않게만 하는 것이지 해결한 것은 아니다.<br>

<br>

윈도우 체제에서 리눅스를 사용하면서 Whitespace에러가 발생하는 것이다. <br>

Unix 시스템에서는 한 줄의 끝이 **LF(Line Feed)**로 이루어지는데,<br>

윈도우는 CR(Carriage Return)와 LF로 **CRLF**로 한 줄이 이루어지기 때문이다.<br>

팀에서 OS가 다르게 협업을 하면 쉽게 볼 수 있는 에러 메시지이다. Git이 스마트하게 변환하며 `core.autocrlf`라는 처리해준다.<br>

에러 메시지가 보기 싫어서 끈다기보단 켜고 문제없이 사용하길 권장.

키는 메시지는 반대로 `$ git config --global core.autocrlf true`

<br>

<br>

### git_add_cancel

git add를 취소하는 방법

```bash
$ git reset HEAD 파일명
```

`$ git reset HEAD`만 작성시에는 모든 파일 add 취소된다.