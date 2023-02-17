package _0_999._200_299;

import java.util.Arrays;

//268. Missing Number
public class _268_MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return  i;
            }
        }
        return nums.length;
    }

    public void solution() {
        System.out.println(missingNumber(new int[] {3,0,1}));
        System.out.println(missingNumber(new int[] {0,1}));
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}
