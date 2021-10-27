import java.util.Scanner;

public class Search_In_Range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array");
        for(int i = 0; i  < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target");
        int targrt = sc.nextInt();
        
        int ans = linearSearch(arr, targrt, 1, 5);
        System.out.println(ans);
    }

    //method
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0)
            return -1;


        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;

        
    }
    
}
