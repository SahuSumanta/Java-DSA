public class Missing_Number {

   
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != i) return i;
            }
            return nums.length;
        }

        

    
}
