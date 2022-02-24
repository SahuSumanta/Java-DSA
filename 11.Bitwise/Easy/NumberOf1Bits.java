
public class NumberOf1Bits{

        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {

            // int ones = 0;
            // while (n != 0) {
            // ones = ones + (n & 1);
            // n = n>>>1;
            //}
            // return ones;
                    
                    return Integer.bitCount(n);
        }
}




public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
//         int ones = 0;
//         while (n != 0) {
//             ones = ones + (n & 1);
//             n = n>>>1;
//         }
//         return ones;
        
        return Integer.bitCount(n);
    }
}


/*This problem is actually asking the implementation of Integer.bitCount()
Which we solved in the problem Hamming Distance
The only difference is that we use >>> in this problem rather than >>
Because the given integer is unsigned so we need to use unsigned shift >>>
This avoid the infinite calculation*/