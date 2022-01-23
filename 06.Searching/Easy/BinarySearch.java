public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println("The target eliment present in the index -->"+search(arr, target));
    }

    // do simple binary search
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;

            if(nums[mid] == target) return mid;
            
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}