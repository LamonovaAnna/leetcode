package _2000_2999._2300_2399;

import java.util.Arrays;

// 2373. Largest Local Values in a Matrix
public class _2373_LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                ans[i][j] = getMaxVal(grid, i, j);
            }
        }
        return ans;
    }

    private int getMaxVal(int[][] grid, int i, int j) {
        int max = 0;
        for (int a = i; a <= i + 2; a++) {
            for (int b = j; b <= j + 2; b++) {
                max = Math.max(grid[a][b], max);
            }
        }
        return max;
    }

    public void solution() {
        System.out.println(Arrays.deepToString(largestLocal(new int[][]{
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        })));
    }
}
