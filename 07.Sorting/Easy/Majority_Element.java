class Solution {
        public int majorityElement(int[] nums) {
            
            //sorting
            
            int n = nums.length;
            Arrays.sort(nums);
            return nums[n/2];
            
        }
    }
