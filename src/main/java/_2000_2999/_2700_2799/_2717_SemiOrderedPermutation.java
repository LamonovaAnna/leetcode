package _2000_2999._2700_2799;

// 2717. Semi-Ordered Permutation
public class _2717_SemiOrderedPermutation {
    public int semiOrderedPermutation(int[] nums) {
        if (nums[0] == 1 && nums[nums.length - 1] == nums.length) {
            return 0;
        }

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first = i;
            }
            if (nums[i] == nums.length) {
                last = i;
            }
        }

        return first > last ? first + (nums.length - 1 - last) - 1 : first + (nums.length - 1 - last);
    }
}
