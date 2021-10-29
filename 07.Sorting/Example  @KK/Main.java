import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }

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