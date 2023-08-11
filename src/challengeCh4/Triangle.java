package challengeCh4;

public class Triangle {
  private double height;
  private double width;

  public Triangle(double height, double width) {
    this.height = height;
    this.width = width;
  }
  public double getHeight() {
    return height;
  }
  public double getWidth() {
    return width;
  }
  public void setHeight(double height) {
    if (height <= 0.0) {
      System.out.println("삼각형의 높이는 0보다 커야 합니다.");
      return;
    }
    this.height = height;
  }
  public void setWidth(double width) {
    if (width <= 0.0) {
      System.out.println("삼각형의 밑변은 0보다 커야 합니다.");
      return;
    }
    this.width = width;
  }
  public double findArea() {
    return width * height / 2;
  }

  public boolean isSameArea(Triangle t2) {
    return  this.findArea() == t2.findArea();
  }
}
