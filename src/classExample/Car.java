package classExample;

public class Car {
  int speed=0;
  boolean direction=true;

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirection(String gear){
    if (gear.equals("전진")){
      this.direction = true;
    } else if (gear.equals("후진")){
      this.direction = false;
    }
  }
}
