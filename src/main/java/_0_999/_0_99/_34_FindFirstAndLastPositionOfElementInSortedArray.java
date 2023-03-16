package _0_999._0_99;

import java.util.Arrays;

// 34. Find First and Last Position of Element in Sorted Array
public class _34_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if (nums.length == 0) {
            return ans;
        } else if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        int num = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[left] == target) {
                num = left;
            } else if (nums[right] == target) {
                num = right;
            } else if (nums[mid] == target) {
                num = mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (num == -1) {
            return ans;
        }


        ans[0] = findLeft(nums, num, target);
        ans[1] = findRight(nums, num, target);
        return ans;
    }

    private int findRight(int[] arr, int index, int target) {
        if (arr[arr.length - 1] == target) {
            return arr.length - 1;
        }
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] != target) {
                index = i - 1;
                break;
            }
        }
        return index;
    }

    private int findLeft(int[] arr, int index, int target) {
        if (arr[0] == target) {
            return 0;
        }
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] != target) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

    public void solution() {
        System.out.println(Arrays.toString(searchRange(new int[]{1, 2, 2}, 2)));
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10, 10}, 10)));
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[0], 0)));


    }
}
