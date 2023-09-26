package _0_999._0_99;

import java.util.ArrayList;
import java.util.List;

// 46. Permutations
public class _46_PermutationsTODO {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            return List.of(List.of(nums[0]));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();

            int row = 0;
            int start = i + 1;
            while (row < nums.length - 1) {
                temp.add(nums[i]);
                int j = start;
                while (temp.size() != nums.length) {
                    if (j >= nums.length) {
                        j = 0;
                    }
                    if (nums[j] != nums[i]) {
                        temp.add(nums[j]);
                    }
                    j++;
                }
                row++;
                ans.add(temp);
                temp = new ArrayList<>();
                start++;
                if (start > nums.length) {
                    start = 1;
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(permute(new int[]{1, 2, 3 , 4}));
    }
}
