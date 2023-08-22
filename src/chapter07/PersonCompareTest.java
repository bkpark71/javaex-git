package chapter07;

import java.util.Arrays;
import java.util.Collections;

public class PersonCompareTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동",32,170,75),
        new Person("박지성",40,175,68),
        new Person("손흥민",20,180,70)
    };

    // 나이를 기준으로 나이가 가장 많은 사람부터 이름을 출력하시오.
    // 두 가지 방법을 이용해서 나이가 많은 사람부터 출력하는 방법을 찾아보기
    // 힌트: 1. compareTo의 리턴값 변형
    //      2. Arrays.sort 후 순서를 뒤집는 메서드 활용
    System.out.println("정렬전");
    for (Person person:persons) {
      System.out.println(person);
    }
    Arrays.sort(persons); // 오름차순
    Arrays.sort(persons, Collections.reverseOrder()); // 순서 뒤집음
    System.out.println("정렬후");
    for (Person person:persons) {
      System.out.println(person);
    }
  }
}

class Person implements Comparable<Person>{
  String name;
  int age;
  int height;
  int weight;
  public Person(String name,int age,int height,int weight){
    this.name=name;
    this.age=age;
    this.height=height;
    this.weight=weight;
  }

  @Override
  public int compareTo(Person person) {
    return this.age - person.age; // 오름차순
        //person.age - this.age;  내림차순

  }
  // 메서드

  @Override
  public String toString() {
    return "Person[이름="+name+", 나이="+age+"]";
  }
}