package challenge06;

public class PersonTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("길동이", 22),
        new Student("황진이", 23, 100),
        new ForeignStudent("Amy", 30, 200, "U.S.A")
    };

    for (Person person : persons) {
      System.out.println(person.show());
    }

  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  String show(){
    return "사람[이름:" + name + ", 나이" + age + "]";
  }
}

class Student extends Person{
  private int no;
  public Student(String name,int age, int no){
    super(name, age);
    this.no = no;
  }

  public int getNo() {
    return no;
  }

  String show(){
    return "사람[이름:" + super.getName() + ", 나이" + super.getAge() + ", 학번 " + no + "]";
  }
}

class ForeignStudent extends Student{
  private String nationality;

  public ForeignStudent(String name, int age, int no, String nationality){
    super(name,age,no);
    this.nationality = nationality;
  }

  public String getNationality() {
    return nationality;
  }

  String show(){
    return "사람[이름:" + super.getName() + ", 나이" + super.getAge() + ", 학번 " +
        super.getNo() + ", 국적 : " + nationality + "]";
  }
}