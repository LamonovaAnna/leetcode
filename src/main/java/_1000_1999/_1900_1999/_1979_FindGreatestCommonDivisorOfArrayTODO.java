package _1000_1999._1900_1999;

import java.util.Arrays;

// 1979. Find Greatest Common Divisor of Array
public class _1979_FindGreatestCommonDivisorOfArrayTODO {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] % nums[0] == 0 ? nums[0] : nums[nums.length - 1] / nums[0] + 1;

    }

    public void solution() {
        System.out.println(findGCD(new int[]{2, 5, 6, 9, 10}));
    }
}
