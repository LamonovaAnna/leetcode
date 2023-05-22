package _0_999._200_299;

import java.util.Arrays;

// 215. Kth Largest Element in an Array
public class _215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];

    }

    public void solution() {
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
