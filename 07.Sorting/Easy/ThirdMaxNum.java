import java.util.Arrays;

public class ThirdMaxNum {
        public static  int thirdMax(int[] nums){
            int first=nums[0],second=Integer.MIN_VALUE,third=Integer. MIN_VALUE,n=nums.length,count=0;
            Arrays.sort(nums);
            if(n<3)
                {
                if(n==1)
                    {
                  return nums[0];  
                }
                else
                {
                  return Math.max(nums[0],nums[1]);  
                    }
            }
           for(int i=1;i<n;i++)
               {
               if(first<nums[i])
                   {
                   first=nums[i];
        
              }
        
           }
            for(int i=0;i<n;i++)
                {
                if(first>nums[i]&&nums[i]>second)
                    {
                    second=nums[i];
                }
            }
            for(int i=0;i<n;i++)
                {
                if(second>nums[i]&&nums[i]>=third)
                {
                  third=nums[i]; 
                    count++;
        
                }
        
        
            }
            if(third==Integer.MIN_VALUE)
               {
        
                  if(count!=0)
                      {
                      return third;
                  }
        
        
        
                third=first;
        
        
               }
            return third;
        }
    
        public static void main(String[] args) {
            int[] arr = {};
            System.out.println(thirdMax(arr));
        }



}
