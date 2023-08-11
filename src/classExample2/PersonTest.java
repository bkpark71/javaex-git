package classExample2;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayHello();
    Person p2 = new Person();
    p2.setName("대한").setAge(21).sayHello();
  }
}
