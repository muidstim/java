import java.util.Scanner;

public class Yes{



  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Enter:");
    //int num = s.nextInt();

    for(int i = s.nextInt(); i >= 0; i--){
      System.out.format("\n%d", i);
    }
  }

}
