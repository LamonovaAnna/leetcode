package _0_999._200_299;

import java.util.Arrays;

// 238. Product of Array Except Self
public class _238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] ans = new int[nums.length];

        int lastRight = 0;
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            int right = 1;

            if (nums[i] == -1 && i > 0) {
                right = lastRight * -1;
                lastRight = right;
            } else if (nums[i] == 1 && i > 0) {
                right = lastRight;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    right *= nums[j];
                    lastRight = right;
                    if (right == 0) {
                        break;
                    }
                }
            }

            if (i > 0) {
                left *= nums[i - 1];
            }
            ans[i] = left * right;
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,1,-1,1}))); // 24,12,8,6
    }
}
