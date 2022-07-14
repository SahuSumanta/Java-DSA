public class SortedArray {
    
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr =  {7,2,3,4,5};
        System.out.println(sorted(arr, 0));
    }
}
