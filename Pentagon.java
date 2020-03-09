import java.util.Scanner;

public class Pentagon{

  public static double areaOfPentagon(double side, double apothem){
  
    return 0.5 * 5 * side * apothem;
  }
  
  public static double volumeOfPentagonPrism(double area, double height){
    return area * height;
  }
  

  public static void main(String[] args){
    System.out.println("Enter the side length and the apothem: ");

    Scanner s = new Scanner(System.in);
    
    double area = areaOfPentagon(s.nextDouble(), s.nextDouble());
    
    System.out.format("The area of the regular pentagon is %f cm^2\n", area);

    System.out.println("Enter the height of the pentagon prism: ");

    double volume = volumeOfPentagonPrism(area, s.nextDouble());

    System.out.format("The volume of the regular pentagon prism is %f cm^3\n", volume);

  }
}
