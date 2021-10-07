import java.util.Scanner;
public class ContinuousSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, temp;
        do {
            System.out.print("Enter a number (Press 0 to quit): ");
            temp = in.nextInt();
            sum += temp;
        }while(temp != 0);
        System.out.println("Total sum: "+sum);

    }
}