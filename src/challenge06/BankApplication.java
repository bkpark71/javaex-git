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
        case 4 : withdrawMoney();break;
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
    for (int i = 0; i < bankAccounts.length; i++) {
        if (bankAccounts[i] == null){
          BankAccount bankAccount = new BankAccount(accountNo, accountOwner, balance);
          bankAccounts[i] = bankAccount;
          break;
        } else if (bankAccounts[i].getAccountNo().equals(accountNo)){
          System.out.println("계좌생성 오류 : (오류코드)기존 계좌번호와 일치");
          break;
      }
    }
  }
  static void depositMoney(){
    System.out.println("------");
    System.out.println(" 얘금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("예금액 : ");
    int money=in.nextInt();
    for (BankAccount bankAccount:bankAccounts) {
      if (bankAccount == null) {
        break;
      } else if (bankAccount.getAccountNo().equals(accountNo)){
        bankAccount.deposit(money);
        break;
      }
    }
  }

  static void accountList(){
    System.out.println("-------");
    System.out.println("게좌목록");
    System.out.println("-------");
    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) {
        break;
      } else {
        System.out.printf("%s %s %d \n",
            bankAccounts[i].getAccountNo(),
            bankAccounts[i].getAccountOwner(),
            bankAccounts[i].getBalance());
      }
    }
  }
  static void withdrawMoney(){
    System.out.println("------");
    System.out.println(" 출금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("출금액 : ");
    int money=in.nextInt();
    for (BankAccount bankAccount:bankAccounts) {
      if (bankAccount == null) {
        break;
      } else if (bankAccount.getAccountNo().equals(accountNo)){
        bankAccount.withdraw(money);
        break;
      }
    }
  }
}
