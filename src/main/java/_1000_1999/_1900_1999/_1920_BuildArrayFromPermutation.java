package _1000_1999._1900_1999;

import java.util.Arrays;

// 1920. Build Array from Permutation
public class _1920_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        System.out.println(Arrays.toString(buildArray(new int[]{5, 0, 1, 2, 3, 4})));
    }
}
