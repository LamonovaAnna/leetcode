package _0_999._100_199;

import java.util.Arrays;

//169. Majority Element
public class _169_MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.parallelSort(nums);
        int size = nums.length / 2;
        int result = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            counter++;
            if (counter > size) {
                result = nums[i];
                break;
            }
            if (nums[i] != nums[i + 1]) {
                counter = 0;
            }
        }
        return result;
    }

    public void solution() {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
