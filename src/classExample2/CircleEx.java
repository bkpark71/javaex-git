package classExample2;



public class CircleEx {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(10.0);
    Circle c3 = new Circle("Red");
    Circle c4 = new Circle(5.0, "Yellow");

    System.out.println("c1.color = " + c1.color);
  }
}
