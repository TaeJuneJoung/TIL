# Speech_to_Text

**Google:Speech to Text API Basic**<br>

기본적으로 API_KEY값을 환경변수에 넣고 진행

```bash
$ echo 'export API_KEY="서비스키"' >> ~/.bashrc
```

임시적 사용은 <br>

`$ export API_KEY="서비스키"`로 사용할 수 있다.

<br>

### 동기방식[syncrecognize]

`touch request.json`파일을 만들고 아래와 같이 적어준다.

```json
{
  "config": {
      "encoding":"FLAC",
      "sample_rate": 16000,
      "language_code": "en-US"
  },
  "audio": {
      "uri":"gs://cloud-samples-tests/speech/brooklyn.flac"
  }
}
```

그리고 Terminal에서 아래와 같이 적어주면 값이 Return 된다.

```bash
curl -s -X POST -H "Content-Type: application/json" --data-binary @request.json \
"https://speech.googleapis.com/v1beta1/speech:syncrecognize?key=${API_KEY}"
```

<br>

### 비동기방식[asyncrecognize]

```bash
gcloud ml speech recognize-long-running \
    'gs://cloud-samples-tests/speech/brooklyn.flac' \
     --language-code='en-US' --async
```

명령어를 실행하면 아래와 같이 json형태가 반환된다.

```json
{
  "name": OPERATION_ID
}
```

명령어를 실행하여 작업에 대한정보를 얻을 수도 있고, 폴링할 수도 있다.

```bash
gcloud ml speech operations describe OPERATION_ID
```

```bash
gcloud ml speech operations wait OPERATION_ID
```

작업이 완료되면 아래와 같은 결과를 얻을 수 있다.

```json
{
  "@type": "type.googleapis.com/google.cloud.speech.v1.LongRunningRecognizeResponse",
  "results": [
    {
      "alternatives": [
        {
          "confidence": 0.9840146,
          "transcript": "how old is the Brooklyn Bridge"
        }
      ]
    }
  ]
}
```



<br>

**참고링크**

<hr>

https://cloud.google.com/speech-to-text/docs/async-recognize#speech-async-recognize-gcs-gcloud

