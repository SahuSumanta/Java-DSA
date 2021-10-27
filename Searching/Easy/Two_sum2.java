
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0, r = numbers.length - 1;
        
        while (numbers[l] + numbers[r] != target){
            
            if(numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        
        return new int[] {l+1, r+1};
        
    }
}

//updated
