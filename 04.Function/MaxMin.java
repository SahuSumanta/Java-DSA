
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter 3 number to check max min");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println(max(a, b, c));
        System.out.println(min(a, b, c));
    }
    
    static int max(int a, int b, int c){
        int max = a;
        if(max < b) max = b;
        else if (c > max) max = c;
        
        return max;
    }

    static int min(int a, int b, int c){
        int min = a;
        if(min > b) min = b;
        else if (c < min) min = c;
        
        return min;
    }
}
