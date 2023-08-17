package chapter06;

public class Vehicle {
  String name = "탈 것";

  void whoAmI(){
    System.out.println("나는 탈 것입니다.");
  }
  static void move(){
    System.out.println("이동한다.");
  }
}

class Car extends Vehicle {
  String name = "자동차";

  void whoAmI() {
    System.out.println("나는 자동차입니다.");
  }

  static void move(){
    System.out.println("달린다.");
  }
}

class SportsCar extends Car {
  void whoAmI(){
    System.out.println("나는 스포츠카입니다.");
  }
}