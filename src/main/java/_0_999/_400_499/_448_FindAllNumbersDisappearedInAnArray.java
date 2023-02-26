package _0_999._400_499;

import java.util.ArrayList;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array
public class _448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> n = new ArrayList<>();
        int[] num = new int[nums.length];

        for (int i : nums) {
            num[i - 1]++;
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                n.add(i + 1);
            }
        }

        return n;
    }

    public void solution() {
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 2, 2, 3, 3, 4, 7, 8}));

        System.out.println(findDisappearedNumbers(new int[]{2, 2}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1, 1}));

    }
}
