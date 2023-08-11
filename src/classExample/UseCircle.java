package classExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle(20.0);
    System.out.println("c1 = " + c1);
    Circle c2 = new Circle(30.0);
    System.out.println("c2 = " + c2);
    c1=c2;
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
  }
}
