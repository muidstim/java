public class Cars{

  public static void main(String[] args){

    String[] cars = {"Honda", "Toyota", "Mazda", "BMW"};
    int i = 0; // start at 0!!!

    while (i < cars.length ){
      System.out.println(cars[i]);
      i++;
    }

    System.out.println();
    System.out.println();


    for (int j = 0; j < cars.length; j++){
      System.out.println(cars[j]);
    }

  }

}
