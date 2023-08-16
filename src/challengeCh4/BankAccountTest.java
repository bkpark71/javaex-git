package challengeCh4;

import java.util.Scanner;

public class BankAccountTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int opt = 0;
    long balance = 0;
    long money = 0;
    while(true){
      System.out.println("--------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
      System.out.println("--------------------------------");
      System.out.print("선택>");
      opt = in.nextInt();
      if (opt == 4) {
        System.out.println("프로그램 종료!");
        break;
      }
      switch (opt) {
        case 1 -> {
          System.out.print("예금액>");
          money = in.nextInt();
          balance += money;
        }
        case 2 -> {
          System.out.print("출금액>");
          money = in.nextInt();
          if (balance >= money) {
            balance -= money;
          } else {
            System.out.println("출금오류 : 원인>잔액부족");
          }
        }
        case 3 -> System.out.println("잔고>"+balance);
      }
    }
  }
}
