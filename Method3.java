import java.util.Scanner;

public class Method3{

  public static int doubleIt(int number){
    int doubled = number * 2;

    return doubled;
  }



  public static void main(String[] args){
    System.out.println(doubleIt(11));

    int myNumber = doubleIt(22);
    System.out.println(myNumber);
  }

}
