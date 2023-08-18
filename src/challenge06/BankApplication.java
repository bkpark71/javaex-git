package challenge06;

import java.util.Scanner;

public class BankApplication {
  static BankAccount[] bankAccounts = new BankAccount[100];
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    int opt = 0;

    while(true){
      System.out.println("---------------------------------------------------");
      System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("---------------------------------------------------");
      System.out.print("선택>");
      opt = in.nextInt();
      if (opt == 5) {
        System.out.println("프로그램 종료");
        break;
      }
      switch(opt){
        case 1 : createAccount(); break;
        case 2 : accountList(); break;
        case 3 : depositMoney(); break;
        case 4 : withdrawMoney(); break;
      }
    }
  }

  static void createAccount(){
    System.out.println("------");
    System.out.println("계좌생성");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("예금주 : ");
    String accountOwner=in.next();
    System.out.print("초기입금액 : ");
    int balance=in.nextInt();
    ///
  }
  static void depositMoney(){
    System.out.println("------");
    System.out.println(" 예금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("예금액 : ");
    int money=in.nextInt();
    ///
  }

  static void accountList(){
    System.out.println("-------");
    System.out.println("계좌목록");
    System.out.println("-------");
    ///
  }
  static void withdrawMoney(){
    System.out.println("------");
    System.out.println(" 출금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("출금액 : ");
///
  }

  // 동일한 계좌정보가 존재하는지 찾는 메서드 필요해서 리팩터링 진행

}
