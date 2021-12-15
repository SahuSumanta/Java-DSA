import java.util.ArrayList;
 

public class Findeliment {
    
    //Method-1
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
    //Method - 2
    //find all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    //Method-3
    //Here arraylist is used as a argument inside the dunction findall index
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    //Method-4
    //return true or false
    static boolean search(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }

        return arr[index]==target || search(arr,target,index+1);
        
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int target = 4;
        System.out.println(findindex(arr, target, 0)); // find index
        System.out.println(search(arr, target, 0)); // return true or false
        
        //find multiple index
        findAllIndex(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findAllIndex(arr, target, 0, list);
        System.out.println(ans);
    }
}
