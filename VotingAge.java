

import java.util.*;
public class VotingAge {
  public static void main(String[] args) {
    int age;
    Scanner s = new Scanner(System.in);

    System.out.print("What is your age? ");
    age = s.nextInt();

    if(age >= 18){
      System.out.println("You are eligible to vote.");
    } else {
      System.out.println("You are not eligible to vote.");
    }
  }
}
