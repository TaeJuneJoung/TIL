package studyGeneric;

/* 제네릭 타입의 상속과 구현
 * 제네릭 타입도 다른 타입과 마찬가지로 부모 클래스가 될 수 있다.
 * 자식 제네릭 타입은 추가적으로 타입 파라미터를 가질 수 있다.
 *  */
public class StudyGenericEx4 {
}//end of class

class Product<N,P> {
	
	private N name;
	private P price;
	
	public Product() {
	}
	public Product(N name, P price) {
		this.name = name;
		this.price = price;
	}
	
	public N getName() {
		return name;
	}
	public void setName(N name) {
		this.name = name;
	}
	public P getPrice() {
		return price;
	}
	public void setPrice(P price) {
		this.price = price;
	}
}//end of class

class TV<N,P,M> extends Product<N,P>{//자식 제네릭 타입은 추가적으로 타입 파라미터를 가질 수 있다.
	
	private M model;

	public TV() {
	}
	public TV(M model) {
		this.model = model;
	}

	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}//end of class