package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//    Student s = (Student) new Person();
//    s.whoAmI();
//    s.work();
    Student s = new Student();
    Person p = new Person();

    System.out.println("s instanceof Student ==> " + (s instanceof Student));
    System.out.println("s instanceof Person ==> " + (s instanceof Person));
    System.out.println("p instanceof Student ==> " + (p instanceof Student));
    System.out.println("p intanceof Object ==> " + (p instanceof Object));
    //System.out.println("s instanceof String" + (s instanceof String));

    downcast(p);
    downcast(s);
  }

  static void downcast(Person p) {
    p.whoAmI();
    if(p instanceof Student) {
      Student s = (Student) p;
      s.work();
      s.whoAmI();
    }
  }
//  static void downcast(Student s) {
//
//  }
//
//  static void downcast(Worker w) {
//
//  }

}
