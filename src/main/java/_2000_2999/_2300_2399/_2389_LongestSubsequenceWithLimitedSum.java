package _2000_2999._2300_2399;

import java.util.Arrays;

// 2389. Longest Subsequence With Limited Sum
public class _2389_LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (nums[0] == queries[i]) {
                ans[i] = 1;
            } else if (nums[0] > queries[i]) {
                ans[i] = 0;
            } else {
                int temp = 1;
                int sum = nums[0];
                int index = 1;
                while (index < nums.length) {
                    sum += nums[index];
                    if (sum <= queries[i]) {
                        temp++;
                        index++;
                    } else {
                        break;
                    }
                }
                ans[i] = temp;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})));
        System.out.println(Arrays.toString(answerQueries(new int[]{2, 3, 4, 5}, new int[]{1})));
    }
}
