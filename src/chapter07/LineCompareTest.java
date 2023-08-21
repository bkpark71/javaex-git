package chapter07;

public class LineCompareTest {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    l1.compareTo(l2);

  }
}

class Line {
  int length ;

  public Line(int length){
    this.length = length;
  }

  // 메서드
}
