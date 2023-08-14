package challengeCh4;

public class Dice {
//  public int roll(){
//    return (int)(Math.random() * 6) + 1;
//  }

  public int roll(){
    return (int)Math.ceil((Math.random() * 6));
  }
}
