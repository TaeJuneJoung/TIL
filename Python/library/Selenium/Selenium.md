# Selenium

## Install

### - install library

```bash
$ pip install selenium
$ pip install bs4
```

<br>

### - install chromedriver

<https://sites.google.com/a/chromium.org/chromedriver/downloads>

>   **이외의 driver**
>
>   Firefox : <https://github.com/mozilla/geckodriver/releases>
>
>   Edge : <https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/>

<br>

```python
from selenium import webdriver

#webdriver설치 경로
driver = webdriver.Chrome('/Users/사용자명/Downloads/chromedriver/chromedriver.exe')
#웹 자원 로드를 위해 3초 기다려줌 - 필요가 없다면 기다려줄 필요 없음
driver.implicitly_wait(3)

"""
테스트를 위해 네이버를 로그인 하는 소스를 구성
네이버는 자동로그인을 막아놨기에 이미지 문자인식방법까지 넣어주지 않으면 로그인이 어려운 점이 있다. 
"""
driver.get('https://www.naver.com/')
driver.find_element_by_xpath('//*[@id="account"]/div/a').click()
driver.find_element_by_name('id').send_keys("아이디")
driver.find_element_by_name('pw').send_keys("비밀번호")
driver.find_element_by_xpath('//*[@id="frmNIDLogin"]/fieldset/input').click()

#이미지 스크린샷 찍어서 저장하는 소스 일부 - res[i]는 반복문의 숫자값이었음.
driver.find_element_by_tag_name('img').screenshot(str(res[i])+'.png')

#마우스 오른쪽 클릭하는 소스
webdriver.ActionChains(driver).context_click().perform()
```

<br>

### 더 알아볼 점

1.  마우스 이동