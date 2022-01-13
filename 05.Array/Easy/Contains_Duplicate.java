import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
        
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i))
                return true;
        }
        return false;
    }
}
