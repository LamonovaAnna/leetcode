package _0_999._700_799;

// 747. Largest Number At Least Twice of Others
public class _747_LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int lessMax = -1;
        int ind = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                lessMax = max;
                max = nums[i];
                ind = i;
            } else if (nums[i] < max && lessMax < nums[i]) {
                lessMax = nums[i];
            }
        }

        if (lessMax * 2 > max) {
            return -1;
        }
        return ind;
    }

    public void solution() {
        System.out.println(dominantIndex(new int[]{6, 4, 1, 0}));
    }
}
