package _0_999._0_99;

import java.util.Arrays;

// 66. Plus One
public class _66_PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        int[] result = new int[digits.length + 1];
        int end = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                end = i;
                result = new int[digits.length];
                break;
            }
        }

        if (end == -1) {
            result[0] = 1;
            return result;
        }

        for (int i = 0; i <= end; i++) {
            if (i == end) {
                result[i] = digits[i] + 1;
            }
            result[i] = digits[i];
        }
        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(plusOne(new int[]{2, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{5, 9, 9})));
    }
}
