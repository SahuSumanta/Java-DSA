class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //linear search
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] >= target) return i;
        }
        return n;


        //Binary Search
                // int l = 0 , r = nums.length - 1 , mid , ans = 0;
                // while(l <= r)
                // {
                //     mid = l + (r - l) / 2;
                //     if(nums[mid] == target)
                //         return mid;
                //     if(nums[mid] < target)
                //     {
                //         l = mid + 1;
                //         ans = mid + 1;
                //     }
                //     else
                //     {
                //         ans = mid;
                //         r = mid - 1;
                //     }
                // }
                // return ans;


    }
}