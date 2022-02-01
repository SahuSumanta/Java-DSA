import java.util.*;

public class NextGreaterElement3 {

    public static int nextGreaterElement(int n) {
        char[] arr =( n + "").toCharArray();
        
        //find first deep
        int i = arr.length-2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i == -1){
            return -1;
        }

        //find just greater than the ith index eliment
        int j = arr.length-1;
        while(arr[i] >= arr[j]){
            j--;
        }

        //swap i and j
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i+1, arr.length);          
    
    
    //Result Concat in String
    String res = new String(arr);
    

    // To long
    long sol = Long.parseLong(res);
    
    
    if(sol <= Integer.MAX_VALUE)
        return (int) sol;

    return -1;
    }

    public static void main(String[] args) {
        int ans = nextGreaterElement(12);
        System.out.println(ans);
    }
}
