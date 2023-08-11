package classExample2;

public class SingletonTest {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstace();
    Singleton singleton2 = Singleton.getInstace();

    System.out.println(singleton1);
    System.out.println(singleton2);
  }
}
