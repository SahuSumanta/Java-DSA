
public class Factorial {
    static long factorial(int N){
        
        long fact = 1;
        for(int i=1;i<=N;i++){    
            fact=fact*i;    
        } 
        
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
