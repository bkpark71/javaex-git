package chapter05;

import java.util.Arrays;

public class FindMax {
  public static void main(String[] args) {
    int[] numbers = {2,3,10,1,8};
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if(numbers[i] > max) max = numbers[i];
    }
    System.out.println("max = " + max);
    System.out.println(Arrays.toString(numbers));

    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println("max = " + numbers[numbers.length-1]);
  }
}
