package challenge08;

public interface InterfaceA {
  void method1();
}

class A implements InterfaceA{
  @Override
  public void method1() {
    System.out.println("A의 method 입니다.");
  }
}

class B implements InterfaceA{
  @Override
  public void method1() {
    System.out.println("B의 method 입니다.");
  }
}
