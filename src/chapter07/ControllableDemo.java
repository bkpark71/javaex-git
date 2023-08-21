package chapter07;

public class ControllableDemo {
  public static void main(String[] args) {
//    TV tv1 = new TV();
//    tv1.turnOn();
//    tv1.turnOff();
//    tv1.repair();
//    //tv1.reset();
//    Controllable.reset();
//
//    TV tv2 = new TV();
//    tv2.RemoteOn();
//    tv2.RemoteOff();
//
//    Computer computer = new Computer();
//    computer.turnOn();
//    computer.turnOff();
//    computer.repair();
//    //computer.reset();
//    Controllable.reset();
//
//    Notebook notebook = new Notebook();
//    notebook.turnOn();
//    notebook.turnOff();
//    notebook.inMyBag();
    Controllable[] controllables = {
        new TV(),
        new Computer(),
        new Notebook()
    };

    for (Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
      Controllable.reset();
    }
  }
}
