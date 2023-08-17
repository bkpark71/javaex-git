package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//    Student s = (Student) new Person();
//    s.whoAmI();
//    s.work();
    Student s = new Student();
    Person p = new Person();
    Worker w = new Worker();

    System.out.println("s instanceof Student ==> " + (s instanceof Student));
    System.out.println("s instanceof Person ==> " + (s instanceof Person));
    System.out.println("p instanceof Student ==> " + (p instanceof Student));
    System.out.println("p intanceof Object ==> " + (p instanceof Object));
    //System.out.println("s instanceof String" + (s instanceof String));

    downcast(p);
    downcast(s);
    downcast(w);
    //downcast("hello");
    downcast(new Person());
  }

  static void downcast(Person p) {
    if(p instanceof Student) {
      Student s = (Student) p;
      s.work();
    } else if (p instanceof Worker){
      Worker w = (Worker) p;
      w.work();
    } else {
      p.whoAmI();
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
