import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P, T, R;
        System.out.println("Enter the following details");
        System.out.println("Principle amount: ");
        P = in.nextFloat();
        System.out.println("Time in years: ");
        T = in.nextFloat();
        System.out.println("Rate of Interest: ");
        R = in.nextFloat();
        System.out.println("Interest: " + (P*T*R) / 100);
    }
}