package challenge06;

import java.util.Scanner;

public class BankApplication {
  public static void main(String[] args) {
    Account[] accounts = new Account[100];
    Scanner in = new Scanner(System.in);
    int opt = 0;

    while(true){
      System.out.println("---------------------------------------------------");
      System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("---------------------------------------------------");
      System.out.print("선택>");
      opt = in.nextInt();
      if (opt == 5) break;
      switch(opt){
        case 1 : createAccount(); break;
        case 2 : accountList(); break;
        case 3 : depositMoney(); break;
        case 4 : withdrawMoney();break;
      }
    }
  }

  static void createAccount(){
    System.out.println("계좌를 생성합니다.");
  }
  static void depositMoney(){
    System.out.println("입금합니다.");
  }

  static void accountList(){
    System.out.println("게좌목록을 출력합니다.");
  }
  static void withdrawMoney(){
    System.out.println("출금합니다.");
  }
}
