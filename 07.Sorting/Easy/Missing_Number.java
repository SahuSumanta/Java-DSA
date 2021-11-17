public class Missing_Number {

   
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != i) return i;
            }
            return nums.length;
        }

        //optimised one but not using sorting
        
        // public int missingNumber(int[] nums) {
        //     int sum=0;
        //     for(int i=0;i<=nums.length;i++)
        //         sum+=i;
    
        //     for(int i=0;i<nums.length;i++)
        //         sum-=nums[i];
    
        //     return sum;
        // }

    
}
