public class Prime {
    public static void main(String[] args) {
        int num = 9;
        int ans = prime(num);
        System.out.print(ans);
    }

    public static int prime(int n){
        
        if(n <= 1){
            System.out.println("Not prime nor Composite");
        }

        int c = 2;
        while(c*c < n){
            if(n%2 == 0){
                System.out.println("Not Prime");
            }
            c += 1;
        }

        System.out.println("prime");
        return c;
    }
}
