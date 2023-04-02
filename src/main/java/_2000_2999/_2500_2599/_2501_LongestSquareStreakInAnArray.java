package _2000_2999._2500_2599;

import java.util.HashSet;
import java.util.Set;

// 2501. Longest Square Streak in an Array
public class _2501_LongestSquareStreakInAnArray {
    public int longestSquareStreak(int[] nums) {
        Set<Long> numSet = new HashSet<>();
        int ans = 0;
        int longest = 0;

        for (int num : nums) {
            numSet.add((long) num);
        }

        for (int j : nums) {
            long num = j;
            while (numSet.contains(num * num)) {
                num *= num;
                if (longest == 0) {
                    longest = 2;
                } else {
                    longest++;
                }
                if (longest == 5) {
                    return longest;
                }
            }
            if (longest > ans) {
                ans = longest;
            }
            longest = 0;

        }
        return ans > 0 ? ans : -1;
    }

    public void solution() {
        System.out.println(longestSquareStreak(new int[]{2, 3, 5, 6, 7}));

    }
}
