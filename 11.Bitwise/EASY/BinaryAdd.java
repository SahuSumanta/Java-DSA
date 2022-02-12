
public class BinaryAdd {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; //i is the pointer of  a String
        int j = b.length() - 1;

        int carry = 0;
        while( i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i) - '0';// to get the value like 1 - 0 = 1 & 0 - 0 = 0
            if(j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum%2);
            carry = sum / 2;

            i--;
            j--;

        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String ans = addBinary(a, b);
        System.out.println(ans);
    }
}
