package chapter05;

public class MonthEnumTest {
  public static void main(String[] args) {
    Month month = Month.APR;
    System.out.println(month.name());
    System.out.println(month.ordinal());
    System.out.println(month.getMonth());
  }
}
