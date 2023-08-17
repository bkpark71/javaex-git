package chapter06;

public class FinalClassEx {
  public static void main(String[] args) {
    new Best();
    new Good();
    new Better();
  }
}

class Good {

}

class Better extends Good {

}

final class Best extends Better {

}

//class Excellent extends Best {
//
//}
