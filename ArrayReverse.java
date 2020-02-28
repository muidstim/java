import java.util.Scanner;

public class ArrayReverse{

  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    System.out.println("Enter 5 lines: ");

    String[] words = {s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine()};

    System.out.println("************");
    System.out.println("Reversing!!!");
    System.out.println("************");

    for (int i = words.length -1; i >= 0; i--){
      System.out.println(words[i]);
    }

  }

}
