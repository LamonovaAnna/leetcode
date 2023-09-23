package _1000_1999._1700_1799;

import java.util.*;

// 1769. Minimum Number of Operations to Move All Balls to Each Box
public class _1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        if (boxes.length() == 1) {
            return new int[]{0};
        }

        char[] nums = boxes.toCharArray();

        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '1') {
                ones.add(i);
            }
        }

        if (ones.isEmpty()) {
            return new int[boxes.length()];
        }

        int[] ans = new int[boxes.length()];
        for (int i = 0; i < nums.length; i++) {
            int steps = 0;
            for (Integer num : ones) {
                if (i != num) {
                    steps += Math.abs(i - num);
                }
            }
            ans[i] = steps;
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(minOperations("110")));
    }
}
