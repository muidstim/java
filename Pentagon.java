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

    System.out.format("Area is %f cm^2\n", areaOfPentagon(side, apothem));
    
    System.out.println("Enter the height of the pentagon prism: ");
    double height = s.nextDouble();

    System.out.format("Volume is %f cm^3\n", volumeOfPentagonPrism(side, apothem, height));
  }
}
