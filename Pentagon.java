import java.util.Scanner;

public class Pentagon{

  public static double areaOfPentagon(double side, double apothem){
  
    return 0.5 * 5 * side * apothem;
  }
  
  public static void main(String[] args){
    System.out.println("Enter the side length and the apothem: ");

    Scanner s = new Scanner(System.in);
    
    double area = areaOfPentagon(s.nextDouble(), s.nextDouble());
    
    System.out.format("The area of the regular pentagon is %f cm^2", area);
  }
}
