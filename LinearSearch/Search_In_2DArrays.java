import java.util.Arrays;

public class Search_In_2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                    {4,3,1},
                    {9,3,2},
                    {5,7,2}
        };

        int target = 9;
        int[] ans = linersearch(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

    }

    static int[] linersearch(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
}
}
