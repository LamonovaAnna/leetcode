package _2000_2999._2500_2599;

import java.util.Arrays;

// 2500. Delete Greatest Value in Each Row
public class _2500_DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }

        int totalSum = 0;
        int biggest = 0;

        for (int[] arr : grid) {
            Arrays.sort(arr);
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int[] ints : grid) {
                if (ints[i] > biggest) {
                    biggest = ints[i];
                }
            }
            totalSum += biggest;
            biggest = 0;
        }
        return totalSum;
    }

    public void solution() {
        System.out.println(deleteGreatestValue(new int[][] {{1,2,4}, {3,3,1}}));
        System.out.println(deleteGreatestValue(new int[][] {{10}}));
    }
}
