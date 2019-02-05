### Django static image

**장고 정적 이미지**



**파일구조**

```
app Folder/
	static/
		images/
			image.png
```



**Settings.py**

```python
# 있어도 없어도 되는거 같은...?
STATIC_ROOT = os.path.join(BASE_DIR, 'static')
# 기본설정
STATIC_URL = '/static/'
```

**.html**

```html
{% load staticfiles %}
<img src="{% static 'images/image.png' %}" alt="image">
```