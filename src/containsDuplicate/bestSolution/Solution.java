package containsDuplicate.bestSolution;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 8};
        containsDuplicate.meSolution.Solution solution = new containsDuplicate.meSolution.Solution();
        System.out.println(solution.containsDuplicate(array));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer : set) {
            if (set.contains(integer)) {
                return true;
            }
            set.add(integer);
        }
        return false;
    }
}
