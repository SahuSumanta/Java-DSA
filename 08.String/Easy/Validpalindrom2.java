public class Validpalindrom2 {
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i+1,j) || isPalindrome(s, i, j-1);
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    public static boolean isPalindrome(String s, int i , int j ){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}
