package chapter07;

public class LineCompareTest {
  public static void main(String[] args) {
    // 선의 길이를 비교해서 길이가 더 긴 것을 찾아서
    // 해당 객체를 출력해주기
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    int res = l1.compareTo(l2);
    System.out.println();
    if (res < 0)
      System.out.println(l2 + "이 더 깁니다.");
    else if (res > 0)
      System.out.println(l1 + "이 더 깁니다.");
    else
      System.out.println("두 선의 길이가 같습니다.");
  }
}

class Line implements Comparable{
  int length ;

  public Line(int length){
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Line) {
      Line line = (Line)o;
      return this.length - line.length;
    }
    return 0;
  }

  // 메서드

  @Override
  public String toString() {
    return "Line [length = " + length + "]";
  }
}
