import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection1 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //HashMap
        /*
        HashSet<Integer> app = new HashSet<Integer>();
           for (int i = 0; i < nums1.length; i ++) {
               app.add(nums1[i]);
           }
           HashSet<Integer> res = new HashSet<Integer>();
           for (int i = 0; i < nums2.length; i ++) {
               if (app.contains(nums2[i])) {
                   res.add(nums2[i]);
               }
           }
           int[] result = new int[res.size()];
           int i = 0;
           for (Integer j:res) {
               result[i++] = j;
           }
           return result;
        */
        
        //Binary Search
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }
    
    public static boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersection(nums1,nums2);
        for(int op:ans)
            System.out.print(op+" ");
    }
}
