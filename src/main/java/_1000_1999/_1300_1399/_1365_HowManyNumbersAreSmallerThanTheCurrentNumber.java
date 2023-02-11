package _1000_1999._1300_1399;

import java.util.Arrays;

// 1365. How Many Numbers Are Smaller Than the Current Number
public class _1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int counter = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    counter++;
                }
            }
            result[i] = counter;
            counter = 0;
        }
        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));
    }
}
