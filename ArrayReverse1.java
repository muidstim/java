import java.util.Scanner;

public class AreaOfCircle{

  public static void main (String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Radius: ");

    int r = s.nextFloat();

    float pi = 3.1415f;

    System.out.format("Perimeter = %f", 2 * pi * r);

    System.out.format("Area = %f", pi * r * r);

  }

}
