public class UniquePaths {

    public static int uniquePaths(int r, int c) {
       /*Recursion*/ 
        // if(r == 1 || c == 1){
        //     return 1;
        // } 
        
//         int left = uniquePaths(r-1, c);
//         int right = uniquePaths(r,c-1);
//         return left+right;
        
//         return uniquePaths(r-1,c)+uniquePaths(r,c-1);
        
        /*Dynamic Programmin*/
        int[][] dp = new int[r][c];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] += dp[i-1][j]+dp[i][j-1];
                }
            }

        }
        return dp[r-1][c-1];
        
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
}
