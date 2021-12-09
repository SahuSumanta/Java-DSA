public class OnetoN {

    static void printNos(int n){
        if(n == 0){
            return;
        }
        printNos(n-1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
       int n = 10;
       printNos(n);
    }
}
