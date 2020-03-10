import java.util.Scanner;

public class StarBox{

  //this method draws a line of stars according to the size
  //with a border of 2 stars on each side
  public static void starLine(int size){
    System.out.print("**");
    for (int i = 0; i < size; i++){
      System.out.print("*");
    }
    System.out.print("**\n");
  }

  //this method draws a box of stars around any string
  public static void starBox(String text){
    starLine(text.length());

    System.out.format("* %s *\n", text);

    starLine(text.length());
  }

  public static void main(String[] args){
    System.out.println("Enter the title: ");

    Scanner s = new Scanner(System.in);

    starBox(s.nextLine());
  }
}
