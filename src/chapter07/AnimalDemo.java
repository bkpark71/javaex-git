package chapter07;

public class AnimalDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cuckcoo cuckcoo = new Cuckcoo();

    makeSound(dog);
    makeSound(cuckcoo);
  }

  private static void makeSound(Animal animal) {
    animal.sound();
    if(animal instanceof Dog){
      Dog dog = (Dog)animal;
      dog.run();
    } else if (animal instanceof Cuckcoo cuckcoo){
      cuckcoo.fly();
    }
  }
}

interface Animal{
  void sound();
}

class Dog implements Animal{

  @Override
  public void sound() {
    System.out.println("멍멍~~");
  }

  public void run(){
    System.out.println("달린다.");
  }
}

class Cuckcoo implements Animal{

  @Override
  public void sound() {
    System.out.println("뻐꾹~~");
  }

  public void fly(){
    System.out.println("날아간다.");
  }
}