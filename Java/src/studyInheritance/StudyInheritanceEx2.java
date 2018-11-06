package studyInheritance;

public class StudyInheritanceEx2 {
	public static void main(String[] args) {

		Car myCar = new Car();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+1+"번 회전");
			int problemLocation = myCar.run();
		
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 ATire로 교체");
				myCar.frontLeftTire = new ATire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 BTire로 교체");
				myCar.frontRightTire = new BTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 ATire로 교체");
				myCar.backLeftTire = new ATire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 BTire로 교체");
				myCar.backRightTire = new BTire("뒤오른쪽", 17);
				break;
			default:
				break;
			}
			System.out.println("--------------------------------");//1회전시 출력되는 내용 구분
		}
		
	}//end of main
}//end of class

class Car {
	//Field
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	//Constructor
	public Car() {
	}
	
	//Method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}//end of Car class

class Tire{
	//Field
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어의 위치
	
	//Constructor
	public Tire() {
	}
	public Tire(String location, int maxRotation) {
		this.location = location;			//초기화
		this.maxRotation = maxRotation;		//초기화
	}
	
	public boolean roll() {
		++accumulatedRotation;		//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}//end of Tire class

class ATire extends Tire{
	//Constructor
	public ATire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//Method
	@Override
	public boolean roll() {
		++accumulatedRotation;		//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "ATire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " ATire 펑크 ***");
			return false;
		}
	}

}//end of ATire class

class BTire extends Tire{
	//Constructor
	public BTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//Method
	@Override
	public boolean roll() {
		++accumulatedRotation;		//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "BTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " BTire 펑크 ***");
			return false;
		}
	}

}//end of ATire class
