package chapter07;

/**
 * @implSpec : 전자제품을 제어하기 위한 메서드를 가진 인터페이스
 */
public interface Controllable {
  /**
   * 필요한 경우 오버라이드해서 사용하기
   *  @param : X
   *  @return : void
   *  @throws : X
   *
   */
  default void repair(){
    //System.out.println("수리한다.");
    show("수리한다.");
  }
  static void reset(){
    System.out.println("장비를 초기화한다.");
  }
  private void show(String s){
    System.out.println(s);
  }
  void turnOn();
  void turnOff();
}
