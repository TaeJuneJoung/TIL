# SQLite3

```python
#django datafield
create_at = models.DataField(auto_now)

#auto_now와 auto_now_add가 있다.
#다른 정리내용에서 정리할 것
```

<br>

```python
#M2M관계
class Doctor(models.Model):
    name = models.CharField(max_length=100)
    
class Patient(models.Model):
    name = models.CharField(max_length=100)
    #through을 통해서 새로 만든 class를 이용할 수 있으며, 새로운 class에서 다른 필드를 만들어 사용할 수도 있다.
    # doctors = models.ManyToManyField(Doctor, through='Reservation', related_name="patients")
    doctors = models.ManyToManyField(Doctor, related_name="patients")
```

```sqlite
d1 = Doctor.objects.get(pk=1)
--related_name이 있는 모습 그대로
--Doctor의 레코드 d1에서 Patient연결된 부분을 불러오는 방법
d1.patients.all()

--related_name이 없을 때,
--Doctor의 레코드 d1에서 Patient연결된 부분을 불러오는 방법
d1.patient_set.all()

--related_name이 있을 때는 아래와 같은 방도로 접근할 수 없다.
```

<br>

## 제약조건

```python
from django.db import models
from pygments.lexers import get_all_lexers
from pygments.styles import get_all_styles

LEXERS = [item for item in get_all_lexers() if item[1]]
LANGUAGE_CHOICES = sorted([(item[1][0], item[0]) for item in LEXERS])
STYLE_CHOICES = sorted((item, item) for item in get_all_styles())


class Snippet(models.Model):
    created = models.DateTimeField(auto_now_add=True)
    title = models.CharField(max_length=100, blank=True, default='')
    code = models.TextField()
    linenos = models.BooleanField(default=False)
    language = models.CharField(choices=LANGUAGE_CHOICES, default='python', max_length=100)
    style = models.CharField(choices=STYLE_CHOICES, default='friendly', max_length=100)

    class Meta:
        ordering = ('created',)
```

>`null`
>
>: True이면 컬럼 값에 NULL 값을 할당할 수 있다.
>
><br>
>
>`blank`
>
>: True / False
>
>빈칸을 허용할지 안할지에 대해서 설정
>
>```sqlite
>--null과 blank의 차이
>null은 DB상의 제약이지만,
>blank는 DB상의 제약이 걸리지는 않는다.
>다만, 유효성 검증(validation)과 연관이 있다.
>```
>
><br>
>
>`auto_now`
>
>Date관련 Field 설정
>
>: True / False
>
>데이터를 생성한 시간을 넣기 위한 설정
>
>ex) create_at
>
>`auto_now_add`
>
>Date관련 Field 설정
>
>: True / False
>
>데이터를 변경된 시간을 넣기 위한 설정
>
>ex) update_at
>
><br>
>
>`default`
>
>: default="값" 아무것도 선택하지 않았을 때 넣을 값을 설정
>
><br>
>
>`choices`
>
>: enum과 같이 필드에 저장할 수 있는 값이 제한적인 경우에 사용.
>
>옵션값은 아래와 같이 선언
>
>```python
>GENDER_CHOICES = (
>	('M', 'Male'),
>('F', 'Female'),
>)
>```
>
>필드으 값은 튜플의 첫번째 요소이며, 모델 객체에 대해 get_필드명_display() 메서드를 호출하면 튜플의 두번째 요소 값을 얻을 수 있다. 참고, get_필드명_display() 메서드는 Django에 의해 자동으로 생성된다.
>
>```python
>from django.db import models
>
>class Person(models.Model):
>GENDER_CHOICES = (
>		('M', 'Male'),
>	('F', 'Female'),
>	)
>name = models.CharField(max_length=100),
>gender = models.CharField(max_length=1, choices=GENDER_CHOICES)
>```
>
>```python
>p = Person(name="June", gender="M")
>p.save()
>p.gender
>>> 'M'
>p.get_gender_display()
>>> 'Male'
>```
>
><br>
>
>`help_text`
>
>: 해당 필드가 폼 위젯으로 표시될 때 함께 표시될 도움말.
>
>해당 모델을 폼에서 쓰지 않더라도 모델을 문서화하는데 도움이 됨.
>
><br>
>
>`primary_key`
>
>: PK값 (primary_key=True)
>
><br>
>
>`unique`
>
>: Ture인 경우 해당 필드값은 해당 테이블에서 유일한 값을 가져야 한다.