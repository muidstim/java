
import java.util.Scanner;
public class PositiveNegative{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Input number:");
    int num = s.nextInt();

    if (num < 0) {
      System.out.format("%d is negative\n", num);
    } else if (num > 0){
      System.out.format("%d is positive\n", num);
    } else {
      System.out.format("0 is neither positive nor negative\n");
    }


  }



}
