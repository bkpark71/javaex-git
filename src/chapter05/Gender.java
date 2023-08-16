package chapter05;

public enum Gender {
  MALE("남성"), FEMALE("여성");
  private String gender;
  private Gender(){}
  private Gender(String gender){
    this.gender = gender;
  }
  public String getGender(){
    return gender;
  }
}
