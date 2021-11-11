
class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int sum = 0;
        int hi_altitude = 0;
        
        for(int i = 0; i < n; i++){
            sum = sum+gain[i];
            if(sum > hi_altitude){
                hi_altitude = sum;
            }
        }
        return hi_altitude;
    }
}