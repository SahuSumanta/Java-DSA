public class MissingPossitive {
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int check = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[check]){
                swap(arr, i, check);
            }else{
                i++;
            }
        }

        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
     }
}
