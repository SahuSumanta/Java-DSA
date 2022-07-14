public class Nto1 {

    static void printRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printRev(n);
    }
}
