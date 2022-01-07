import java.util.Arrays;
public class UniqueIntegersSum {
    
    public static int[] sumZero(int n) {
        int [] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 2*i+1-n;
        }
        return ans;
    }


    /*
    It forms of pattern like 
        -if the value of n is odd
        then middle eliment is 0;

        -if the value of n is even 
        then (n+1)/2 element is 1;
    formula == 2*i+1-n;
    */

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
