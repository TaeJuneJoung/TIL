### DB

`데이터베이스`

 : 체계화된 데이터의 모임

| Input  | Output |
| :----: | :----: |
| Create |        |
| Update |  Read  |
| Delete |        |

<br>

### RDBMS

`관계형 데이터베이스 관리 시스템`

ex)

- MySQL

- SQLite

  : 서버가 아닌 응용 프로그램에 넣어 사용하는 비교적 가벼운 데이터베이스

  구글 안드로이드 운영체제에 기본적으로 탑재된 데이터베이스이며, 임베디드 소프트웨어에도 많이 활용이 됨.

  로컬에서 간단한 DB 구성을 할 수 있으며, 오픈소스 프로젝트이기에 자유롭게 사용할 수 있다.

- PostgreSQL

- ORACLE

- SQL Server

<br>

<br>

### Scheme

> `스키마`
>
> 데이터 베이스에서 자료의 구조, 표현방법, 관계 등을 정의한 구조
>
> 행( Record (=row)) || 열(Column)
>
> <span style="color:#dc3545;font-weight:bold">PK(Primary Key, 기본키)</span>
>
>  : 각 행(레코드)의 고유값.
>
> 반드시 설정해야하며, 데이터베이스 관리 및 관계 설정시 주요하게 활용됨.

<br>

SQL

`Structured Query Language`

 : 관계형 데이터베이스 관리시스템(RDBMS)의 데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어.

|                                                              | 개념                                                         |                    예시                     |
| :----------------------------------------------------------: | ------------------------------------------------------------ | :-----------------------------------------: |
| **DDL**<br />데이터 정의 언어<br />(Data Definition Language) | 데이터를 정의하기 위한 언어<br />관계형 데이터베이스 구조(테이블, 스키마)를 정의하기 위한 명령어 |         CREATE<br />DROP<br />ALTER         |
| **DML**<br />데이터 조작 언어<br />(Data Manipulation Language) | 데이터를 저장, 수정, 삭제, 조회 등을 하기 위한 언어          | INSERT<br />UPDATE<br />DELETE<br />SELECT  |
|  **DCL**<br />데이터 제어 언어<br />(Data Control Language)  | 데이터베이스 사용자의 권한 제어를 위해 사용되는 언어         | GRANT<br />REVOKE<br />COMMIT<br />ROLLBACK |

<br>

```sqlite
.headers on
.mode column

--테이블 목록 조회
.tables
--특정 테이블 스키마 조회
.schema table명

--csv파일 가지고 와 DB만들기
.mode csv
.import 파일.csv model클래스이름
```

<br>

```sql
--추가[DML]
INSERT INTO table명 (column1, column2, ...)
VALUES (value1, value2, ...);

--모든 컬럼명을 다 추가할경우에는 이렇게 해도 됨
INSERT INTO table명 VALUES (value1, value2, ...);


--SELECT문 몇 개만 가져오기[DML]
SELECT * FROM 테이블명 LIMIT num(갯수);

--SELECT문 위에서부터 몇번째 위치의 몇개만 가져오기[DML]
SELECT * FROM 테이블명 LIMIT num(갯수) OFFSET num(몇개 SKIP할것인지);
--ex) classmates 테이블에서 3번째 있는 값 하나만 가져오기
SELECT * FROM classmates LIMIT 1 OFFSET 2;


--수정[DML]
UPDATE table명
SET column1 = value1, column2 = value2, ...
WHERE condition;
--ex) classmates 테이블에서 id가 3인 레코드를 수정
--	이름을 홍길동으로, 주소를 제주도로 변경
UPDATE classmates
SET name="홍길동", address="제주도"
WHERE id=3;
```

<br>

`WHERE column LIKE " "`

```sql
--%
--"e%" : e로 시작하는 값
--"%e" : e로 끝나는 값
--"%e%" : e가 들어가는 값
--"_e%" : 첫번째 아무값이나 들어가고 두번째가 e로 시작하는 값
--"e___" : e로 시작하고 4자리의 값
--"e_%_%" : e로 시작하고 적어도 3자리인 값
```

<br>`ORDER BY column1, column2 ... [ASC|DESC]`

```sql
--ASC : 오름차순
--DESC : 내림차순
```

