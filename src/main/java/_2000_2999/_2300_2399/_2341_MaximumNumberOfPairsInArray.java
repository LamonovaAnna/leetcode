package _2000_2999._2300_2399;

import java.util.Arrays;

// 2341. Maximum Number of Pairs in Array
public class _2341_MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        if (nums.length == 1) {
            return new int[]{0, 1};
        }

        Arrays.sort(nums);
        int pairs = 0;
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                single++;
                break;
            }
            if (nums[i] == nums[i + 1]) {
                pairs++;
                i++;
            } else {
                single++;
            }
        }

        return new int[]{pairs, single};
    }

    public void solution() {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2}))); // 1 1 2 2 2 3 3
    }
}
