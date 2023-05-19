package _1000_1999._1600_1699;

import java.util.HashMap;
import java.util.Map;

// 1679. Max Number of K-Sum Pairs
public class _1679_MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                ans++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxOperations(new int[]{13, 1, 3, 4, 3}, 6));
    }
}
