package _2000_2999._2300_2399;

import java.util.ArrayList;
import java.util.List;

// 2348. Number of Zero-Filled Subarrays
public class _2348_NumberOfZeroFilledSubarraysTODO {
    public long zeroFilledSubarray(int[] nums) {
        int ans = 0;
        int counter = 0;
        List<Integer> list = new ArrayList<>(4);
        int temp = 2;
        for (int i = 0; i < nums.length; i++) {
            /*if (nums[i] == 0) {
                ans++;
                counter++;
            } else {
                counter = 0;
            }
            *//*if (i > 0 && nums[i] == 0 && nums[i - 1] == 0) {
                ans++;
            }*//*
            if (counter > 1) {
                ans += counter + 1;
            }*/
            if (nums[i] == 0) {
                counter++;
            }
            if (nums[i] != 0 || i == nums.length - 1) {
                if (counter > 1) {
                    ans += counter + 1;
                } else if (counter == 1) {
                    ans++;
                }
                counter = 0;
            }

        }
        return ans;
    }

    public void solution() {
        System.out.println(zeroFilledSubarray(new int[]{0, 0, 0, 0, 0})); // 15
        System.out.println(zeroFilledSubarray(new int[]{1, 3, 0, 0, 2, 0, 0, 4}));
        System.out.println(zeroFilledSubarray(new int[]{0, 0, 0, 2, 0, 0}));
        System.out.println(zeroFilledSubarray(new int[]{2, 10, 2019}));
    }
}
