package _0_999._100_199;

// 162. Find Peak Element
public class _162_FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                return i;
            }
            if (nums[i + 1] < nums[i]) {
                i++;
            }

        }
        return -1;
    }
}
