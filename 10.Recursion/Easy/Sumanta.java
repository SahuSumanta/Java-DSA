public class Sumanta {
    
    static int max(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }

        return Math.max(arr[n-1], max(arr, n-1));
    }

    static int min(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], min(arr, n-1));
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        int n = arr.length-1;
        System.out.println("Max eliment "+max(arr, n));
        System.out.println("Min eliment "+min(arr,n));
    }
}
