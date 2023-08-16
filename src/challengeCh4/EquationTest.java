package challengeCh4;

public class EquationTest {
  public static void main(String[] args) {
    for (int x = 0; x <= 10; x++) {
      for (int y = 0; y <= 10 ; y++) {
        if(4*x + 5*y == 60){
          System.out.printf("4x + 5y = 60인 x와 y는 %d와 %d 입니다.\n",x,y);
        }
      }
    }
  }
}
