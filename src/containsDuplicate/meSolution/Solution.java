package containsDuplicate.meSolution;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,7,8,8};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(array));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
