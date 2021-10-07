import java.util.*;
public class Area_isosceles_triangle {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of same sided: ");
        double side = input.nextDouble();
        System.out.println("Enter the length of base: ");
        double base = input.nextDouble();
        double area = (base/4)*Math.sqrt((4*side*side)-(base*base));
        System.out.println("The area of Isosceles Triangle is: " + area);
        input.close();
    }
}