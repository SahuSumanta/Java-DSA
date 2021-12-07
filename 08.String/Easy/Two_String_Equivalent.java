import java.util.Arrays;

public class Two_String_Equivalent {

        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String result1 = "";
            String result2 = "";
            for (int i = 0; i < word1.length; i++) {
                result1 += word1[i];
            }
    
            for (int i = 0; i < word2.length; i++) {
                result2+= word2[i];
            }
            if(result1.equals(result2)) return true;
            
            
            return false;
        }

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}


/*You can also check with these inputs.given bellow
    Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    Output: true
    
    Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
    Output: false

    Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
    Output: true
*/