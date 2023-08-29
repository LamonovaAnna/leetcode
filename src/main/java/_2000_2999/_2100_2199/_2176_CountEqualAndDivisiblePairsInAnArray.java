package _2000_2999._2100_2199;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 2176. Count Equal and Divisible Pairs in an Array
public class _2176_CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                return 1;
            }
            return 0;
        }

        Map<Integer, List<Integer>> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])) {
                numbers.put(nums[i], new ArrayList<>());
            }
            numbers.get(nums[i]).add(i);
        }

        int ans = 0;
        for (List<Integer> pos : numbers.values()) {
            if (pos.size() > 1) {
                for (int i = 0; i < pos.size(); i++) {
                    for (int j = i + 1; j < pos.size(); j++) {
                        if (pos.get(i) * pos.get(j) % k == 0) {
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(countPairs(new int[] {3,1,2,2,2,1,3}, 2)); //4
    }
}
