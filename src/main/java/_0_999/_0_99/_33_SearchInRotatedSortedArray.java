package _0_999._0_99;

// 33. Search in Rotated Sorted Array
public class _33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (target < nums[0] && target > nums[nums.length - 1]) {
            return -1;
        } else if (nums[0] == target) {
            return 0;
        } else if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }

        if (target > nums[0]) {
            for (int i = 2; i < nums.length; i += 2) {
                if (nums[i] == target) {
                    return i;
                } else if (nums[i] > target || nums[i] < nums[0]) {
                    if (nums[i - 1] == target) {
                        return i - 1;
                    } else {
                        return -1;
                    }
                }
            }
        }

        for (int i = nums.length - 3; i >= 0; i -= 2) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target || nums[i] > nums[nums.length - 1]) {
                if (nums[i + 1] == target) {
                    return i + 1;
                } else {
                    break;
                }
            }
        }
        return -1;
    }

    public void solution() {
        System.out.println(search(new int[]{14,5,6,7,0,1,2}, 1));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(search(new int[]{1}, 0));

    }
}
