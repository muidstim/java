import java.util.Scanner;

public class ArrayContains{

  public static void main (String[] args){

    int[] numbers = {1,2,3,4,5};

    Scanner s = new Scanner(System.in);
    System.out.print("Guess a number: ");
    int guess = s.nextInt();

    boolean found = false;

    for(int i : numbers){
      if (i == guess){
        found = true;
      }
    }

    System.out.println(found);
  }

}
