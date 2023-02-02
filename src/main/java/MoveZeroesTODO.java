import java.util.Arrays;

//283. Move Zeroes
public class MoveZeroesTODO {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (j != nums.length - 1) {
                        nums[j] = nums[j + 1];
                    }
                }
                nums[nums.length - 1] = 0;
            }
        }


        System.out.println(Arrays.toString(nums));
    }


    public void solution() {
        moveZeroes(new int[]{0, 0, 1});
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0});
    }
}
