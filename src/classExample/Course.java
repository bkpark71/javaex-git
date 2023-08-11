package classExample;

public class Course {
  private String id;
  private String name;
  private Integer numOfStudents;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getNumOfStudents() {
    return numOfStudents;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student){
    numOfStudents += student;
  }

  public void deleteStudent(int student){
    numOfStudents -= student;
  }
}
