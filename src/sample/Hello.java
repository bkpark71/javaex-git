package sample;

/**
 * Hello sample class
 * main-method
 * hello 출력하는 프로그램
 */
public class Hello {
  public static void main(String[] args) {
    char three = 3 + '0';
    int i = '3' - '0';
    String str3 = 3.0 + "";
    double d3 = Double.parseDouble(str3);
    double res = d3 + 10;
    char c;
    c = "30".charAt(1);

    double result =7/(double)4;
    System.out.println("result = " + result);
    System.out.printf("i = %d and d3 = %.1f\n",i, d3);
    


//    String hello = "안녕 !";
//    System.out.println("hello");
//    System.out.println(hello);

  }
}
