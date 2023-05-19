package _0_999._600_699;

import java.util.Arrays;

// 643. Maximum Average Subarray I
public class _643_MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (k == 1) {
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }

        double ans;

        double lastSum = 0;
        int lastStart = 0;
        int lastStop = 0;

        for (int i = 0; i < k && i < nums.length; i++) {
            lastSum += nums[i];
            lastStop = i;
        }

        ans = lastSum / k;
        lastStop++;

        while (lastStop < nums.length) {
            lastSum -= nums[lastStart];
            lastStart++;
            lastSum += nums[lastStop];
            lastStop++;
            if (lastSum / k > ans) {
                ans = lastSum / k;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
}
