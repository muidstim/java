public class FiveFactorial{

  public static void main(String[] args){
    int i = 1; // first
    long fact = 1;
    while (i <= 22 ){ // how many?
      System.out.format("fact = %d * %d = ", i, fact);
      fact = i * fact;
      System.out.format("%d\n", fact);

      i = i + 1; // increase by 1
    }

    System.out.format("5! is %d", fact);



  }
}
