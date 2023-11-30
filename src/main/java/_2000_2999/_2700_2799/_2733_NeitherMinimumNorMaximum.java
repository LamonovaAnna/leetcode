package _2000_2999._2700_2799;

import java.util.Arrays;

// 2733. Neither Minimum nor Maximum
public class _2733_NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[0] && nums[i] < nums[nums.length - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
