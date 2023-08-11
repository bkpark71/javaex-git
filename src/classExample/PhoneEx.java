package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone("갤럭시S23", 1_000_000);
    System.out.println(Phone.getNumOfPhones() + "대가 생성되었습니다.");
    myPhone.print();
    System.out.println(myPhone.getNumOfPhones() + "대가 생성되었습니다.");

    Phone yourPhone = new Phone("아이폰i15", 1_200_000);
    System.out.println(Phone.getNumOfPhones() + "대가 생성되었습니다.");
    yourPhone.print();
    System.out.println(yourPhone.getNumOfPhones() + "대가 생성되었습니다.");
    System.out.println(myPhone.getNumOfPhones() + "대가 생성되었습니다.");

  }
}
