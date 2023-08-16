package chapter05;

public class MainArgumentEx {
  public static void main(String[] args) {
    // 인자가 2개 들어와야 하며, 2번째 인자로 입력된 숫자만큼 첫번째 인자로 입력된 문자를 출력
    // 안녕 3 ==> 안녕\n 안녕\n 안녕\n
    // 주의1 > args 문자열 배열이므로 모든 인자는 문자이다. 그러므로 2번째 인자를 숫자로 변환
    // 주의2 > args 2개 가 입력되었을 때만 실행, 1개의 인자만 입력되면 출력하지 않는다.
    if(args.length == 2){
      int count = Integer.parseInt(args[1]);
      printArgument(args[0], count);
    }
  }

  static void printArgument(String arg, int count){
    for (int i = 0; i < count; i++) {
      System.out.println(arg);
    }
  }
}
