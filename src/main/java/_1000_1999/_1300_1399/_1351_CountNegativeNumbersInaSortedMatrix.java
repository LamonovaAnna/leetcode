package _1000_1999._1300_1399;

//1351. Count Negative Numbers in a Sorted Matrix
public class _1351_CountNegativeNumbersInaSortedMatrix {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            if (ints[0] < 0) {
                ans += ints.length;
            }
            if (ints[0] >= 0 && ints[ints.length - 1] < 0) {
                ans += search(ints);
            }

        }
        return ans;
    }

    private int search(int[] nums) {
        int ans = 0;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < 0 && nums[mid - 1] >= 0) {
                ans = mid;
                break;
            }
            if (nums[mid] >= 0 && nums[mid + 1] < 0) {
                ans = mid + 1;
                break;
            }
            if (nums[left] >= 0 && nums[left + 1] < 0) {
                ans = left + 1;
                break;
            }
            if (nums[right] < 0 && nums[right - 1] >= 0) {
                ans = right;
                break;
            }

            if (nums[mid] >= 0 && nums[mid + 1] >= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums.length - ans;
    }

    public void solution() {
        System.out.println(countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        System.out.println(countNegatives(new int[][]{{3, 2}, {1, 0}}));

    }
}
