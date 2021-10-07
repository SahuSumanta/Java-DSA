// 10. Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class ContiniousLargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE, temp = Integer.MIN_VALUE;
        do {
            if (max < temp) {
                max = temp;
            }
            System.out.print("Enter a number (Press 0 to quit): ");
            temp = in.nextInt();
        }while(temp != 0);
        System.out.println("Largest of all: "+max);

    }
}