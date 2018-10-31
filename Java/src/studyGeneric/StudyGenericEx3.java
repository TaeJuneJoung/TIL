package studyGeneric;

import java.util.Arrays;

/* 와일드카드 타입(<?>,<? extends ...>, <? super ...>)
 *  : 코드에서 ?를 일반저그올 와일드카드(wildcard)라고 부른다.
 *  
 *  - 제네릭타입<?> : Unbounded Wildcards(제한 없음)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
 *  - 제네릭타입<? extends 상위타입> : Upper Bounded Wildcards(상위 클래스 제한)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입만 올 수 있다.
 *  - 제네릭타입<? super 하위타입> : Lower Bounded Wildcards(하위 클래스 제한)
 *   : 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
 * */
public class StudyGenericEx3 {

	/* Course<?>
	 * 수강생은 모든 타입(Person, Worker, Student, HighStudent)이 될 수 있다. <- 클래스는 아래에 있음(정보포함) */
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" 수강생: "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" 수강생: "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+" 수강생: "+Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
	}//end of main
	
}//end of class

class Course<T> {
	
	private String name;
	private T[] students;
	
	public Course() {
	}
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T[] getStudents() {
		return students;
	}
	public void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}else {//널이 아니면 진행
				continue;
			}
		}
	}
	
}//end of class

/* Student 클래스의 단계
 * 상위 : Person
 * Person 하위 클래스 : Worker, Student
 * Student 하위 클래스 : HighStudent
 * */

class Person{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}//end of Person Class

class Worker extends Person{
	
}//end of Worker Class

class Student extends Person{
	
}//end of Student Class

class HighStudent extends Student{
	
}//end of HighStudent Class