package challenge08;

public class InterfaceExample {
  public static void main(String[] args) {
//    A a = new A();
//    B b = new B();
//    a.method1();
//    b.method1();


    InterfaceA ia = new A();
    ia.method1();
    ia = new B();
    ia.method1();
    }


}
