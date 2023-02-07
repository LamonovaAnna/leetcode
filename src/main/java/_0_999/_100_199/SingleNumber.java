package _0_999._100_199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//136. Single Number
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            Integer r = null;
            Arrays.sort(nums);
            Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
            List<Integer> toSingle = new ArrayList<>(List.of(boxedArray));
            while (toSingle.size() > 1 && r == null) {
                if (toSingle.get(0).equals(toSingle.get(1))) {
                    toSingle.remove(0);
                    toSingle.remove(0);
                } else {
                    r = toSingle.get(0);
                }
            }
            if (toSingle.size() == 1) {
                r = toSingle.get(0);
            }
            return r;
        }
    }


    public void solution() {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }
}
