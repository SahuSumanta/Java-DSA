class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[nums.length];
        int count = 0;
        for(int  i = 0; i < nums.length/2; i++){
            
            arr[count++] = nums[i];
            arr[count++] = nums[n+i];
        }
        
        return arr;
        
    }
}

