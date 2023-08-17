package challenge06;

public class CircleTest {
  public static void main(String[] args) {
    Circle c = new Circle(10);
    ColoredCircle cc = new ColoredCircle(20,"빨강");

    c.show();
    cc.show();
  }
}

class Circle{
  int radius;
  public Circle(int radius){
    this.radius=radius;
  }
  void show(){
    System.out.println("반지름이 " + radius + " 인 원이다.");
  }
}

class ColoredCircle extends Circle{
  String color;
  public ColoredCircle(int radius, String color){
    super(radius);
    this.color = color;
  }
  void show(){
    System.out.println("반지름이 " + radius + " 인 " + color+ " 원이다.");
  }
}