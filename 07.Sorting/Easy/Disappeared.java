import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int check = arr[i]-1;
            if(arr[i] != arr[check]){
                swap(arr, i, check);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }


    static void swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}