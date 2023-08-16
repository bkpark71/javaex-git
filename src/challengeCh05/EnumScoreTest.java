package challengeCh05;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudents = 0;
    Grade grade;
    Scanner in = new Scanner(System.in);
    System.out.println("학생수를 입력하세요 : ");
    numOfStudents = in.nextInt();
    int[] scores = new int[numOfStudents];
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("학생의 점수를 입력하세요");
      scores[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(scores));
    for (int i = 0; i < scores.length; i++) {
      if(scores[i] >= 90) {
        grade = Grade.A;
      } else if(scores[i] >= 80) {
        grade = Grade.B;
      } else {
        grade = Grade.C;
      }
      System.out.printf("%d 번째 학생의 점수는 %d , 등급은 %s(%s) 입니다.\n",
          i+1, scores[i], grade, grade.getGrade());
    }
  }
}
