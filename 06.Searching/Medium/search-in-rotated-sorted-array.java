class Solution {
    public int search(int[] nums, int target) {
        
       int start = 0, end = nums.length-1, mid;

        while (start <= end) {
            mid = (start+end)/2;
            if (target == nums[mid])
                return mid;

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else {
                if (target > nums[mid] && target <= nums[end]) 
                        start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
        
    }
}