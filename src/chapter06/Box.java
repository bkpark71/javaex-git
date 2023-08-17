package chapter06;

public class Box {
  String name;
  public Box(String name){
    this.name = name;
  }
}

class ColoredBox extends Box {
   public ColoredBox(String name) {
    super(name);
  }
}
