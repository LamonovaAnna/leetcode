package _0_999._300_399;

import java.util.HashSet;
import java.util.Set;

// 334. Increasing Triplet Subsequence
public class _334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int lastMax = 0;
        int max = nums[nums.length - 1];
        Set<Integer> checked = new HashSet<>();
        for (int i = nums.length - 2; i >= 0; i--) {
            if (!checked.contains(max)) {
                if (nums[i] < max) {
                    lastMax = max;
                    max = nums[i];
                    for (int j = i - 1; j >= 0; j--) {
                        if (nums[j] < max) {
                            return true;
                        }
                        if (nums[j] < lastMax) {
                            max = nums[j];
                        }
                    }
                }
            }

            checked.add(lastMax);
            checked.add(max);
            max = nums[i];
        }
        return false;
    }

    public void solution() {
        //System.out.println(increasingTriplet(new int[] {1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2}));
        System.out.println(increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
    }
}
