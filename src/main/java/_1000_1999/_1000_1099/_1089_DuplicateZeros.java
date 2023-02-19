package _1000_1999._1000_1099;

import java.util.Arrays;

//1089. Duplicate Zeros
public class _1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i != arr.length - 1) {
                    int last = arr[i + 1];
                    for (int j = i + 2; j < arr.length; j++) {
                        int next = arr[j];
                        arr[j] = last;
                        last = next;
                    }
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void solution() {
        duplicateZeros(new int[]{0, 0, 0, 0, 0, 0, 0});
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        duplicateZeros(new int[]{1, 2, 3});

    }
}
