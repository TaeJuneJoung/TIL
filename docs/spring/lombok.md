# Lombok

롬복은 Getter, Setter 등을 편리하게 만들어주기 때문에 사용한다.

Getter, Setter를 이클립스를 통해 자동 완성 시킬수도 있지만, annotation으로 처리해서 내부적으로 되게 하는 것이 롬복이라고 생각하면 된다.

잦은 변수의 수정이 있다라고 한다면 편리할 것이다. (어노테이션이 다 해주니까..)

반대로, getter, setter 내부에 로직을 변경해야한다면 불편한 점이 있을 것이다.



## Before / After 비교

**Before**

```java
public class Student {
  private int id;
  private String name;
  
  public Student(){}
  
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
  }
  
  @Override
  public boolean equals(object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(id, student.id) && Objects.equals(name, student.name);
  }
  
  @Override
  public int hashCode() {
    return Object.hash(id, name);
  }
}
```



**After**

```java
@ToString
@EqualsAndHashCode
@Getter @Setter
public class Student {
  private int id;
  private String name;
  
  public Student() {}
  
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
```



### 동작원리

컴파일 할 때 annotation processor로 등록된 Lombok processor가 annotation을 확인하고 그에 맞는 메소드를 자동으로 생성하여 bytecode로 변환이 된다고 한다.





---

**개인적 생각**

Lombok을 사용하면 코드 자체가 깔끔해진다.

getter, setter 등 자동으로 만들어주는 기능이 있는 것으로 보아 소스상의 고생은 크게 없을 것으로 보이고 쓰는 사람들이 있고 안 쓰는 사람들이 있는 것을 고려했을 때는 알고만 넘어가는 것으로 좋다고 느껴짐.

업데이트가 지속적으로 되니 점점 좋아지겠지만 아직은 시기상조라고 생각함

---



## 참고링크

https://needjarvis.tistory.com/696

https://galid1.tistory.com/531