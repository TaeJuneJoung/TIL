package studyGeneric;

public class StudyGenericEx {
	public static void main(String[] args) {
		
		/* 멀티 타입 파라미터 Class */
		Study<String,String> study1 = new Study<>();
		study1.setKey("1교시");
		study1.setValue("English");
		System.out.println(study1.getKey()+"\t"+study1.getValue());
		
		Study<Integer,String> study2 = new Study<>();
		study2.setKey(2);
		study2.setValue("Math");
		System.out.println(study2.getKey()+"교시\t"+study2.getValue());
		
		Study<String,Exercise<String,String>> study = new Study<>();
		study.setKey("3교시");
		study.setValue(new Exercise<String,String>());
		Exercise<String,String> exercise = study.getValue();
		exercise.setKey("특별활동");
		exercise.setValue("체육");
		System.out.println(study.getKey()+"\t"+exercise.getKey()+"\t"+exercise.getValue());
		
		
		/* Generic Method */
		StudyGenericEx sge = new StudyGenericEx();
		String str = sge.<String>genericMethod("123");
		System.out.println(str);
		str = sge.<String>genericMethod("확인");
		System.out.println(str);
		
		int num = sge.<Integer>genericMethod(123);
		System.out.println("명시적으로 구체적 타입을 지정 : "+num);
		
		num = sge.genericMethod(456);
		System.out.println("매개값을 보고 구체적 타입을 추정 : "+num);
		
	}//end of main
	
	/* Generic Method */
	public <T> T genericMethod(T t) {
		return t;
	}
}//end of class

/* 멀티 타입 파라미터 Class */
class Study<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
}//end of class

class Exercise<K,V>{
	private K key;
	private V value;

	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
}//end of class