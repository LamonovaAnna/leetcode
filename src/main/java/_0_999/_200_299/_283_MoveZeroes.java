package _0_999._200_299;

//283. Move Zeroes
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int counter = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[counter] = num;
                counter++;
            }
        }

        for (int i = counter; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


    public void solution() {
        moveZeroes(new int[]{0, 0, 1});
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0});
    }
}
