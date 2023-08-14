package chapter05;

public class Array1Ex {
  public static void main(String[] args) {
    int sum = 0, avg = 0;
    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum / 3;

    sum = 0;
    avg = 0;
//    int[] scores = new int[5];
//    scores[0]=90;
//    scores[1]=80;
//    scores[2]=100;
//    scores[3]=100;
//    scores[4]=90;
    int[] scores = {90,80,100};

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d , avg = %d \n", sum, avg);
    int[] scoresBig = new int[6];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
    scores = scoresBig;
    scores[3]=110;
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    for (int score : scores ) {
      System.out.println(score);
    }
  }
}
