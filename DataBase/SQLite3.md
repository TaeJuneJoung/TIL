# SQLite3

```python
#django datafield
create_at = models.DataField(auto_add)
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