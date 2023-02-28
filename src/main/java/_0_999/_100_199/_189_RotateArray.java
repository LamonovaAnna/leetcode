package _0_999._100_199;

// 189. Rotate Array
public class _189_RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void solution() {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate(new int[]{-1, -100, 3, 99}, 2);
    }
}
