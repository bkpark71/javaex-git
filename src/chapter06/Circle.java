package chapter06;

public class Circle {
  double radius ;
  static String color = "white";

  static void setRadius(String aaa){
    System.out.println("white 입니다.");
  }

  final void changeRadius(double radius){
    this.radius = radius;
  }

  private void secret(){
    System.out.println("비밀입니다.");
  }
  protected void findRadius() {
    System.out.println("반지름이 10.0 입니다.");
  }

  public double findArea() {
    return Math.PI * radius * radius;
  }
}
