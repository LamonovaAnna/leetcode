package _0_999._0_99;

//35. Search Insert Position
public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && i == nums.length - 1) {
                return nums.length;
            } else if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return 0;
    }

    public void solution() {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
