package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();
    int num = 10;
    Bird bird = null;
    System.out.println("bird = " + bird);
    bird = new Bird();
    System.out.println("bird = " + bird);
    bird.움직인다();
    bird.먹는다();

    Tiger tiger = new Tiger();
    System.out.println("tiger = " + tiger);
    tiger.움직인다();
    //tiger.달린다();
    tiger.숨쉰다();
    Animal animal = new Animal();
    System.out.println("animal = " + animal);
    animal.움직인다();
    Fish fish = new Fish();
    System.out.println("fish = " + fish);
    fish.움직인다();
  }
}
