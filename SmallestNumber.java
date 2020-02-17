import java.util.Scanner;
public class SmallestNumber {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.format("Input first number:");
    int a = s.nextInt();
    System.out.format("\nInput second number:");
    int b = s.nextInt();
    System.out.format("\nInput third number:");
    int c = s.nextInt();

    int smallest;

    if (a < b && a < c) {
      smallest = a;
    } else if (b < a && b < c){
      smallest = b;
    } else {
      smallest = c;
    }

    System.out.format("%d is the smallest number", smallest);
  }
}
