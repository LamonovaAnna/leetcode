package _2000_2999._2300_2399;

import java.util.HashSet;
import java.util.Set;

// 2357. Make Array Zero by Subtracting Equal Amounts
public class _2357_MakeArrayZeroBySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        if (nums.length == 1 && nums[0] != 0) {
            return 1;
        } else if (nums.length == 1) {
            return 0;
        }

        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (num != 0) {
                unique.add(num);
            }
        }
        return unique.size();
    }

    public void solution() {
        System.out.println(minimumOperations(new int[]{1, 2, 3, 5}));
        System.out.println(minimumOperations(new int[]{1, 5, 0, 3, 5}));
        System.out.println(minimumOperations(new int[]{0}));
    }
}
