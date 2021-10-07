import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and height of triangle: ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
        in.close();
    }
}
