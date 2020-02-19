public class FiveFactorialFor{

  public static void main(String[] args){

    long fact = 1;
    for (int i = 1; i <= 5; i++ ){ // how many?
      System.out.format("fact = %d * %d = ", i, fact);
      fact = i * fact;
      System.out.format("%d\n", fact);
    }

    System.out.format("5! is %d", fact);



  }
}
