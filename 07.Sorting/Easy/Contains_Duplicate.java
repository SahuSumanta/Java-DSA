class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums.length <= 1) return false;
        
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
        
    }
}