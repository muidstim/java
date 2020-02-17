import java.util.Scanner;

public class LargestNumber{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.format("Input first number:");
    int a = s.nextInt();

    System.out.format("\nInput second number:");
    int b = s.nextInt();

    System.out.format("\nInput third number:");
    int c = s.nextInt();

    if (a < b){
      a = b;
    }

    if (a < c){
      a = c;
    }

    System.out.format("%d is the largest number", a);

  }

}
