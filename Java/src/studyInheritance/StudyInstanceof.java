package studyInheritance;

public class StudyInstanceof {

	//Exception in thread "main"
	//static으로 스택에 method도 쌓고 시작하기에 서순을 잘 생각해야한다.
	//main이 method를 불러와서 사용하기에 method 아래에 main을 써준다.
	
	public static void method1(HighRank highRank) {
		if(highRank instanceof LowRank) {
			LowRank lowRank = (LowRank) highRank;
			System.out.println("Method1 - lowRank로 변환 Success");
		}else {
			System.out.println("Method1 - 변환 Fail");
		}
	}
	
	public static void method2(HighRank highRank) {
		LowRank lowRank = (LowRank) highRank;
		System.out.println("Method2 - lowRank로 변환 Success");
	}
	
	public static void main(String[] args) {
		HighRank highRank1 = new LowRank();
		method1(highRank1);//Method1 - lowRank로 변환 Success
		method2(highRank1);//Method2 - lowRank로 변환 Success
		
		HighRank highRank2 = new HighRank();
		method1(highRank2);//Method1 - 변환 Fail
//		method2(highRank2);//ClassCastException
	}//end of main
	
}//end of class

class HighRank {
	
}//end of HighRank class

class LowRank extends HighRank{
	
}//end of LowRank class