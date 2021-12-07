public class Pattern{

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //when row is prineted we need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //when row is prineted we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            //when row is prineted we need to add a new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            //when row is prineted we need to add a new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            //for every row run the col
            int totalcolumninrow = row > n ? 2*n-row:row;
            for (int col = 1; col <= totalcolumninrow; col++) {
                System.out.print("*");
            }
            //when row is prineted we need to add a new line
            System.out.println();
        }
    }

    

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n-1; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n ; row++) {

            //count space
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            //loop for coloumn
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println(" ");
        }
    }



    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
    }
}
