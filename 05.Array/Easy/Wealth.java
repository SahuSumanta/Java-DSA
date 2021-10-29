class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0; 
            for(int account = 0; account < accounts[person].length; account++){
                sum =  sum + accounts[person][account];
            }
                if(sum > max)
                    max = sum;
        }
        return max;
        
    }
}