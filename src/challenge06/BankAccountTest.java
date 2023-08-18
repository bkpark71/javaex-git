package challenge06;

public class BankAccountTest {
  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(10_000);
    System.out.println("현재 잔고 " + account.getBalance()); // 10000

    account.setBalance(-1000);
    System.out.println("현재 잔고 " + account.getBalance()); // 10000

    account.setBalance(2_000_000);
    System.out.println("현재 잔고 " + account.getBalance()); // 10000

    account.setBalance(300_000);
    System.out.println("현재 잔고 " + account.getBalance()); // 10000

    account.withdraw(300_000);
    System.out.println("현재 잔고 " + account.getBalance()); // 0

    account.deposit(1000000);
    System.out.println("현재 잔고 " + account.getBalance()); // 1000000

    account.deposit(100);
    System.out.println("현재 잔고 " + account.getBalance()); // 1000000
  }
}
