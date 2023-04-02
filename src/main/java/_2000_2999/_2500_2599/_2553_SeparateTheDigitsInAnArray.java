package _2000_2999._2500_2599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2553. Separate the Digits in an Array
public class _2553_SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        if (nums.length == 1 && nums[0] < 10) {
            return nums;
        }
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (num < 10) {
                ans.add(num);
            } else {
                String s = String.valueOf(num);
                for (int i = 0; i < s.length(); i++) {
                    ans.add((int) s.charAt(i) - '0');
                }
            }
        }

        int[] numbers = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            numbers[i] = ans.get(i);
        }

        return numbers;
    }

    public void solution() {
        System.out.println(Arrays.toString(separateDigits(new int[]{100, 125, 836, 77})));
        System.out.println(Arrays.toString(separateDigits(new int[]{7, 1, 3, 9})));
    }
}
