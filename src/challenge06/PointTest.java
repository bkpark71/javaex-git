package challenge06;

public class PointTest {
  public static void main(String[] args) {
    Point p = new Point(10,20);
    System.out.println(p);

    MovablePoint mp = new MovablePoint(5,10,10,20);
    System.out.println(mp);
  }
}

class Point {
  private int x;
  private int y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "좌표 ("+ x + "," + y + ")";
  }
}

class MovablePoint extends Point{
  private int xSpeed;
  private int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed){
    super(x,y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }
  @Override
  public String toString() {
    return "좌표 ("+ super.getX() + "," + super.getY() + ") : " +
           "이동속도 (" + xSpeed + " , " + ySpeed + " )";
  }
}