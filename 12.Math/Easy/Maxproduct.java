import java.util.Arrays;

public class Maxproduct {


    public static int maximumProduct(int[] nums) {
        //brute force
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;

        // //loop
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         for (int j2 = j+1; j2 < nums.length; j2++) {
        //             int product = nums[i]*nums[j]*nums[j2]; //here we get the product
        //             //but we need the maximum value from the array
        //             //compare max and product of each iteration
        //             max = Math.max(max, product);    
        //         }
        //     }  
        // }
        // return max;

        int n = nums.length; //length of the array
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);

        max = Math.max(max, nums[0]*nums[1]*nums[n-1]);
        max = Math.max(max, nums[n-1]*nums[n-2]*nums[n-3]);

        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }
}
