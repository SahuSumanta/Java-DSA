import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms in the fibbonaci series :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){ 
            int temp = a;
            a = b;
            b = temp + b;
            System.out.print(b + " ");
        }
        in.close();   
    }
}
