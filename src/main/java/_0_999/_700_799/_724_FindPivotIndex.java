package _0_999._700_799;

// 724. Find Pivot Index
public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        if (nums.length == 2) {
            if (nums[0] == 0) {
                return 1;
            }
            if (nums[1] == 0) {
                return 0;
            }
            return -1;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        if (rightSum == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public void solution() {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
    }
}
