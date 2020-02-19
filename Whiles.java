import java.util.Scanner;

public class Whiles{

  public static void question1(){//no output

    int i = 0;
    while (i < 0) {
      System.out.println("hi");
    }

  }
  public static void question2(){//forever

    int i = 0;
    while (--i < 0) {
      System.out.println("hi");
    }

  }
  public static void question3(){//no output

    int i = 0;
    while (i-- < 0) {
      System.out.println("hi");
    }

  }

  public static void fibonacci(){
    int num1 = 0, num2 = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the fibonacci number: ");
    int count = s.nextInt();

    int i = 1;
    while(i <= count)
    {
        System.out.print(num1+" ");
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
        i++;
    }
  }
  
  public static void main(String[] args){
    //question1();

    fibonacci();
  }
}
