package _1000_1999._1600_1699;

import java.util.Arrays;

// 1619. Mean of Array After Removing Some Elements
public class _1619_MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int index = arr.length / 20;

        double sum = 0;
        int counter = 0;
        for (int i = index; i < arr.length - index; i++) {
            sum += arr[i];
            counter++;
        }
        return sum / counter;
    }

    public void solution() {
        System.out.println(trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
        System.out.println(trimMean(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}));
        System.out.println(trimMean(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}));
    }
}
