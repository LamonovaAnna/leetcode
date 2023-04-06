package _0_999._900_999;

import java.util.LinkedList;
import java.util.Queue;

// 994. Rotting Oranges
public class _994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            if (grid[0][0] == 1) {
                return -1;
            }
            return 0;
        }

        Queue<int[]> coordinates = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int freshCounter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    coordinates.add(new int[]{i, j});
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) {
                    freshCounter++;
                }
            }
        }

        if (freshCounter == 0) {
            return 0;
        }

        int ans = -1;
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!coordinates.isEmpty()) {
            int size = coordinates.size();
            while (size-- > 0){
                int[] curr = coordinates.poll();
                int currX = curr[0];
                int currY = curr[1];
                for (int[] dir : dirs) {
                    int x = currX + dir[0];
                    int y = currY + dir[1];
                    if (x > -1 && x < grid.length && y > -1 && y < grid[0].length && !visited[x][y]) {
                        if (grid[x][y] == 1) {
                            freshCounter--;
                            grid[x][y] = 2;
                            coordinates.add(new int[]{x, y});
                        }
                        visited[x][y] = true;
                    }
                }
            }
            ans++;
        }
        return freshCounter > 0 ? -1 : ans;
    }


    public void solution() {
        System.out.println(orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 1},
                {0, 1, 2}
        }));
    }
}
