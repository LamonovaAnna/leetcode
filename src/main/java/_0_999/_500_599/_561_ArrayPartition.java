package _0_999._500_599;

import java.util.Arrays;

// 561. Array Partition
public class _561_ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }

        return ans;
    }
}
