package chapter05;

import java.util.Arrays;

public class ArrayMultiEx {
  public static void main(String[] args) {
    int[][] scores = { {90,100,80,70,80}, {90,100,80,70,80}, {60,60,70,80,90}};
    int[] sums = new int[3];
    int total = 0;

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        sums[i] += scores[i][j];
      }
      total += sums[i];
    }
    System.out.println(Arrays.toString(sums));
    System.out.println("total = " + total);
  }
}
