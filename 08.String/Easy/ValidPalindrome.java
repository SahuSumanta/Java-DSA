
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = result.length()-1;
        while(start < end){
            if(result.charAt(start) != result.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalindrome(s));
    }
}
