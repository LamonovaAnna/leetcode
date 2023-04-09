package _1000_1999._1000_1099;

// 1020. Number of Enclaves
public class _1020_NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int ans = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) {
                    if (grid[i][j] == 1) {
                        dfs(grid, visited, i, j);
                    } else {
                        visited[i][j] = true;
                    }
                } else if (grid[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        for (boolean[] booleans : visited) {
            for (int j = 0; j < visited[0].length; j++) {
                if (!booleans[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    int ans = 0;

    private void dfs(int[][] grid, boolean[][] visited, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col]
                || grid[row][col] == 0) {
            return;
        }


        visited[row][col] = true;

        dfs(grid, visited, row + 1, col);
        dfs(grid, visited, row - 1, col);
        dfs(grid, visited, row, col + 1);
        dfs(grid, visited, row, col - 1);
    }

    public void solution() {
        System.out.println(numEnclaves(new int[][]{
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}}));
    }
}
