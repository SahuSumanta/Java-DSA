class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; ++j){
                if(nums[j] != nums[i]  && nums[j] < nums[i]){
                    ans[i]++;
                }
            }
        }
        
        return ans;
    }
}