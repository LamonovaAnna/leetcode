package _0_999._100_199;

import java.util.Arrays;

// 167. Two Sum II - Input Array Is Sorted
public class _167_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }


    public void solution() {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 24, 50, 79, 88, 150, 345}, 200)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 24, 50, 79, 88, 150, 345}, 200)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));

    }
}
