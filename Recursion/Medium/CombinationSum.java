package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * CombinationSum
 */

public class CombinationSum
{
	public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = combinationSum(arr, target);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    public static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> temp) {
        // base case
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp)); // its not a constant operation its a lineartime operation
            }
            return;
        }

        if (arr[index] <= target) {
            temp.add(arr[index]);
            // pick the eliment recursion call
            findCombination(index, arr, target - arr[index], ans, temp);
            temp.remove(temp.size() - 1); // after returning from recursion three just remove the the taken index
                                          // eliment.
        }
        // notpick the eliment recursion call
        findCombination(index + 1, arr, target, ans, temp);
    }
}