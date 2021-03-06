import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        bubblesort(arr);
        selection(arr);
        instertion(arr);
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    //Cyclic Sort
    static void cyclicsort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int check = arr[i]-1;
            if(arr[i] != arr[check]){
                swap(arr, i, check);
            }else{
                i++;
            }
        }
        
    }

    //insertion sort
    static void instertion(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
               
            }
        }
    }

    //selection sort
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i -1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
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
    static void bubblesort(int[] arr){
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

    private static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}