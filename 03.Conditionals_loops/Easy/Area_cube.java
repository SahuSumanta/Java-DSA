import java.util.Scanner;

public class Area_cube {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        double side = in.nextDouble();
        double curvedSurfaceArea = 4*side*side;
        System.out.println("The curved surface area of the cube is " + curvedSurfaceArea);
        in.close();
    }
}
