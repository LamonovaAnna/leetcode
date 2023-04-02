package _1000_1999._1400_1499;

import java.util.Arrays;

// 1464. Maximum Product of Two Elements in an Array
public class _1464_MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public void solution() {
        System.out.println(maxProduct(new int[] {3,4,5,2}));
    }
}
