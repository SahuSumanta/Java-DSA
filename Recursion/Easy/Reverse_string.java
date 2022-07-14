public class Reverse_string {
    public static Object reverseString(char[] s) {
        return helper(s, 0, s.length-1);
    }

    public static Object helper(char[] s, int i, int j) {
        if (i > j) {
            return j;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        
        return helper(s, i+1, j-1);
    }

}
