
public class Palindrom {
    public static void main(String[] args) {
        int num = 153;
        int originalnum = num;
        int reminder, result = 0;

        while(num != 0){
            reminder = num % 10;
            result = result*10+reminder;
            num /= 10;
        }
        
        if(result == originalnum){
            System.out.println("palindrom number");
        }else{
            System.out.println("Not a Palindrom Number");
        }
        
    }
}
