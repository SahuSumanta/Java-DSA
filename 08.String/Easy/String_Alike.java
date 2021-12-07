import java.util.Set;

public class String_Alike {

    // public static boolean halvesAreAlike(String s) {
    //     char[] ch = s.toCharArray();
    //     int a = 0, b = ch.length-1;
    //     int a_count = 0, b_count = 0;

    //     Set vowels = Set.of('a','e','i','o','u','A','E','I','O','U');

    //     while(a < b){
    //         a_count += vowels.contains(ch[a])? 1:0;
    //         b_count += vowels.contains(ch[b])?1:0;
    //         a++;
    //         b--;
            
    //     }
    //     return a == b;
    // }

    public static boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2, s.length());

        String vowel = "aeiouAEIOU";
        int a_count = 0, b_count = 0;

        for (int i = 0; i < a.length(); i++) {

            if(vowel.indexOf(a.charAt(i)) >= 0) a_count++;
            if(vowel.indexOf(b.charAt(i)) >= 0) b_count++;
            
        }

        return a_count==b_count;
    }

    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
