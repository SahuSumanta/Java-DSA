class Solution {
    public int arrangeCoins(int n) {
        
        long s = 1, e = n;
        
        while(s <= e){
            long mid = s + (e - s) / 2;
            long k = mid*(mid+1)/2;
            
            if(k == n) return (int) mid;
            else if(k < n) s =  mid + 1;
            else e =  mid -1;
        }
        return (int) e;
    }
}