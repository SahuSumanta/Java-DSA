import java.util.Arrays;

public class Bubblesort {
    
    static void sort(int[] arr, int n){ //bubble Sort

        //base condition
        if(n == 0){  // if array length is zero return nothing
            return;
        }

        for(int i = 0; i < n-1; i++){ // looop for traverse the array
            if(arr[i] > arr[i+1]){ //if 5 > 4 swap
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        sort(arr,n-1); // function call
        
    }

    public static void main(String[] args) {
        
        int[] arr = {3,1,5,4,2};
        int length = arr.length;
        sort(arr, length);

        System.out.println(Arrays.toString(arr));
    }
}
