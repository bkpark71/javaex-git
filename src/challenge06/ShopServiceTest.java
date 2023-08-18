package challenge06;

public class ShopServiceTest {
  public static void main(String[] args) {
    ShopService s1 = ShopService.getInstance();
    ShopService s2 = ShopService.getInstance();
    Object o1 = new Object();
    Object o2 = new Object();
    if(o1 == o2) {
      System.out.println("같은 객체입니다.");
    } else {
      System.out.println("다른 객체입니다.");
    }
  }
}
