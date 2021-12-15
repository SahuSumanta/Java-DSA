public class Findeliment {
    

    //return index of the terget eliment
    static int findindex(int[] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findindex(arr,target,index+1);
        }

        
    }

    //return true or false
    static boolean search(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }

        return arr[index]==target || search(arr,target,index+1);
        
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,18,19};
        int target = 18;
        System.out.println(findindex(arr, target, 0));
        System.out.println(search(arr, target, 0));
    }
}
