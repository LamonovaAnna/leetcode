package _2000_2999._2800_2899;

import java.util.List;

// 2824. Count Pairs Whose Sum is Less than Target
public class _2824_CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
