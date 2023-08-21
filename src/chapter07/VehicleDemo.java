package chapter07;

public class VehicleDemo {
  public static void main(String[] args) {
    // Vehicle 은 앞으로간다. 뒤로간다. 메서드기능
    // NormalCar 는 Vehicle을 구현해서 만든다.
    // NormalCar를 상속받아 생성된 FireTruck = 물을 뿜는다. 기능 구현
    // NormalCar를 상속받아 생성된 Ambulance = 싸이렌을 울린다. 기능 구현
    Vehicle v1 = new FireTruck();
    Vehicle v2 = new Ambulance();
    Vehicle v3 = new NormalCar();

    action(v3);
    action(v2);
    action(v1);
  }
  static void action(Vehicle vehicle){
    if(vehicle instanceof FireTruck){
      ((FireTruck) vehicle).water();
    } else if (vehicle instanceof Ambulance){
      ((Ambulance) vehicle).siren();
    } else if(vehicle instanceof NormalCar) {
      vehicle.forward();
    }
  }
}

interface Vehicle{
  void forward();
  void backward();
}

class NormalCar implements Vehicle{
  @Override
  public void forward() {
    System.out.println("앞으로 간다.");
  }

  @Override
  public void backward() {
    System.out.println("뒤로 간다.");
  }
}

class FireTruck extends NormalCar{
  void water(){
    System.out.println("소방차가 물을 뿜는다.");
  }
}

class Ambulance extends NormalCar{
  public void siren(){
    System.out.println("사이렌을 울린다.");
  }
}