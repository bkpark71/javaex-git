package classExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle c = new Circle(20.0);
    System.out.println("c.getRadius() = " + c.getRadius());
    Circle c2 = new Circle(30.0);
    System.out.println("c2.getRadius() = " + c2.getRadius());
    Circle c3 = new Circle();
    c3.setRadius(40.0);
  }
}
