# pygeoip

접속 IP를 통해 현재 위치를 알아보기

### IP

- Public IP
- Private IP

<br>

### pygeoip

:[참고 사이트](https://pygeoip.readthedocs.io/en/v0.3.2/)

<br>

```python
from urllib import request
import socket
import pygeoip

#PUBLIC IP
IP = request.urlopen('https://api.ipify.org/').read().decode()
print("PUB :", IP)
#PRIVATE IP
conn = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
conn.connect(('8.8.8.8', 0))
IP = conn.getsockname()[0]
print("PRI :", IP)
geo = pygeoip.GeoIP('Geo/GeoLite2-City_20190507/GeoLite2-City.mmdb')
print(geo)
```

