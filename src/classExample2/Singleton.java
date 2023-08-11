package classExample2;

public class Singleton {
  private static Singleton singleton = new Singleton();
  private Singleton(){
  }

  static Singleton getInstace(){
    return singleton;
  }
}
