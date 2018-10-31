
public class StudyArduino {
	public static void main(String[] args) {
		
		//int ledPin -> ledPin이 꽂혀있는 pinNumber 기재
//		pinMode(ledPin,OUTPUT); //LED pin as output?
		
		//digitalWrite(ledPin, )
//		digitalWrite(ledPin, HIGH); //LED on
//		digitalWrite(ledPin, LOW); //LED off
		
//		init(); //마이크로 컨트롤러 초기화
		
//		#if defined(USBCON)
//			USBDevice.attach(); //USB장치 연결 설정
//		#endif
//			setup(); //사용자 초기화 함수

//		loop(); //사용자 무한 반복 함수
//		if(serialEventRun) serialEventRun(); //시리얼 데이터 처리
		
		//5V(Vcc)는 1로, 0V*Ground, GND)는 0으로 간주
		
		//int buttonIn -> 버튼 입력 핀
//		pinMode(button,INPUT); //버튼 입력 핀
		
//		int buttonState = digitalRead(buttonIn); //버튼 상태 읽기
//		digitalWrite(ledOut, buttonState); //버튼 상태에 따라 Led on/off
		
		/* 아두이노 우노에는 14개의 디지털 입출력 핀이 제공되며,
		 * 이 중 '3,5,6,9,10,11' 6개는 PWM(Pulse Width Modulation) 신호 출력을 위해 사용 할 수 있다. 
		 * */
		
//		analogWrite(LED_pin,밝기 정도); //밝기 정도는 0~255 0은 꺼진 것
		/* 디지털은 digitalRead(pinNo);
		 * 아날로그는 analogRead(pinNo);
		 * */
		
		//Serial.begin(9600); //시리얼 포트 초기화 -> setup() 안에 사용됨
		/* 시리얼 모니터 -> console과 비슷하다고 보면 됨
		 * Serial.print()와 Serial.println()
		 * */
		
		/* 데이터형		크기(Atmega기반)		크기(ARM기반)		설명		비고		
		 * boolean		1byte
		 * char			1byte										[java는 2byte]
		 * byte			1byte								부호없는 정수형
		 * int			2byte				4byte					[java는 4byte]
		 * word			2byte				4byte			부호없는 정수형
		 * long			4byte										[java는 8byte]
		 * short		2byte
		 * float		4byte								단정도 실수형
		 * double		4byte				8byte			배정도 실수형 [java는 8byte]
		 * */
		//Atmega -> 아두이노 우노 8bit 마이크로 컨트롤러 
		//ARM -> 아두이노 두에 32bit 마이크로컨트롤러


		//volatile : 컴파일러가 스케치를 컴파일할 때 최적화에서 제외하도록 하는 역할
		//const : 상수(constant)를 나타내며, 선언에서 값이 할당된 이후에는 그 값을 바꿀 수 없는 변수
		
		//포인터 변수는 메모리 번지를 저장하기 ㅜ이해 사용되며, 아두이노 우노의 경우 2바이트 크기를 가진다.
		//ex) ch *pch;
		//String(sizeof(pch)); -> 2
		
/*
		//Stream 클래스를 부모 클래스로 지정하여 Stream 클래스의 속성을 물려받는다.[상속]
		class SoftwareSerial : public Stream
		{
			//감춰진 사적인 정보 부분으로 멤버 변수들이 주로 정의된다.
			private :
				uint8_t _receivePin;
				uint8_t _receiveBitMask;
			//공개된 공적인 부분으로 멤버 함수들이 주로 선언된다.
			public :
				void begin(long speed);
				bool listen();
				void end();
		}
		
		//SoftwareSerial의 멤버 함수 정의
		void SoftwareSerial::end()
		{
		 	if(digitalPinToPCMSK(_receivePin))
		 	 *digitalPinToPCMSK(_receivePin) &= ~_VB(digitalPinToPCMSKbit(_receivePin));
		}
*/
		
		//함수부분부터 재학습 필요
		//이뤄지는 언어가 C/C++이라 다소 다른 점들이 있음.
	}//end of main
}//end of class