package chapter07;

public class EagleTest3 {
  // 멤버 클래스
  ABird b = new ABird(){
    void fly(){
      System.out.println("독수리가 날아간다.");
    }
  };


  // 메서드
  public static void main(String[] args) {
    EagleTest3 eagleTest3 = new EagleTest3();
    eagleTest3.b.fly();
  }
}
