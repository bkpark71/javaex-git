package chapter07;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] c = {
        new TV2(false),
        new Radio(true)
    };

    for (Controller controller : c){
      controller.show();
    }
  }
}

abstract class Controller{
  boolean power;
  public Controller(boolean power){
    this.power = power;
  }
  void show(){
    if(power) {
      System.out.println(this.getName()+"가 켜졌습니다.");
    }  else {
      System.out.println(this.getName()+"가 꺼졌습니다.");
    }
  }
  abstract String getName();
}

class TV2 extends Controller{
  public TV2(boolean power) {
    super(power);
  }
  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller{
  public Radio(boolean power) {
    super(power);
  }
  @Override
  String getName() {
    return "Radio";
  }
}