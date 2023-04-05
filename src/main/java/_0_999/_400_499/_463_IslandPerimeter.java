package _0_999._400_499;

// 463. Island Perimeter
public class _463_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return 4;
        }
        int i = -1;
        int j = -1;

        for (int k = 0; k < grid.length; k++) {
            for (int l = 0; l < grid[k].length; l++) {
                if (grid[k][l] == 1) {
                    i = k;
                    j = l;
                    break;
                }
            }
            if (i > -1) {
                break;
            }
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return count(grid, visited, i, j);
    }

    private int count(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 1;
        }

        if (visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        int ans = count(grid, visited, i + 1, j);
        ans += count(grid, visited, i - 1, j);
        ans += count(grid, visited, i, j + 1);
        ans += count(grid, visited, i, j - 1);
        return ans;
    }

    public void solution() {
        System.out.println(islandPerimeter(new int[][]{
                {0, 1}
        }));
        System.out.println(islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        }));
    }
}
