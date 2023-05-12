package _2000_2999._2400_2499;

import java.util.Arrays;

// 2482. Difference Between Ones and Zeros in Row and Column
public class _2482_DifferenceBetweenOnesAndZerosInRowAndColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] zeroRow = new int[grid.length];
        int[] zeroCol = new int[grid[0].length];
        int[] oneRow = new int[grid.length];
        int[] oneCol = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    zeroRow[i]++;
                } else {
                    oneRow[i]++;
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 0) {
                    zeroCol[i]++;
                } else {
                    oneCol[i]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = oneRow[i] + oneCol[j] - zeroRow[i] - zeroCol[j];
            }
        }

        return grid;
    }

    public void solution() {
        System.out.println(Arrays.deepToString(onesMinusZeros(new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}})));
    }
}
