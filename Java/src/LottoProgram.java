import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
/**
 * Lotto Program
 * 
 * nums[] : 배열 -> 로또 7개의 숫자를 담음
 * num : 랜덤 숫자
 * 
 * set : TreeSet을 담는 컬렉션 -> 로또 7개의 숫자를 담음
 * */
public class LottoProgram {

	public static void main(String[] args) {
		
		int nums[] = new int[7];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) ((Math.random()*45)+1);
			nums[i] = num;
			for (int j = 0; j < i; j++) {
				if(nums[j]==num){
					i--;
					break;//성능을 위해
				}
			}
		}
		
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		System.out.println("-----Set을 이용한 방법으로 해결-----");
		
		Set<Integer> set = new TreeSet<Integer>();
		while(set.size()<7) {
			int lottoNumber = (int)((Math.random()*45)+1);
			set.add(lottoNumber);
		}
		
//		System.out.println(set);
		for (Integer integer : set) {
			System.out.print(integer + "  ");
		}
		
		/* TreeSet으로 한다면 모든게 sort가 되지만,
		 * HashSet으로 하면 일부만 sort되면서 다소 지저분하게 된다.
		 * 이유가 무엇일까?
		 * 
		 * HashSet은 해싱을 이용하여 구현
		 * TreeSet은 이진탐색트리를 이용하여 구현
		 * 
		 * 속도는 HashSet이 더 빠르다(해싱이 더 빠르다)
		 * 
		 * 정렬기능은 이진탐색트리를 이용하였기에 TreeSet이 더 낫다(Comparator 이용)
		 * */
		
	}//end of main
}//end of class
