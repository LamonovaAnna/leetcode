package _1000_1999._1100_1199;

import java.util.Arrays;

// 1122. Relative Sort Array
public class _1122_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int[] ans = new int[arr1.length];
        int length = 0;

        for (int j : arr1) {
            nums[j]++;
        }

        for (int j : arr2) {
            int counter = nums[j];
            while (counter > 0) {
                ans[length] = j;
                length++;
                nums[j]--;
                counter = nums[j];
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (length == ans.length) {
                break;
            }
            if (nums[i] > 0) {
                int counter = nums[i];
                while (counter > 0) {
                    ans[length] = i;
                    length++;
                    nums[i]--;
                    counter = nums[i];
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31}, new int[]{2, 42, 38, 0, 43, 21})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6})));
    }
}
