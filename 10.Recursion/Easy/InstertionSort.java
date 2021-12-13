import java.util.Arrays;

public class InstertionSort {
    
    static void iSort(int[] a, int n){

        if (n == 0){
            return;
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[i] ){
                    int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                }
            }
        }

        iSort(a, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {9,7,6,15,17,5,10,11};
        int length = arr.length;
        iSort(arr, length-1);
        System.out.println(Arrays.toString(arr));
    }
}
