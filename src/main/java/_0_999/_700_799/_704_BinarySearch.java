package _0_999._700_799;

// 704. Binary Search
public class _704_BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = right / 2;

        while (nums[mid] != target) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }

            mid = (right + left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (left > right) {
                return -1;
            }
        }
        return mid;
    }

    public void solution() {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));

    }
}
