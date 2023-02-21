package _0_999._500_599;

// 540. Single Element in a Sorted Array
public class _540_SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && i != 0 && nums[i] != nums[i - 1]  && nums[i] != nums[i + 1]) {
                return nums[i];
            } else if (i == 0 && nums.length > 1 && nums[i] != nums[i + 1]) {
                return nums[i];
            } else if (i == nums.length - 1 && nums.length > 1 && nums[i] != nums[i - 1]) {
                return nums[i];
            } else if (nums.length == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public void solution() {
        System.out.println(singleNonDuplicate(new int[]{1}));
        System.out.println(singleNonDuplicate(new int[]{0, 1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7,  11, 11, 12}));
    }
}
