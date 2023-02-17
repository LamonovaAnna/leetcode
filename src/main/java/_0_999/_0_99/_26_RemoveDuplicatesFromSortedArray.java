package _0_999._0_99;

//26. Remove Duplicates from Sorted Array
public class _26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[counter] = nums[i + 1];
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));

    }
}


