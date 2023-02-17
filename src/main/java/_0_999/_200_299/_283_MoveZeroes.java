package _0_999._200_299;

//283. Move Zeroes
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }


    public void solution() {
        moveZeroes(new int[]{0, 0, 1});
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0});
    }
}
