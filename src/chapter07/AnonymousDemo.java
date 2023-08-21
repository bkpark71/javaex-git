package chapter07;

public class AnonymousDemo {
  public static void main(String[] args) {
    Parent p = new Parent() {
      @Override
      public void parent() {
        System.out.println("익명클래스에서 구현한 메서드");
      }
    };
  }

}

//class OnlyOnce implements Parent{
//  @Override
//  public void parent() {
//    System.out.println("parent");
//  }
//}

interface Parent {
  void parent();
}


