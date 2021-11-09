public class HcfLcm {
    public static void main(String[] args) {

        int num1 = 15,num2 = 12,numenetar,denumenetor,hcf,lcm,remender;
        
        if(num1 > num2){
            numenetar = num1;
            denumenetor = num2;
        }else{
            numenetar = num2;
            denumenetor = num1;
        }
        remender = numenetar%denumenetor;

        while(remender != 0){
            
                    numenetar = denumenetor;
                    denumenetor = remender;
                    remender = numenetar % denumenetor;

        }
                
                hcf = denumenetor;
                lcm = (num1*num2) / hcf;
                
                System.out.println("HCF  of " +num1+ " and " +num2+ " is " +hcf);
                System.out.println("LCM of " +num1+ " and " +num2+ " is " +lcm);

    }
}
