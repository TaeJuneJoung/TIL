# Linux Command

---

## 사용자 구분

`#` : root사용자

> `su`명령어를 통해 super user 로그인

`$` : 일반 사용자



## 터미널/콘솔에서 시스템 종료 명령

### 1.시스템 종료 명령

- poweroff
- shutdown -P now
- halt -p
- init 0

> `-P`와 `-p` 옵션은 시스템 종료를 의미

```bash
#shutdown
shutdown -P +10 #10분 후에 종료
shutdown -r 22:00 #오후 10시에 재부팅(r: reboot)
shutdown -c #예약된 shutdown을 취소(c: cancle)

etc...
```



### 2.시스템 재부팅

- shutdown -r now
- reboot
- init 6



### 3. 런레벨

| 런레벨 | 영문 모드  | 설명                           | 비고             |
| ------ | ---------- | ------------------------------ | ---------------- |
| 0      | Power Off  | 종료 모드                      |                  |
| 1      | Rescue     | 시스템 복구 모드               | 단일 사용자 모드 |
| 2      | Multi-User |                                | 사용하지 않음    |
| 3      | Multi-User | 텍스트 모드의 다중 사용자 모드 |                  |
| 4      | Multi-User |                                | 사용하지 않음    |
| 5      | Graphical  | 그래픽 모드의 다중 사용자 모드 |                  |
| 6      | Reboot     |                                |                  |

> :warning:일반적으로 런레벨 3번을 Multi-User 모드로 사용
>
> ​	2번과 4번은 CentOS 7에서는 사용하지 않지만, 호환성을 위해 런레벨 3번과 동일 취급



## 기본 명령어

1. **ls**

   > `List`의 약자로 Windows의 `dir` 같은 역할
   >
   > 해당 폴더(directory)에 있는 파일의 목록 나열
   >
   > 
   >
   > **example)**
   >
   > | 명령어                   | 설명                                                         |
   > | ------------------------ | ------------------------------------------------------------ |
   > | ls                       | 현재 디렉토리의 파일 목록                                    |
   > | ls -a                    | 현재 디렉토리의 파일 목록(숨김 파일 포함)                    |
   > | ls -l                    | 현재 디렉토리의 자세한 목록(권한, 유저 등)                   |
   > | ls *.py                  | 현재 디렉토리의 확장자가 py인 목록                           |
   > | ls -l -a /etc/example/a* | /etc/example 디렉토리에 있는 목록(숨김 파일 포함) 중 앞 글자가 a인 것의 목록 |

   

2. **cd**

   > `Change Directory`의 약자
   >
   > 디렉토리 이동 명령
   >
   > 
   >
   > **example)**
   >
   > | 명령어                     | 설명                                                  |
   > | -------------------------- | ----------------------------------------------------- |
   > | cd ..                      | 한 단계 상위 디렉토리 이동                            |
   > | cd -                       | 이전 경로 이동                                        |
   > | cd<br />cd ~<br />cd $HOME | 사용자 홈 디렉토리 이동                               |
   > | cd /                       | 최상위 디렉토리 이동                                  |
   > | cd $변수명                 | 변수에 저장된 경로 이동                               |
   > | cd ~계정명                 | 입력한 사용자의 홈 디렉토리 이동                      |
   > | cd ../etc/example          | 한 단계 상위 디렉토리에서 etc/example 디렉토리로 이동 |
   >
   > :warning:`.` : 현재 디렉토리, `..` : 현재 디렉토리의 상위 디렉토리

   

3. **pwd**

   > Pring Working Directory의 약자
   >
   > 현재 디렉토리의 전체 경로
   >
   > ```bash
   > $ pwd #명령어
   > /c/WINDOWS/system32 #응답메시지
   > ```

   

4. **touch**

   > 크기가 0인 새 파일 생성
   >
   > 이미 파일이 존재한다면, 파일의 최종 수정 시간 변경
   >
   > ```bash
   > $ touch test.txt #test라는 이름의 txt확장자 파일을 생성
   > ```

   

5. **rm**

   > Remove의 약자
   >
   > 파일이나 디렉토리를 삭제**(단, 삭제할 권한 필요)**
   >
   > 
   >
   > **example)**
   >
   > | 명령어         | 설명                         |
   > | -------------- | ---------------------------- |
   > | rm test.txt    | test.txt 삭제                |
   > | rm -i test.txt | test.txt 삭제 확인           |
   > | rm -r test     | 디렉토리 삭제 (r: Recursive) |
   > | rm -rf test    | 디렉토리 이하 전부 강제 삭제 |
   >
   > :warning:rm -rf 명령어는 주의하며 사용
   >
   > ​	리눅스는 휴지통의 개념도 없다고 보면 되고(있긴 하는걸로 알고 있음...)
   >
   > ​	**`rm -rf`명령어만 작성시에는 OS전체를 다 삭제하기에 다 날라감. 복구가 심히 어려움.**
   >
   > ![리눅스 rm rf의 위험성 짤](../_asset/linux/linux_rm_rf.jpg)
   >
   > :rotating_light:**​(유명한 rm -rf의 짤... 사용시 위험함)**

   

6. **cp**

   > Copy의 약자
   >
   > 
   >
   > **example)**
   >
   > | 명령어                | 설명                            |
   > | --------------------- | ------------------------------- |
   > | cp test.txt test2.txt | test.txt를 text2.txt파일로 복사 |
   > | cp -r test test2      | test 디렉토리를 test2로 복사    |

   

7. **mv**

   > Move의 약자
   >
   > 
   >
   > **example)**
   >
   > | 명령어                          | 설명                                     |
   > | ------------------------------- | ---------------------------------------- |
   > | mv aaa .txt bbb.txt ccc.txt ddd | aaa, bbb, ccc 파일을 ddd 디렉토리로 이동 |
   > | mv aaa.txt abc.txt              | aaa.txt 이름을 abc.txt로 변경            |

   

8. **mkdir**

   > Make directory의 약자
   >
   > 
   >
   > **[option]**
   >
   > | 옵션 | Long 옵션   | 설명                                                   |
   > | ---- | ----------- | ------------------------------------------------------ |
   > | -m   | --mode=MODE | 디렉토리 생성할 때 권한 설정, Default=755              |
   > | -p   | --parents   | 상위 경로도 함께 생성                                  |
   > | -v   | --verbose   | 디렉토리를 생성 후, 생성된 디렉토리에 대해 메시지 출력 |
   > |      | --help      | mkdir의 사용법을 출력                                  |
   > |      | --version   | mkdir의 버전 정보를 출력                               |
   >

   

9. **cat**

   > conCATenate의 약자
   >
   > 파일의 내용을 화면에 보여줌
   >
   > 여러 개 파일을 나열하면 파일을 연결해서 보여줌
   >
   > 
   >
   > **example)**
   >
   > | 명령어          | 설명                                                 |
   > | --------------- | ---------------------------------------------------- |
   > | cat a.txt b.txt | a.txt와 b.txt를 연결해서 파일의 내용을 화면을 보여줌 |

   

10. **clear**

    > 현재 사용 중인 터미널 화면을 깨끗하게 지워줌

    

11. **history**

    > 작성 내역을 나타냄







:page_facing_up:**실습 문제.**

```python
#초기 폴더 구조
"""
test/
	test/
		123.txt
		321.txt
		987.txt
		abc.txt
		test.txt
		test2.txt
		test3.txt
"""

#결과 폴더 구조
"""
test/
	test/
		abc.txt
		test.txt
		test2.txt
		test3.txt
	en/
		abc.txt
		test.txt
	num/
		123.txt
		321.txt
		987.txt
"""


#Q1. 최상단 test폴더 안에 `en`폴더와 `num`폴더를 만들어 보세요.
#Q2. en폴더에 영어로만 이뤄진 txt파일들을 복사해주세요.
#Q3. num폴더에 숫자로만 이뤄진 txt파일들을 이동 시켜주세요.
```



<div class="problem_answer" style="display: none">
    <small><b>경로가 상단 test라고 할 때,</b></small>
    <br/>
    A1. <br/>
    &emsp;<u>mkdir en</u><br/>
    &emsp;<u>mkdir num</u><br/>
    <br/>
    A2. <br/>
    &emsp;<u>cp ./test/*[a-Za-z].txt ./en</u><br/>
    <br/>
    A3. <br/>
    &emsp;<u>mv ./test/[0-9]*.txt ./num</u><br/>
</div>



<button style="background-color: #42b983; color: white; border: none;"  onClick="document.querySelector('.problem_answer').style.display = 'block'">답보기</button>

