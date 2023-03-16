package _2000_2999._2000_2099;

import java.util.ArrayList;
import java.util.List;

// 2089. Find Target Indices After Sorting Array
public class _2089_FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();

        int index = 0;
        int counter = 0;
        for (int num : nums) {
            if (num < target) {
                index++;
            } else if (num == target) {
                counter++;
            }
        }
        for (int i = index; counter > 0; i++) {
            ans.add(i);
            counter--;
        }
        return ans;
    }

    public void solution() {
        System.out.println(targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
        System.out.println(targetIndices(new int[]{1, 2, 5, 2, 3}, 3));
        System.out.println(targetIndices(new int[]{1, 2, 5, 2, 3}, 5));
    }
}
