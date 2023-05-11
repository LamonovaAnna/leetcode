package _1000_1999._1600_1699;

import java.util.*;
import java.util.stream.Collectors;

// 1636. Sort Array by Increasing Frequency
public class _1636_SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        if (nums.length == 2) {
            if (nums[0] >= nums[1]) {
                return nums;
            } else {
                return new int[]{nums[1], nums[0]};
            }
        }

        Map<Integer, Integer> val = new HashMap<>();
        int[] ans = new int[nums.length];

        for (int num : nums) {
            val.put(num, val.getOrDefault(num, 0) + 1);
        }


        Map<Integer, Integer> sortedMap = val.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey((o1, o2) -> o2 - o1)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int start = 0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans[start] = entry.getKey();
                start++;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }
}
