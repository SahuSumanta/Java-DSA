public class Reverseword3 {
    public static  String reverseWords(String s) {
        //covert the string to array
        char[] ch = s.toCharArray();
        int i = 0;
        for(int j = 0; j < ch.length; j++){
            if(ch[j] == ' '){
                reverse(ch, i, j -1); //let's --> s'tel
                i = j+1;
            }
        }
        reverse(ch, i, ch.length-1);
        return new String(ch);
        
    }

    private static void reverse(char[] ch, int i, int j) {
        while(i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        // char[] ch = s.toCharArray();
        // for(int i = 0; i < ch.length; i++){
        //     System.out.println(ch[i]);
        // }
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
