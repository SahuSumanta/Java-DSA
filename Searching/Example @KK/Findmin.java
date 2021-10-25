public class Findmin {
    public static void main(String[] args) {
        int[] arr = {15,23,6,98,24,32};

        System.out.println(min(arr));
    }

    private static Object min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] < min){

                min = arr[i];
            }

        }
        return min;
    }
}
