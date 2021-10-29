class Solution {
    
    public boolean checkPanagram(char ch, String sentence){
            for(char c : sentence.toCharArray()){
                if(c == ch){
                    return true;
                }
            }
            return false;
        }
    
    
    
    public boolean checkIfPangram(String sentence) {
        boolean ans = false;
        for(char ch = 'a'; ch <= 'z'; ch++){
            
            boolean panagram = checkPanagram(ch, sentence);
            if(panagram == false){
                
                ans = false;
                break;
                
            }else{
                
                ans = true;
            }
        }
        
        return ans;  
    }
    