public class Fibo {
    public static void main(String[] args) {
        //int ans = fibo(5);
        System.out.println(fibo(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}