package _2000_2999._2300_2399;

import java.util.HashSet;
import java.util.Set;

// 2395. Find Subarrays With Equal Sum
public class _2395_FindSubarraysWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        Set<Integer> sums = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (sums.contains(sum)) {
                return true;
            }
            sums.add(sum);
        }

        return false;
    }

    public void solution() {
        System.out.println(findSubarrays(new int[] {4,2,4}));
    }
}
