public class DecryptString {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                sb.append((char) (Integer.valueOf(s.substring(i, i + 2)) + 'a' - 1));
                i += 3;
            }
            else{
                sb.append((char) ((s.charAt(i) - '0') + 'a' - 1));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
}
