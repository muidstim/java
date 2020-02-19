import java.util.Scanner;

public class Factorial{

  public static void main(String[] args){
    System.out.format("Enter the number: ");

    Scanner s = new Scanner(System.in);
    int number = s.nextInt();

    long fact = 1;
    int i = 1;

    while(i <= number)
    {
        System.out.format("fact = %d * %d\n", fact, i);
        fact = fact * i;
        i++;
    }
    System.out.format("Factorial of %d is %d", number, fact);
  }
}
