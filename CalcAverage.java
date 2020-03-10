import java.util.Scanner;

public class CalcAverage{

  public static double calculateAverage(double num1, double num2, double num3){
    double total = num1 + num2 + num3;

    return total / 3;
  }



  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.println("Enter 3 numbers to average:");

    double avg = calculateAverage(s.nextDouble(), s.nextDouble(), s.nextDouble());

    System.out.format("The average is %f", avg);
  }

}
