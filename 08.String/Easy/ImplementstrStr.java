/**
 * Implement strStr()
 */
public class ImplementstrStr {

        public static int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "aab";
        System.out.println(strStr(haystack, needle));
    }
    
}