package _0_999._0_99;

import java.util.Arrays;

//1. Two Sum
public class _1_TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        int firstIndex = -1;
        int secondIndex = 1;
        while (firstIndex < nums.length) {
            firstIndex++;
            if (firstIndex > 0) {
                secondIndex = firstIndex++;
                firstIndex--;
                secondIndex++;
            }
            for (int i = firstIndex; i < nums.length; i++) {
                while (secondIndex < nums.length ) {
                    if (nums[firstIndex] + nums[secondIndex] == target) {
                        sum[0] = firstIndex;
                        sum[1] = secondIndex;
                    }
                    secondIndex++;
                }
            }
        }
        return sum;
    }

    public void solution() {
        int[] exp = {1, 2, 3, 4};
        System.out.println(Arrays.toString(twoSum(exp, 6)));
    }

}
