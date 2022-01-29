import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        System.out.println(multiply(str1, str2));
    }


    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        
        int l1 = num1.length();
        int l2 = num2.length();
        int[] result = new int[l1+l2];

        int i = l2-1;
        int pf = 0;  //power factor
        while(i >= 0){
            int ival = num2.charAt(i) - '0';
            i--;

            int j = l1-1;
            int k = result.length-1-pf;
            int carry = 0;

            while(j >= 0 || carry != 0){
                int jval = j>=0 ? num1.charAt(j) - '0' : 0;
                j--;

                int product = ival*jval+carry+result[k];

                result[k] = product%10;
                carry = product/10;
                k--;
            }

            pf++;
        }

        //managment of leading zero using general method
        String str = "";
        boolean flag = false;
        for (int val : result) {
            if(val == 0 && flag == false){
                //leading zero
                continue;
            }else{
                flag  = true;
                str += val;
            }
        }
        return str;
    }

    
}
