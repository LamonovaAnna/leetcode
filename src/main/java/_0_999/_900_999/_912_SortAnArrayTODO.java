package _0_999._900_999;

import java.util.Arrays;

// 912. Sort an Array
public class _912_SortAnArrayTODO {
    public int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < nums.length; i++) {
                int temp;
                if (nums[i - 1] > nums[i]) {
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    isSorted = false;
                }
            }
        }
        return nums;
    }

    public void solution() {
        System.out.println(Arrays.toString(sortArray(new int[]{-1, 2, -8, -10})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 2, 3, 1})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 1, 1, 2, 0, 0})));

    }
}
