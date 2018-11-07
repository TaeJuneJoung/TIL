package studyInheritance;

public class StudyAbstractEx {
	
	public static void animalSound(Animal animal) {
		animal.sound();//Override된 Method 호출
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println();
		Animal animal = null;
		animal = new Dog();//Promotion
		animal.sound();
		animal = new Cat();//Promotion
		animal.sound();
		
		System.out.println();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}//end of main
}//end of class

abstract class Animal {
	//Field
	public String kind;
	//Constructor
	//Method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();//abstract method(추상 메소드)
}//end of abstract Animal class

class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}//end of Dog class

class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}//end of Cat class