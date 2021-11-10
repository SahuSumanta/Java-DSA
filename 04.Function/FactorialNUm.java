import java.util.Scanner;

public class FactorialNUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int num) {
        int start = 1;
        if(num < 0) return 1;
        for (int i = 2; i <= num; i++) {
            start *= i;
        }
        return start;
    }
}
