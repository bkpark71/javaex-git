package chapter05;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.println(numbers);
    numbers.add(10);
    System.out.println(numbers);
    numbers.add(9);
    System.out.println(numbers);
    numbers.add(8);
    System.out.println(numbers);
    numbers.add(0,11);
    System.out.println(numbers);
    System.out.println(numbers.size());
    numbers.remove(1);
    System.out.println(numbers);
    System.out.println(numbers.get(2));
  }
}
