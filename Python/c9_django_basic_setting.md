### c9

**[python basic setting_django]**

```bash
# pyenv install
git clone https://github.com/pyenv/pyenv.git ~/.pyenv

echo 'export PYENV_ROOT="$HOME/.pyenv"' >> ~/.bashrc
echo 'export PATH="$PYENV_ROOT/bin:$PATH"' >> ~/.bashrc

echo -e 'if command -v pyenv 1>/dev/null 2>&1; then\n  eval "$(pyenv init -)"\nfi' >> ~/.bashrc

exec "$SHELL"

# python version upgrade
pyenv install 3.6.7
pyenv global 3.6.7
pyenv rehash

# pip upgrade
pip install --upgrade pip

# install django
pip install django==2.1.8

# virtualenv intall
$ git clone https://github.com/pyenv/pyenv-virtualenv.git $(pyenv root)/plugins/pyenv-virtualenv

$ echo 'eval "$(pyenv virtualenv-init -)"' >> ~/.bashrc

$ exec "$SHELL"

```

<br>**django**를 사용하기 위한 기본 설정이며, `$ pyenv install`의 버전은 사용하고자 하는 목적에 맞게 진행하면 된다.<br>

모듈 설치가 필요하다면 `$ pip install 모듈이름`으로 진행하면 된다.

