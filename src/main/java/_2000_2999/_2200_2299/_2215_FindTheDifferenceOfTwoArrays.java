package _2000_2999._2200_2299;

import java.util.ArrayList;
import java.util.List;

// 2215. Find the Difference of Two Arrays
public class _2215_FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int[] numbers = new int[2001];
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int i = 0; i < nums1.length; i++) {
            numbers[nums1[i] + 1000]++;
        }

        for (int k : nums2) {
            if (numbers[k + 1000] == 0) {
                ans.get(1).add(k);

            }
            numbers[k + 1000] = -1;

        }

        for (int k : nums1) {
            if (numbers[k + 1000] > 0) {
                ans.get(0).add(k);
                numbers[k + 1000] = -1;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(findDifference(new int[]{-80, -15, -81, -28, -61, 63, 14, -45, -35, -10}, new int[]{-1, -40, -44, 41, 10, -43, 69, 10, 2}));
        System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }

}
