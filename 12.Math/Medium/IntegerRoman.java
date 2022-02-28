

public class IntegerRoman {
    /*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
    */
    
    public static String intToRoman(int num) {
        if(num < 1 || num > 3999) return "0 ";
        String ans = "";

        while(num >= 1000){
            ans += "M";
            num -= 1000;
        }

        while(num >= 900){
            ans += "CM";
            num -= 900;
        }

        while(num >= 500){
            ans += "D";
            num -= 500;
        }

        while(num >= 400){
            ans += "CD";
            num -= 400;
        }

        while(num >= 100){
            ans += "C";
            num -= 100;
        }

        while(num >= 90){
            ans += "XC";
            num -= 90;
        }

        while(num >= 50){
            ans += "L";
            num -= 50;
        }

        while(num >= 40){
            ans += "XL";
            num -= 40;
        }

        while(num >= 10){
            ans += "X";
            num -= 10;
        }

        while(num >= 9){
            ans += "IX";
            num -= 9;
        }

        while(num >= 5){
            ans += "V";
            num -= 5;
        }

        while(num >= 4){
            ans += "IV";
            num -= 4;
        }

        while(num >= 1){
            ans += "I";
            num -= 1;
        }

        return ans;

   }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
