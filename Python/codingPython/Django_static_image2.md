Django_static_image

장고 정적이미지 & 파일 리사이즈

models.ImageField`를 사용하기 위해서

```bash
$ pip install Pillow
```



<br>

**image**

`enctype="multipart/form-data"` 파일을 올리기 위해 필요한 소스

```html
<form method="POST" enctype="multipart/form-data">
    {% csrf_token %}
    <input type="text" name="title"/>
    <input type="text" name="content"/>
    <input type="file" name="image" accept="image/*"/>
    <input type="submit" value="Submit"/>
</form>
```

file관리법으로는 사용자/그룹/날짜에 따라 폴더를 따로 하여 관리하여야한다.

<br>

**사진 리사이징**

```bash
$ pip install pilkit
$ pip install django-imagekit
```

pilkit은 django-imagekit을 사용하기 위해서 설치

```python
#models.py
from django.db import models
from imagekit.models import ProcessedImageField
from imagekit.processors import ResizeToFill,ResizeToFit

# Create your models here.
class Photo(models.Model):
    title = models.CharField(max_length=100)
    content = models.TextField()
    create_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    #이미지설정
    image = ProcessedImageField(
        upload_to = "photo/image",
        processors = [ResizeToFill(150,150)],#크기에 맞게 짤라서 표현
        #processors = [ResizeToFit(300,300)],#크기에 맞춰서 표현
        format = "JPEG",
        options = {"quality":90}
        )
    
    def __str__(self):
        return self.title
```

DB를 건드리지 않는다면 `migration`작업을 다시 할 필요는 없음

```python
#ex)
class Photo(models.Model):
    title = models.CharField(max_length=100)
    content = models.TextField()
    create_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    image = ProcessedImageField(
        upload_to = "photo/image",
        processors = [ResizeToFill(150,150)],#크기에 맞게 짤라서 표현
        #processors = [ResizeToFit(300,300)],#크기에 맞춰서 표현
        format = "JPEG",
        options = {"quality":90}
        )
#내용을 건드리면 migration을 해줘야함

#image내부에 있는
        upload_to = "photo/image",
        processors = [ResizeToFill(150,150)],#크기에 맞게 짤라서 표현
        #processors = [ResizeToFit(300,300)],#크기에 맞춰서 표현
        format = "JPEG",
        options = {"quality":90}
        #를 변경해주는 것은 migration을 다시 해줄 필요는 없음
```

