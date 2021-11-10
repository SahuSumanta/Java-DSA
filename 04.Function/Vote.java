import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(check(age));
    }
    static String check(int age){
        if(age >= 18) return "Eligible for Vote";
        else return "Not Eligible for vote";
            
        
    }
}
