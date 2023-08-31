package _2000_2999._2400_2499;

import java.util.Arrays;

// 2441. Largest Positive Integer That Exists With Its Negative
public class _2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (nums[j] > 0 && nums[i] < 0) {
            if (nums[i] == -nums[j]) {
                return nums[j];
            }

            if (-nums[j] < nums[i]) {
                j--;
            }
            if (-nums[j] > nums[i]) {
                i++;
            }
            if (i >= nums.length || j < 0) {
                break;
            }
        }

        return -1;
    }

    public void solution() {
        System.out.println(findMaxK(new int[] {-1,2,-2,3}));
    }
}
