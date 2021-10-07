class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = candies.length;
        ArrayList <Boolean> extra = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                extra.add(true);
            }else{
                extra.add(false);
            }
        }
        
        return extra;
        
    }
}