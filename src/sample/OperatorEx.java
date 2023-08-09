package sample;

public class OperatorEx {
  public static void main(String[] args) {
    int i = 0;
    ++i;
    int j = i;
    System.out.printf("i = %d and j = %d\n" , i, j);

    int l = 0;
    int m = l;
    l++;
    System.out.printf("l = %d and m = %d" , l, m);
  }
}
