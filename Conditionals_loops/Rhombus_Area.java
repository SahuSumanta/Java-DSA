import java.util.Scanner;

public class Rhombus_Area {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the height of Rhombus: ");
        float height= in.nextFloat();
        System.out.println("enter the width of Rhombus: ");
        Float width= in.nextFloat();
        System.out.println("ans is: " + ((height*width)/2));
        in.close();
    }
}
