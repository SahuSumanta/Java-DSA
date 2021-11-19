class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int check = arr[i]-1;
            if(arr[i] != arr[check]){
                swap(arr, i, check);
            }else{
                i++;
            }
        }
        //search missing number
        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return new int[] {arr[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}