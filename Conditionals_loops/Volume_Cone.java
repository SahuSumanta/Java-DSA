import java.util.Scanner;

public class Volume_Cone {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = sc.nextDouble();
        double volume = (radius * radius * height) / 3;
        System.out.println("The volume of the cone is: " + volume);
        sc.close();
    }
}
