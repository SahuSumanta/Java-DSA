import java.util.*;
public class Area_EquilateralTriangle {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = input.nextDouble();
        double area = (Math.sqrt(3)/4)*side*side;
        System.out.println("The area of the equilateral triangle is " + area);
        input.close();
    }
}