package studyArray;

/* 문제 이미지는 Array.img에 있습니다.*/
public class ArrayEx1 {
	public static void main(String[] args) {
		
		/* p1. */
		int nums[][] = new int[5][5];
		
		int number = 1;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = number;
				number++;
			}
		}
				
		System.out.println("A1)");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("[System]1번 문제 해결\n");
		
		
		/* p2. 달팽이 만들기
		 * int array[][] : 배열을 담을 변수
		 * int num : 증가시킬 숫자/1~25
		 * int c : 양수/음수 조절
		 * int i, j : 배열의 행, 열
		 * int write : 쓰여지는 숫자/5,4,4,3,3,2,2,1
		 * */
		int array[][] = new int[5][5];
		int num = 1;
		int c = 1;
		int i = 0, j = -1;
		int write = 5;
		
		while(true) {
			for (int n = 0; n < write; n++) {
				j += c;
				array[i][j] = num;
				num++;
			}
			
			write--;
			
			if(write <=0) break;//write가 0이 되면 while문을 빠져나옵니다.
			
			for (int n = 0; n < write; n++) {
				i += c;
				array[i][j] = num;
				num++;
			}
			
			c *= -1;
			
		}//end of while
		System.out.println("A2)");
		for (int k = 0; k < array.length; k++) {
			for (int k2 = 0; k2 < array[k].length; k2++) {
				System.out.print(array[k][k2]);
				
				if(k2<array[k].length-1) System.out.print("\t");//깔끔한 공간 탭을 위해서 가정문 사용
				
			}
			System.out.println();
		}
		System.out.println("[System]2번 문제 해결\n");
		
	}//end of main
}//end of class