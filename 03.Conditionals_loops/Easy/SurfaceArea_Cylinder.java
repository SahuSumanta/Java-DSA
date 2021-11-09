import java.util.Scanner;

public class SurfaceArea_Cylinder {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        double area = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        System.out.println("The surface area of the cylinder is " + area);
        in.close();
    }
}
