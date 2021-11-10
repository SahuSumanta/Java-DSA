
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int Num = in.nextInt();
       System.out.println(evenodd(Num));
    }
    
    static String evenodd(int n){

        if(n % 2 == 0) return "Even";
        return "odd";
    }
}
