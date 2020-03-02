import java.util.Scanner;

public class ArrayStart{

  public static void main (String[] args){
/*
    String[] cars = {"Honda", "BMW", "Toyota", "Ford"};

    System.out.format("The first item in the list is: %s\n", cars[0]);

    System.out.format("The second item in the list is: %s\n", cars[1]);

    //String[] cars = {"Honda", "BMW", "Toyota", "Ford"};
    int size = cars.length - 1;
    System.out.format("The size of the array is: %d\n", size);

    System.out.format("The last item in the list is: %s\n", cars[size]);


    String names[] = {"Bacon", "Coke"};
    int i = 0;
    for(String name : names){
      System.out.format("names[%d] = %s\n", i++, name);
    }*/

    int[] numbers = new int[3];
    numbers[0] = 5;
    numbers[1] = 10;
    numbers[2] = 15;

    int i = 0;

    for(int number : numbers){
      System.out.format("numbers[%d] = %d\n", i++, number);
    }
  }

}
