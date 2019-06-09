# Django_DEBUG=False

django project를 `deploy`하면서 문제 발생

>**favicon**
>
>debug를 false로 하면 favicon이 적용이 안되게 된다.
>
>`"GET /static/favicon.ico HTTP/1.1" 404`
>
>
>
>어떻게 해야 적용이 될까?
>
>1. 서버를 실행하면서 설정을 해준다.
>
>   ```bash
>   python manage.py runserver --insecure
>   ```
>
>   배포를 한 서버에는 '어떻게 적용할 것인가?'라는 의문을 제기하게 된다.
>
>2. 해결방법
>
>   다른 방도가 있는지 모르겠지만, 이번 배포에서는 이 방법을 통해 해결
>
>   ```python
>   #settings.py 일부
>   """
>   templates의 경로는 앱들과 같은 위치상인 project 바로 안
>   static폴더는 위의 templates 내부
>   
>   project
>   	ㄴapps
>   	ㄴproject
>   	ㄴtemplates
>   		ㄴstatic
>   			ㄴfavicon.ico
>   		ㄴstaticfiles
>   			ㄴfavicon.ico
>   """
>   TEMPLATES_DIR = os.path.join(BASE_DIR, "templates")
>   
>   DEBUG = False
>   
>   STATIC_URL = '/static/'
>   STATIC_ROOT = os.path.join(TEMPLATES_DIR, 'staticfiles')
>   STATICFILES_DIRS = [
>       os.path.join(TEMPLATES_DIR, "static"),
>   ]
>   
>   """
>   [참고사항]
>   STATIC_ROOT와 STATICFILES_DIRS의 static경로는 달라야 합니다.
>   ex) 위는 staticfiles이면 아래는 static으로 다릅니다.
>   """
>   ```
>
>   ```python
>   #urls.py _ project
>   from django.contrib import admin
>   from django.urls import path, include
>   
>   """
>   static 파일들을 사용하기 위해 필요한 import
>   """
>   from django.conf.urls import url
>   from django.conf import settings
>   from django.views.static import serve
>   
>   urlpatterns = [
>   	#...기본적인 path들
>   ]
>   
>   urlpatterns += [
>       url(r'^static/(?P<path>.*)$', serve,{'document_root': settings.STATIC_ROOT}),
>   ]
>   ```
>
>   위와 같이 한다면 성공적인 favicon을 볼 수 있다.



### 느낀점

> django를 쓰는 이유가 빠른 개발을 위해서인데 이러한 부분들에서 막힌다면 빠른 개발을 하기가 너무 힘들다... debug가 True일 때는 허용하고 False일 때는 안되게 한 이유가 무엇일까?



### 추후 알아볼 내용들

> 사용자들이 image를 upload한 부분에 대해서는 어떻게 처리해야할 것인가
>
> 위와 같은 방도로 하면 되는 것인가?
>
> `media`는 어떻게 하면 될 것인지



### 추후 내용을 위해 참고해볼 참고사이트

<https://nachwon.github.io/django-deploy-4-static/>