package challengeCh05;

public enum Grade {
  A("Excellent"),B("Good"),C("SoSo");
  //필드
  private String grade;
  //생성자
  private Grade(){}
  private Grade(String grade){
    this.grade = grade;
  }
  //메서드
  public String getGrade(){
    return grade;
  }
}
