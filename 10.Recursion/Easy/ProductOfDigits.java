public class ProductOfDigits {

    static int product(int N){
        if (N%10 == N) {
            return N;
        }
        return (N%10)*product(N/10);
    }
    public static void main(String[] args) {
        System.out.println(product(0));
    }
}
