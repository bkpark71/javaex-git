package chapter07;

public class PersonCompareTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동",32,170,75),
        new Person("박지성",40,175,68),
        new Person("손흥민",20,180,70)
    };

    // 나이를 기준으로 나이가 가장 많은 사람부터 이름을 출력하시오.

  }
}

class Person {
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
  // 메서드
}