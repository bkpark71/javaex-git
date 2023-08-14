package chapter05;

import classExample.Circle;

public class ArrayClass1Ex {
  public static void main(String[] args) {
    // findArea() 가 있는  Circle 을 원소로 가지는 배열 , 배열의 크기는 5
    // Circle의 radius 다르게 초기화(1.0,2.0,3.0,4.0,5.0)
    // 5개의 원의 넓이를 출력
    Circle[] circles =  new Circle[5];
    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle((double)i+1);
    }
    int i=0;
    for (Circle circle : circles) {
      System.out.printf("원[%d]의 넓이 = %.2f\n",i++,circle.findArea());
    }
  }
}
