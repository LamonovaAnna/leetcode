package _0_999._0_99;

//27. Remove Element
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int index = 0;
        int lastIndex = nums.length - 1;

        while (index < lastIndex) {
            if (nums[index] != val) {
                index++;
            } else {
                if (nums[index] != nums[lastIndex]) {
                    nums[index] = nums[lastIndex];
                    nums[lastIndex] = val;
                    index++;
                }
                lastIndex--;
            }
        }

        if (index == 0) {
            return 0;
        } else if (nums[index] == val) {
            return index;
        } else {
            return index + 1;
        }
    }

    public void solution() {


        System.out.println(removeElement(new int[]{3, 3}, 3));
        System.out.println(removeElement(new int[]{4, 5}, 4));
        System.out.println(removeElement(new int[]{1}, 1));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
