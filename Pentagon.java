import java.util.Scanner;

public class Pentagon{

  public static double areaOfPentagon(double side, double apothem){
  
    return 0.5 * 5 * side * apothem;
  }
  
  public static double volumeOfPentagonPrism(double side, double apothem, double height){
    return areaOfPentagon(side, apothem) * height;
  }

  public static void main(String[] args){
    System.out.println("Enter the side length and the apothem: ");

    Scanner s = new Scanner(System.in);

    double side = s.nextDouble();
    double apothem = s.nextDouble();
    
    double area = areaOfPentagon(side, apothem);
    
    System.out.format("The area of the regular pentagon is %f cm^2\n", area);

    System.out.println("Enter the height of the pentagon prism: ");
    double height = s.nextDouble();

    double volume = volumeOfPentagonPrism(side, apothem, height);

    System.out.format("The volume of the regular pentagon prism is %f cm^3\n", volume);

  }
}
