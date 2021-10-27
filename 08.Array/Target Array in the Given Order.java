class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)  // here we traverse from right to left
            
            list.add(index[i], nums[i]);    
        
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            
            target[i] = list.get(i);
        
        return target;
            
        
    }
}