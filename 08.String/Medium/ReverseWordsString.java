public class ReverseWordsString {
	
        public static String reverseWords(String s) {
             String[] words = s.split("\\s+");
             String ans = "";
             for(int i = words.length -1 ; i >= 0; i--) {
                 ans += words[i]+" ";
             }
             return ans.trim();
            }
        
        public static void main(String[] args) {
            String  s = "the sky is blue";
            System.out.println(reverseWords(s));
        }
        
            
}
