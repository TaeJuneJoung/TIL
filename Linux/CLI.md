# CLI(Command Line Interface)

- CLI - 커맨드 라인 인터페이스, 키보드만으로 컴퓨터를 조작
- GUI - 그래픽 유저 인터페이스, 키보드와 마우스로 조작

<br>

### which OS?

- Unix based OS (Linux, MacOS  등)
- Unix -> 서버 관리 시점에서 무조건 사용

<br>

### prompt

- 컴퓨터가 명령을 받을 준비가 됨 -> `$`

- 막혔을 때 -> `ctrl+c`

<br>

|  명령어  | 설명                         | 사용법       |
| :------: | ---------------------------- | ------------ |
|  `echo`  | 다음에 들어오는 내용을 리턴  | echo 'hello' |
| `ctrl+c` | 작업중지                     | ctrl+c       |
|   `↑`    | 이전 명령어                  | ↑            |
|   `↓`    | 다음 명령어                  | ↓            |
| `ctrl+l` | 마지막 라인을 가장 위로 정리 | ctrl+l       |
| `clear`  | 터미널 깔끔하게 정리         | clear        |

<br><br><br>



### :file_folder:파일 명령어

|      명령어      | 설명                                                    | 사용법                               |
| :--------------: | ------------------------------------------------------- | ------------------------------------ |
|       `>`        | 왼쪽의 출력물을 오른쪽 파일로 전송하기                  | `$ echo "hello" > hello.txt`         |
|       `>>`       | 왼쪽의 출력물을 오른쪽 파일로 붙이기                    | `$ echo "Hello, Linux" >> hello.txt` |
|   `cat <file>`   | - `<file>`의 내용을 화면에 출력<br>- 붙이기용도         | `$ cat hello.txt`                    |
|       `ls`       | 파일/디렉토리 목록을 보여줌                             | `ls`                                 |
|     `ls -a`      | 숨김파일을 포함해서 모곡을 보여줌                       | `ls -a`                              |
|     `ls -l`      | 파일/디렉토리 권한을 보여줌                             | `ls -l`                              |
| `mv <old> <new>` | `<old>`의 이름을 `<new>`로 변경<br>(나중에 이동도 시킴) | `mv hello.txt hello`                 |
| `cp <old> <new>` | `<old>`를 `<new>`로 복사                                | `cp hello.txt copty_hello.txt`       |
|   `rm <file>`    | `<file>`을 지우기                                       | `rm copy_hello.txt`                  |
|  `rm -r <dir>`   | `<dir>`과 그 하위 폴더와 파일까지 전부 지우기           | `rm -r temp`                         |
|     `rm -rf`     |                                                         |                                      |
|      `Tab`       | 자동완성                                                |                                      |
|    `Tab Tab`     | 목록을 출력                                             |                                      |

<br>

<br><br>

### 파일검사

|    명령어     | 설명                      | 사용법                      |
| :-----------: | ------------------------- | --------------------------- |
|    `curl`     | url과 상호작용            | `curl -O https://github.io` |
| `head <file>` | 파일의 앞부분 출력        | `head bohemian.txt`         |
| `tail <file>` | 파일의 뒷부분 출력        | `tail bohemian.txt`         |
|  `wc <file>`  | 줄, 단어, 바이트를 카운트 | `wc bohemian.txt`           |

<br><br><br>

### 디렉토리

|    명령어     | 설명                            | 사용법        |
| :-----------: | ------------------------------- | ------------- |
|     `ls`      | 파일/폴더 목록 출력             |               |
|    `ls ~`     | root 위치의 파일/폴더 목록 출력 |               |
|     `pwd`     | 현재 경로를 출력                |               |
| `mkdir <dir>` | `<dir>`폴더를 생성              | `mkdir queen` |
|  `cd <dir>`   | `<dir>`위치로 이동              |               |
|    `cd ..`    | 상위                            |               |
|    `cd -`     | 이전 경로 이동                  |               |

- `/` : 최상위 루트
- `~` : 홈 디렉토리

