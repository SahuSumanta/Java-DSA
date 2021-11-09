import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        //bubble(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    //selection sort
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i -1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    private static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    //Bubble sort
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    int  temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }


    }
}