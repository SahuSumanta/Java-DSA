import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        

        System.out.println("Factorial of " +n+" is " +factorial);

    }
    
}
