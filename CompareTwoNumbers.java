import java.util.Scanner;

public class CompareTwoNumbers{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Input first number:");
    int a = s.nextInt();

    System.out.println("Input second number");
    int b = s.nextInt();

    if (a == b){
      System.out.format("%d == %d\n", a, b);
    } else {
      System.out.format("%d != %d\n", a, b);
    }

    if (a < b){
      System.out.format("%d < %d\n", a, b);
    } else {
      System.out.format("%d >= %d\n", a, b);
    }

    if (a <= b){
      System.out.format("%d <= %d\n", a, b);
    } else {
      System.out.format("%d > %d\n", a, b);
    }
  }

}
