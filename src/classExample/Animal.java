package classExample;

class Animal {
  private String name="Animal";
  void 숨쉰다(){
    System.out.println("숨쉰다");
      }
  void 먹는다(){
    System.out.println("먹는다");
      }
  void 움직인다(){
    System.out.println("움직인다");
      }

  @Override
  public String toString() {
    return "제이름은 " + name + "입니다.";
  }
}

class Bird extends Animal{
  private String name="Bird";
  @Override
  void 움직인다() {
//    super.움직인다();
    System.out.println("날아간다.");
  }

  @Override
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }
  //  void 헤엄친다(){
//    System.out.println("헤엄친다");
//  }
}

class Tiger extends Animal{
  private String name="Tiger";
  @Override
  void 움직인다() {
//    super.움직인다();
    System.out.println("달린다.");
  }
  @Override
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }

  //  void 달린다(){
//    System.out.println("달린다");
//  }
}

class Fish extends Animal {
  private String name="Fish";
  @Override
  void 움직인다() {
    System.out.println("헤엄친다.");
  }
  @Override
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }
}