package challengeCh05;

import java.util.Scanner;

public class HistogramTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = 0;
    int mok = 0;
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d 번째 숫자(0~99사이의 정수)를 입력하세요.",i+1);
      num = in.nextInt();
      if(num >= 0 && num < 100) {
        mok = num / 10;
        numbers[mok]++;
      }
//      if (num >= 90) {
//        numbers[9]++;
//      } else if ( num >= 80 ){
//        numbers[8]++;
//      } else if ( num >= 70 ){
//        numbers[7]++;
//      } else if ( num >= 60 ){
//        numbers[6]++;
//      } else if ( num >= 50 ){
//        numbers[5]++;
//      } else if ( num >= 40 ){
//        numbers[4]++;
//      } else if ( num >= 30 ){
//        numbers[3]++;
//      } else if ( num >= 20 ){
//        numbers[2]++;
//      } else if ( num >= 10 ){
//        numbers[1]++;
//      } else if ( num >= 0 ){
//        numbers[0]++;
//      }
    }
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d 에서 %d : ", i*10, i*10 + 9);
      for(int j=0; j<numbers[i]; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
