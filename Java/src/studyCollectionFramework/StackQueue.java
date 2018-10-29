package studyCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 회계에서 배운 내용을 생각해보면 쉽다.
 * F -> First
 * L -> Last
 * I -> In
 * O -> Out
 * 
 * LIFO -> Last In First Out
 * : 나중에 들어온게 먼저 나간다.
 * - 스택(Stack)
 * = FILO와 같은 의미이다. 처음 들어온게 가장 나중에 나간다
 * 대표적인 스택(Stack)의 예) JVM 스택 메모리
 * 
 * FIFO -> First In First Out
 * : 처음 들어온게 먼저 나간다.
 * - 큐(Queue)
 * = LILO -> Last In Last Out. 가장 나중에 들어온게 가장 나중에 나간다.
 * 대표적인 큐(Queue)의 예) 스레드풀(ExecutorService)의 작업 큐
 * */
public class StackQueue {
	public static void main(String[] args) {
		
		/* 스택(Stack) 생성 - LIFO */
		Stack<Message> stack = new Stack<Message>();
		
		//push(E item) : 주어진 객체를 스택에 넣는다. - Element
		stack.push(new Message(1,"스택"));
		stack.push(new Message(2,"메세지"));
		stack.push(new Message(3,"확인"));
		stack.push(new Message(4,"신고"));
		stack.push(new Message(5,"삭제"));
		
		//peek() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거하지 않는다. - Element
		Message message = stack.peek();
		System.out.println("Num : " + message.getNum() +"\tContent : " + message.getContent());//Num : 5	Content : 삭제
		System.out.println(stack.size());//5 - 삭제되지 않는다.
		
		//pop() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다. - Element
		message = stack.pop();
		System.out.println("Num : " + message.getNum() +"\tContent : " + message.getContent());//Num : 5	Content : 삭제
		System.out.println(stack.size());//4 - 삭제된다.
		
		//삭제됨을 이용해서 이렇게 사용할 수도 있다.
		while(stack.size()>0) {
			message = stack.pop();
			System.out.println("Num : " + message.getNum() +"\tContent : " + message.getContent());
		}
		//Collection과 Map을 사용할 일이 있을 때 Stack과 Queue의 특성을 생각하며 어떠한 것을 사용하면 좋을지 고민해보는 게 좋을 듯!
		
		System.out.println("\n---------------------------\n");
		
		/* 큐(Queue) 생성 - FIFO */
		Queue<Message> queue = new LinkedList<Message>();//#참고! Queue는 LinkedList로 받아야한다. LinkedList 인접 참조, List에서 동기화는 Vector
		
		//offer(E e)
		//add(E e)
		queue.offer(new Message(1,"스택"));
		queue.offer(new Message(2,"메세지"));
		queue.offer(new Message(3,"확인"));
		queue.offer(new Message(4,"신고"));
		queue.offer(new Message(5,"삭제"));
		
		//peek() : 객체 하나를 가져온다. 객체를 큐에서 삭제하지 않는다. - Element
		message = queue.peek();
		System.out.println("Num : " + message.getNum() +"\tContent : " + message.getContent());//Num : 1	Content : 스택
		
		//poll() : 객체 하나를 가져온다. 객체를 큐에서 삭제한다. - Element
		while(queue.size()>0) {
			message = queue.poll();
			System.out.println("Num : " + message.getNum() +"\tContent : " + message.getContent()+"\tQueue Size : " + queue.size());
		}
		
	}//end of main
}//end of class

class Message {
	
	private int num;
	private String content;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Message() {
	}
	
	public Message(int num, String content) {
		this.num = num;
		this.content = content;
	}
	
}//end of class