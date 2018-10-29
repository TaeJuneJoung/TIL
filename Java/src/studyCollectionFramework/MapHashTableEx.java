package studyCollectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/* Hashtable
 * - 동기화 : 멀티 스레드가 동시에 실행할수 없다.
 * 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 -> 스레드가 안전하다(thread safe).
 * */
public class MapHashTableEx {

	public static void main(String[] args) {
		
		Map<String,String> map = new Hashtable<String,String>();
		map.put("id#1", "password#1");
		map.put("id#2", "password#2");
		map.put("id#3", "password#3");
		map.put("id#4", "password#4");
		map.put("id#5", "password#5");
		map.put("id#6", "password#6");
		map.put("id#7", "password#7");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[System]Enter Your ID");
			String enterId = scan.nextLine();
			System.out.println("[System]Enter your Password");
			String enterPw = scan.nextLine();
			if(map.containsKey(enterId)&&map.containsValue(enterPw)) {
				System.out.println("[System]" + enterId + ", Welcome aboard.");
				break;
			}else {
				System.out.println("[Warning]The ID or Password is incorrect.");
				System.out.println("[System]Do you want to look up your password?");
				String enterFind = scan.nextLine();
				if(enterFind.equalsIgnoreCase("yes")) {//아이디는 알고 있다고 가정
//					System.out.println(map.get(enterId));//요소가 없기에 비밀번호 바로 알려줌 - 옳지 않은 방법(다른 요소로 확인 후 비밀번호 변경이 보다 나음)
					System.out.println("[System]Enter your new password");
					String newPw = scan.nextLine();
					map.put(enterId, newPw);
					System.out.println("[System]Success");
				}else {
					break;
				}
			}
		}//end of while
		
	}//end of main
}//end of class
