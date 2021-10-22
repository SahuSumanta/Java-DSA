import java.util.Scanner;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int minR = 0;
        int minC = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;

        int tne = rows * column;
        int count = 0;

        while(count > 0){

        //top --> left to right;
        for (int i = minR, j = minC; j <= maxC && count > 0; j++){
            System.out.println(arr[i][j]);
            count--;
        }
        minR++;

        //right --> top to bottom
        for (int i = minR, j = maxC; i <= maxR && count > 0; i++){
            System.out.println(arr[i][j]);
            count--;
        }
        maxC--;

        //bottom --> right to left
        for (int i = maxR, j = maxC; j >= minC && count > 0; j--){
            System.out.println(arr[i][j]);
            count--;
        }
        maxC--;

        //left --> bottom to top
        for (int i = maxR, j = minC; j >= minR && count > 0; j--){
            System.out.println(arr[i][j]);
            count--;
        }
        minC++;

    }


    }
}