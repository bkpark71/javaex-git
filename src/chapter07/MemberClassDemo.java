package chapter07;

public class MemberClassDemo {
  // 멤버 - 필드
  private String secret = "비공개";
  String s = "외부";
  // 멤버 - 클래스
  class MemberClass {
    // 멤버 - 필드
    String s = "내부";
    // 멤버 - 메서드
    public void show1(){
      System.out.println("inner class");
      System.out.println(secret);
      System.out.println(this.s);
      System.out.println(MemberClassDemo.this.s);
    }
  }

  // 멤버 - 메서드
  public static void main(String[] args) {
    MemberClassDemo m = new MemberClassDemo();
    System.out.println(m.secret);
    System.out.println(m.s);

    MemberClassDemo.MemberClass mm = m.new MemberClass();
    System.out.println(mm.s);
    mm.show1();
  }
}
