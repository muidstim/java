public class JavaArray{


  public static void main(String[] args){

    String name = "Bacon Zero";

    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }

    for (char c : name.toCharArray()){
      System.out.println(c);
    }
  }
}
