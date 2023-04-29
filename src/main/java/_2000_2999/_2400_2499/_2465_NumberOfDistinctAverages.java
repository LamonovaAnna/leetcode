package _2000_2999._2400_2499;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 2465. Number of Distinct Averages
public class _2465_NumberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        if (nums.length == 2) {
            return 1;
        }
        Arrays.sort(nums);

        Set<Double> unique = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            unique.add((nums[i] + nums[nums.length - 1 - i]) / 2.0);
        }
        return unique.size();
    }

    public void solution() {
        System.out.println(distinctAverages(new int[]{9, 5, 7, 8, 7, 9, 8, 2, 0, 7}));
    }
}
