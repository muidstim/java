import java.util.Scanner;

public class StarNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter star number: ");
        int rows = s.nextInt();

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
