package _2000_2999._2000_2099;

import java.util.HashMap;
import java.util.Map;

// 2006. Count Number of Pairs With Absolute Difference K
public class _2006_CountNumberOfPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            if (nums[0] - nums[1] == k || nums[1] - nums[0] == k) {
                return 1;
            }
            return 0;
        }

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> pairs : numbers.entrySet()) {
            if (numbers.containsKey(pairs.getKey() + k)) {
                ans += pairs.getValue() * numbers.get(pairs.getKey() + k);
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(countKDifference(new int[]{1, 2, 2, 1}, 1));
    }
}
