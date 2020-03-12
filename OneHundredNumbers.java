import java.util.Scanner;

public class OneHundredNumbers{



  public static void main(String[] args){
    int sum = 0;
    Scanner s = new Scanner(System.in);

    for (int i = 1; i <= 5; i++){
        System.out.print("Enter number:");
        sum = sum + s.nextInt();
        System.out.println();

    }

    System.out.format("The sum of all numbers is %d, ");


  }

}
