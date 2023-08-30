package _0_999._500_599;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 532. K-diff Pairs in an Array
public class _532_KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
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
            if (!numbers.containsKey(num)) {
                numbers.put(num, 1);
            } else {
                numbers.put(num, numbers.get(num) + 1);
            }
        }

        int ans = 0;
        Set<String> unq = new HashSet<>();
        Set<Integer> checked = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            boolean removed = false;
            int num = nums[i];
            if (!checked.contains(num)) {
                checked.add(num);

                if (numbers.get(num) == 1) {
                    numbers.remove(num);
                } else {
                    numbers.put(num, numbers.get(num) - 1);
                }
                removed = true;

                int goal1 = num + k;
                int goal2 = num - k;

                if (i == nums.length - 2) {
                    if (!unq.contains(num + "," + goal1) && goal1 == nums[i + 1]) {
                        ans++;
                    }
                    if (goal1 != goal2 && !unq.contains(num + "," + goal2) && goal2 == nums[i + 1]) {
                        ans++;
                    }
                    return ans;
                }

                if (!unq.contains(num + "," + goal1)) {
                    if (numbers.containsKey(goal1)) {
                        ans++;
                        unq.add(num + "," + goal1);
                        unq.add(goal1 + "," + num);
                    }
                }

                if (goal1 != goal2 && !unq.contains(num + "," + goal2)) {
                    if (numbers.containsKey(goal2)) {
                        ans++;
                        unq.add(num + "," + goal2);
                        unq.add(goal2 + "," + num);
                    }
                }
            }

            if (!removed) {
                if (numbers.get(num) == 1) {
                    numbers.remove(num);
                } else {
                    numbers.put(num, numbers.get(num) - 1);
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(findPairs(new int[]{1, 1, 1, 2, 2}, 0)); //2
    }
}
