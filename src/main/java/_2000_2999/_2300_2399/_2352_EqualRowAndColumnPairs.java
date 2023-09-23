package _2000_2999._2300_2399;

import java.util.Arrays;

// 2352. Equal Row and Column Pairs
public class _2352_EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        if (grid.length == 1) {
            return 1;
        }

        int[][] col = new int[grid.length][grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                col[i][j] = grid[j][i];
            }
        }

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (Arrays.equals(grid[i], col[j])) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(equalPairs(new int[][]{{3,2,1}, {1,7,6}, {2,7,7}}));
    }
}
