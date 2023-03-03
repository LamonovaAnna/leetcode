package _2000_2999._2500_2599;

// 2529. Maximum Count of Positive Integer and Negative Integer
public class _2529_MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        if (nums.length == 1 ||
                nums[0] > 0 ||
                nums[nums.length - 1] < 0) {
            return nums.length;
        }
        if (nums[0] == 0 && nums[nums.length - 1] == 0) {
            return 0;
        }

        int negativeIndx = -1;
        int positiveIndx = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (positiveIndx == -1) {
                if (nums[mid] > 0 && nums[mid - 1] <= 0) {
                    right = mid - 1;
                    positiveIndx = mid;
                }
                if (nums[mid] <= 0 && nums[mid + 1] > 0) {
                    right = mid - 1;
                    positiveIndx = mid + 1;
                }
                if (nums[mid] > 0 && nums[mid - 1] > 0) {
                    right = mid - 1;

                }
            }

            if (negativeIndx == -1) {
                if (nums[mid] < 0 && nums[mid + 1] >= 0) {
                    negativeIndx = mid;
                    left = mid + 1;
                }
                if (nums[mid] >= 0 && nums[mid - 1] < 0) {
                    negativeIndx = mid - 1;
                    left = mid + 1;
                }
                if (nums[mid] < 0 && nums[mid + 1] < 0) {
                    left = mid + 1;
                }
            }

            if (negativeIndx != -1 && positiveIndx != -1) {
                break;
            }

            if (nums[mid] == 0 && nums[mid + 1] == 0 && nums[mid - 1] == 0) {
                left = mid - 1;
            }

        }
        return Math.max(nums.length - positiveIndx, negativeIndx + 1);
    }

    public void solution() {
        System.out.println(maximumCount(new int[]{-925, -170, -5, 728, 795, 810, 821, 919, 1776, 1861}));
        System.out.println(maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        System.out.println(maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));

        System.out.println(maximumCount(new int[]{5, 20, 66, 1314}));


    }
}
