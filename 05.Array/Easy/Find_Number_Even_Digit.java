public class Find_Number_Even_Digit {

    static int numberOfDigits(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        return cnt;
    }
    static int findNumbers(int[] a)
    {
        int result = 0;
        for(int i = 0 ; i < a.length ; i++)
            if(numberOfDigits(a[i]) % 2 == 0)
                result++;
        return result;
    }
    

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
