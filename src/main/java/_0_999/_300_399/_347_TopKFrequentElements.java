package _0_999._300_399;

import java.util.*;

// 347. Top K Frequent Elements
public class _347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }

        int[] ans = new int[k];

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }
        }

        List<Integer> integerList = new ArrayList<>();
        frequency.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach((e1) -> integerList.add(e1.getKey()));

        int ind = 0;

        for (Integer key : integerList) {
            ans[ind] = key;
            ind++;
            if (ind >= ans.length) {
                break;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
