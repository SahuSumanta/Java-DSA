import java.util.Arrays;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                ++i;++j;
            }
        }
        
        int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=nums1[i];
        }
        return ans;    
    }
    
  public static void main(String args[])
    {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersect(nums1,nums2);
        for(int op:ans)
            System.out.print(op+" ");
    }
}


/*abstractApproach 2 (Using Two Pointers)
If the elements of both the array is sorted then this approach is more efficient. For this problem as it is not sorted we sort both the arrays first.
Now we will use two pointers i and j for the two arrays and initialize both with zero.
Move index i along 1st array(nums1) and index j along 2nd array(nums2)

Compare the two elements pointed by i and j.
If nums1[i] is less than nums2[j] then we know that we have to leave the smaller element and go to next(greater) element in nums1 array so as to check for intersection of elements.
Else if nums1[i] is greater than nums2[j] then similarly we have to go to next(greater) element in nums2 array.
Else both the elements intersected, hence add this element to result array. And Increment both i and j.
*/