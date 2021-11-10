import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("The Sum of two Number is " +sum(num1, num2));
    }
    
    static int sum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
