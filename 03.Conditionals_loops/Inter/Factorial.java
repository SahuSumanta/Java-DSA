import java.util.Scanner;
import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException{
        
        System.out.println("Enter Number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
        
    }
    static int Factorial(int n){

        if(n <= 1){
            return 1;
        }else{
            return n *Factorial(n-1);
        }

    }
}
