package _0_999._0_99;

import java.util.Arrays;

// 88. Merge Sorted Array
public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }


        int startIndex = 0;
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] > nums2[startIndex] || (nums1[i] == 0 && i > 0 && nums1.length - i == nums2.length - startIndex)) {
                int index = i + 1;
                int temp = nums1[i];
                int mem;
                while (index < nums1.length) {
                    mem = nums1[index];
                    nums1[index] = temp;
                    temp = mem;
                    index++;

                }
                nums1[i] = nums2[startIndex];
                startIndex++;
            }

            if (startIndex == n) {
                break;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public void solution() {
        merge(new int[]{0, 0, 3, 0, 0, 0, 0, 0, 0}, 3, new int[]{-1, 1, 1, 1, 2, 3}, 6);
        merge(new int[]{2, 0}, 1, new int[]{1}, 1);
        merge(new int[]{1, 2, 3, 4, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1}, 1, new int[0], 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);


    }
}
