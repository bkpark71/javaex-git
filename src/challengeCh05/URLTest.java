package challengeCh05;

import java.util.Scanner;

public class URLTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String url = "";

    while(true){
      System.out.println("URL을 입력하세요 : (종료하려면 bye 입력)");
      url = in.nextLine();
      if(url.equalsIgnoreCase("bye")) break;
      if (url.toLowerCase().endsWith("com")) {
        System.out.printf("%s은 \'com\'으로 끝납니다.\n",url);
      }
      if (url.toLowerCase().contains("java")) {
        System.out.printf("%s은 \'java\'를 포함합니다.\n",url);
      }
    }
  }
}
