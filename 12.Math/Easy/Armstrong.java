
public class Armstrong {

    static String armstrongNumber(int n){
        // code here// code here
        int temp = n;
        int ans = 0;
        while(temp != 0 && temp > 0){
            int last = temp%10;
            ans += Math.pow(last, 3);
            temp /= 10;
        }

        if(n == ans){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }
}
