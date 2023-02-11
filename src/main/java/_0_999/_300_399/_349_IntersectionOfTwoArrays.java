package _0_999._300_399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//349. Intersection of Two Arrays
public class _349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];
        List<Integer> result = new ArrayList<>(Math.min(nums1.length, nums2.length));

        for (int i : nums1) {
            nums[i]++;
        }

        for (int j : nums2) {
            if (nums[j] > 0 && !result.contains(j)) {
                result.add(j);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public void solution() {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
