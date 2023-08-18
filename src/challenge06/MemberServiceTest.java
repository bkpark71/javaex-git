package challenge06;

public class MemberServiceTest {
  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    Member[] members = {
        new Member("홍길동", "hong", "12345", 20),
        new Member("김연아", "kim", "qwert", 20)
    };
    String id = "kim";
    boolean result = memberService.login(id, "qwert");
    if(result) {
      for (Member member : members) {
        if(member.id.equals(id)){
          System.out.println(member.findName(id) + "님 반갑습니다.");
        }
      }
      System.out.println("로그인 되었습니다.");
      memberService.logout(id);
    } else {
      System.out.println("id 혹은 password가 올바르지 않습니다.");
    }
    result = memberService.login("error", "12345");
    if(result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    } else {
      System.out.println("id 혹은 password가 올바르지 않습니다.");
    }
  }
}
