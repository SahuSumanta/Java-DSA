public class SplitStringPalindrom {

    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    public static boolean check(String a, String b) {
        int i = 0;
        int j = a.length()-1;
        while (i < j) {
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);

    }

    public static boolean isPalindrome(String s, int i , int j ){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeFormation("ulacfd", "jizalu"));
    }
}
