import java.util.*;
public class Area_Rhombus {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one diagonal of the rhombus: ");
        double d1 = input.nextDouble();
        System.out.println("Enter the length of the other diagonal of the rhombus: ");
        double d2 = input.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("The area of the rhombus is: " + area);
        input.close();
    }
}