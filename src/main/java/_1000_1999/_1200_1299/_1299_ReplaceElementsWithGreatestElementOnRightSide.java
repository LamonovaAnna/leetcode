package _1000_1999._1200_1299;

import java.util.Arrays;

// 1299. Replace Elements with Greatest Element on Right Side
public class _1299_ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int index = -1;
        int val = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (index <= i) {
                val = 0;
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] > val) {
                        val = arr[j];
                        index = j;
                    }
                }
            }
            arr[i] = val;
        }

        arr[arr.length - 1] = -1;
        return arr;
    }

    public void solution() {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }
}
