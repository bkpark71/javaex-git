package classExample2;

public class Circle {
  double radius;
  String color;

  public Circle() {
    this.radius = 1.0;
    this.color = "White";
  }
  public Circle(double radius){
    this.radius = radius;
    this.color = "White";
  }

  public Circle(String color){
    this.radius = 1.0;
    this.color = color;
  }

  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }
}
