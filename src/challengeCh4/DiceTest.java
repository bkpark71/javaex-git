package challengeCh4;

public class DiceTest {
  public static void main(String[] args) {
    Dice dice = new Dice();
    for(int i=0 ; i<6;  i++) {
      System.out.printf("주사위의 숫자는 %d 입니다.\n", dice.roll());
    }
  }
}
