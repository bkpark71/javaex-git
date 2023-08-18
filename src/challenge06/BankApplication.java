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

    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) {
        BankAccount bankAccount = new BankAccount(accountNo, accountOwner, balance);
        bankAccounts[i] = bankAccount;
        break;
      } else if(bankAccounts[i].getAccountNo().equals(accountNo)) {
        System.out.println("계좌 생성 오류 : [원인 - 동일 계좌 존재]");
        break;
      }
    }
  }
  static void depositMoney(){
    System.out.println("------");
    System.out.println(" 예금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("예금액 : ");
    int money=in.nextInt();
    BankAccount findAccount = findAccount(accountNo);
    findAccount.deposit(money);
  }

  static void accountList(){
    System.out.println("-------");
    System.out.println("계좌목록");
    System.out.println("-------");
    for (BankAccount bankAccount : bankAccounts) {
      if(bankAccount == null) break;
      System.out.printf("계좌번호 : %s, 예금주 : %s, 잔액 : %d \n",
          bankAccount.getAccountNo(), bankAccount.getAccountOwner(), bankAccount.getBalance());
    }
  }
  static void withdrawMoney(){
    System.out.println("------");
    System.out.println(" 출금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo=in.next();
    System.out.print("출금액 : ");
    int money = in.nextInt();
    BankAccount findAccount = findAccount(accountNo);
    findAccount.withdraw(money);
  }

  // 동일한 계좌정보가 존재하는지 찾는 메서드 필요해서 리팩터링 진행
  static BankAccount findAccount(String accountNo){
    BankAccount returnAccount = null;
    for (BankAccount bankAccount : bankAccounts) {
      if(bankAccount == null) break;
      if(bankAccount.getAccountNo().equals(accountNo)){
        returnAccount = bankAccount;
      }
    }
    return returnAccount;
  }
  static int findIndex(String accountNo){
    int index = -1;
    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) break;
      if(bankAccounts[i].getAccountNo().equals(accountNo)){
        index = i;
      }
    }
    return index;
  }
}
