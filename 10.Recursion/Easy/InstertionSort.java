import java.util.Arrays;

public class InstertionSort {
    
    static void iSort(int[] a, int n){
        if (n <= 1){
            return;
        }

        //sort the n-1 elemrnts
        iSort(a, n-1);
        int last = a[n-1];// Insert last element at its correct position // in sorted array.
        int i = n-2;  

        while (i >= 0 && a[i] > last) {
            a[i+1] = a[i];
            i--;
        }
        a[i+1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {9,21,95,32,6,85,4};
        int length = arr.length;
        iSort(arr, length);
        System.out.println(Arrays.toString(arr));
    }
}
