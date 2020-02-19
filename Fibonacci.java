import java.util.Scanner;

public class Fibonacci{


  public static void main(String[] args){
    int num1 = 0;
    int num2 = 1;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the fibonacci number: ");

    int count = s.nextInt();

    int i = 1;
    while(i <= count)
    {
        System.out.format("%d ", num1);
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
        i++;
    }
  }
}
