package _2000_2999._2500_2599;

import java.util.Arrays;

// 2574. Left and Right Sum Differences
public class _2574_LeftAndRightSumDifferences {
    public int[] leftRigthDifference(int[] nums) {
        if (nums.length == 1) {
            return new int[]{0};
        }


        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] + nums[i - 1];
            right[nums.length - 1 - i] = right[right.length - i] + nums[nums.length - i];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;
    }

    public void solution() {
        System.out.println(Arrays.toString(leftRigthDifference(new int[]{10, 4, 8, 3})));
        System.out.println(Arrays.toString(leftRigthDifference(new int[]{1})));
    }
}
