package _1000_1999._1000_1099;

import java.util.*;

// 1004. Max Consecutive Ones III
public class _1004_MaxConsecutiveOnesIIITODO {
    public int longestOnes(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 1;
            }
            if (k == 0) {
                return 0;
            }
            return 1;
        }

        if (k >= nums.length) {
            return nums.length;
        }

        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numbers.add(sum);
                if (sum != 0) {
                    sum = 0;
                    numbers.add(sum);
                }
            } else {
                sum++;
            }
        }
        if (sum != 0) {
            numbers.add(sum);
        }

        if (k == 0) {
            Collections.sort(numbers);
            return numbers.get(numbers.size() - 1);
        }

        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int counter = k;
            int j = i + 1;
            int sumM = 0;
            while (counter != 0 && j != numbers.size()) {
                if (numbers.get(j) == 0) {
                    sumM++;
                    counter--;
                } else {
                    sumM += numbers.get(j);
                }
                j++;
            }
            if (j < numbers.size() && numbers.get(j) != 0) {
                sumM += numbers.get(j);
            }
            if (sumM > max) {
                max = sumM;
            }
        }

        return max;
    }

    public void solution() {
        System.out.println(longestOnes(new int[]{1}, 0));
    }
}
