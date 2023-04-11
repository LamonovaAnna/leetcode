package _2000_2999._2100_2199;

import java.util.*;

// 2121. Intervals Between Identical Elements
public class _2121_IntervalsBetweenIdenticalElementsTODO {
    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        Map<Integer, List<Integer>> nums = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!nums.containsKey(arr[i])) {
                nums.put(arr[i], new ArrayList<>());
            }
            nums.get(arr[i]).add(i);
        }

        for (List<Integer> temp : nums.values()) {
            if (temp.size() > 1) {
                int counter = temp.size();
                while (counter != 0) {
                    int sum = 0;
                    for (int j = 1; j < temp.size(); j++) {
                        sum += Math.abs(temp.get(0) - temp.get(j));
                    }
                    ans[temp.get(0)] = sum;
                    temp.add(temp.get(0));
                    temp.remove(0);
                    counter--;
                }
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(getDistances(new int[]{2, 1, 3, 1, 2, 3, 3}))); // 4,2,7,2,4,4,5
    }
}
