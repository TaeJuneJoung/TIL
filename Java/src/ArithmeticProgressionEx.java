
/* 등차수열
 * problem은 나타나 있는 등차수열 및 나타내야할 등차수열을 담는 배열
 * 2 5 14 29 50 77 110 .....
 * 규칙성을 찾아보면 6n-3씩 증가함을 알 수 있습니다.
 * 
 * arithmeticProgression은  증가하는 숫자를 담는 배열
 * 
 * 풀 수 있는 방법은 여러가지
 * 규칙성을 찾는 방법부터 시작할 것인지
 * 규칙성을 찾아서 해당 방법으로 나아갈 것인지...
 * */
public class ArithmeticProgressionEx {
	public static void main(String[] args) {

		int[] problem = new int[100];
		problem[0] = 2;
		
		int[] arithmeticProgression = new int [100];
		
		for (int i = 0; i < arithmeticProgression.length; i++) {
			arithmeticProgression[i] = 6*i+3;//6n-3으로 하지 않고 6n+3으로 한 이유는 시작이 0이기에
		}
		
		int count = 1;
		for (int i = 0; i < 99; i++) {
			problem[i+1] = problem[i] + arithmeticProgression[i];
			//System.out.println(count +"항 : "+problem[i]);
			if(count==20) System.out.println(count +"항 : "+problem[i]);//20번째 항의 값 구하기
			count++;
		}

//		for (int i : arithmeticProgression) {
//			System.out.println(i);
//		}
		
//		for (int n = 0; n < problem.length; n++) {
//			problem[n] = 3*n*n+6*n+5;
//		}
		
//		int count = 1;
//		for (int i : problem) {
//			System.out.println(count+"항 : "+i);
//			count++;
//		}
		
	}//end of main
}//end of class
