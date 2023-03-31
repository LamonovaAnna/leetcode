package _1000_1999._1300_1399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1389. Create Target Array in the Given Order
public class _1389_CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums.length == 1) {
            return nums;
        }

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
        System.out.println(Arrays.toString(createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0})));
        System.out.println(Arrays.toString(createTargetArray(new int[]{1}, new int[]{0})));
    }
}
