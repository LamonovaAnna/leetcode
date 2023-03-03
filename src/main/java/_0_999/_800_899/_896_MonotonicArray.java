package _0_999._800_899;

// 896. Monotonic Array
public class _896_MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums[0] == nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    return false;
                }
            }
        }

        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }

        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
    }
}
