package challengeCh4;

public class DiceSumTest {
  public static void main(String[] args) {
    int 눈1 =0, 눈2 =0;
    while(true) {
      눈1 = (int) (Math.random() * 6) + 1;
      눈2 = (int) (Math.random() * 6) + 1;
      System.out.printf("눈1 : %d, 눈2 : %d \n", 눈1, 눈2);
      if (눈1 + 눈2 == 5) break;
    }
  }
}
