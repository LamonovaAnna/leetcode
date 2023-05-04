package _0_999._600_699;

import java.util.Arrays;

// 645. Set Mismatch
public class _645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        if (nums.length == 2 && nums[0] == nums[1]) {
            if (nums[0] == 1) {
                return new int[]{1, 2};
            } else {
                return new int[]{2, 1};
            }
        }
        Arrays.sort(nums);
        int[] ans = new int[]{-1, -1};

        if (nums[0] != 1) {
            ans[1] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && nums[nums.length - 1] != nums.length) {
                ans[1] = nums.length;
            } else if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            } else if (nums[i] + 1 != nums[i + 1]) {
                ans[1] = nums[i + 1] - 1;
            }


            if (ans[0] != -1 && ans[1] != -1) {
                break;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(findErrorNums(new int[]{2, 3, 2})));
    }
}
