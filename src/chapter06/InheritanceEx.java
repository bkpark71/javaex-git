package chapter06;

public class InheritanceEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.radius = 2.0;
    circle.setRadius("black");
    System.out.println(Circle.color);

    Ball ball = new Ball();
    ball.radius = 2.0;
    ball.changeRadius(10.0);
    System.out.println(Circle.color);

    System.out.printf("원의 넓이 %.2f , 공의 넓이 %.2f\n",
        circle.findArea(),
        ball.findArea());
    System.out.printf("공의 부피 %.2f",ball.findVolume());
  }
}
