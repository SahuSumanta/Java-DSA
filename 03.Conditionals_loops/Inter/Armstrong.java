public class Armstrong {
    public static void main(String[] args) {

        int num = 271;
        System.out.println("The number is armstrong " +Armstrong(num));

        // int original_num = num; int result = 0;

        // while(original_num != 0){
        //     int rem = original_num%10;
        //     result = (int) (result+Math.pow(rem, 3));
        //     original_num /= 10;
        // }

        // if(num == result){
        //     System.out.println("The number is armstrong");
        // }else{
        //     System.out.println("Not an Armstrong");
        // }
        
        
    }

    static boolean Armstrong(int num){

        
        int originalNumber,result = 0;
        originalNumber = num;

        while(originalNumber != 0){
            int rem = originalNumber%10;
            result = (int) (result+Math.pow(rem, 3));
            originalNumber /= 10;
        }

        if(num == result){
            return true;
        }else{
            return false;
        }
        

    }

}
