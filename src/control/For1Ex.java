package control;

public class For1Ex {
  public static void main(String[] args) {
//    for(int i = 0; i < 10 ; i++) {
//      System.out.println("hello world" + (i+1));
//    }

//    int i = 0;
//    while(i < 10) {
//      System.out.println("hello world" + (i+1));
//      i++;
//    }

    int i = 0;
    while(true) {
      System.out.println("hello world" + (i+1));
      i++;
      if(i >= 10) {
        break;
      }
    }
  }
}
