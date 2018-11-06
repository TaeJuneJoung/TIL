package studyInheritance;

/* Tire부분을 배열로 바꿔서 진행
 * 
 * 바뀐 부분 -> Tire 배열화
 * 그에 맞게 run Method 변경
 * */

public class StudyInheritanceEx3 {
	public static void main(String[] args) {

		CarEx2 myCar = new CarEx2();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+1+"번 회전");
			int problemLocation = myCar.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 ATire로 교체");
				myCar.tires[0] = new ATireEx2("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 BTire로 교체");
				myCar.tires[1] = new BTireEx2("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 ATire로 교체");
				myCar.tires[2] = new ATireEx2("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 BTire로 교체");
				myCar.tires[3] = new BTireEx2("뒤오른쪽", 17);
				break;
			default:
				break;
			}
			System.out.println("--------------------------------");//1회전시 출력되는 내용 구분
		}
		
	}//end of main
}//end of class

class CarEx2 {
	//Field
	TireEx2[] tires = {
			new TireEx2("앞왼쪽",6),
			new TireEx2("앞오른쪽",2),
			new TireEx2("뒤왼쪽",3),
			new TireEx2("뒤오른쪽",4)
	};
	
	//Constructor
	public CarEx2() {
	}
	
	//Method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop(); return i+1;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}//end of Car class

class TireEx2{
	//Field
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어의 위치
	
	//Constructor
	public TireEx2() {
	}
	public TireEx2(String location, int maxRotation) {
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

class ATireEx2 extends TireEx2{
	//Constructor
	public ATireEx2(String location, int maxRotation) {
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

class BTireEx2 extends TireEx2{
	//Constructor
	public BTireEx2(String location, int maxRotation) {
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
