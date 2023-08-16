package chapter06;

public class Ball extends Circle {
  @Override
  public double findArea() {
    return 4 * Math.PI * radius * radius;
  }


  @Override
  protected void findRadius() {
    super.findRadius();
  }

  public double findVolume() {
    return 4/3 * (Math.PI * radius * radius * radius);
  }
}
