package _0_999._500_599;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 542. 01 Matrix
public class _542_01Matrix {
    public int[][] updateMatrix(int[][] mat) {
        if (mat.length == 1 && mat[0].length == 1) {
            return mat;
        }

        Queue<int[]> coordinates = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    coordinates.add(new int[] {i, j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!coordinates.isEmpty()) {
            for (int i = 0; i < coordinates.size(); i++) {
                int[] temp = coordinates.poll();
                int tempX = temp[0];
                int tempY = temp[1];
                for (int[] dir : directions) {
                    int x = dir[0] + tempX;
                    int y = dir[1] + tempY;
                    if (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length && !visited[x][y]) {
                        mat[x][y] = mat[tempX][tempY] + 1;
                        coordinates.add(new int[] {x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
        return mat;
    }

    public void solution() {
        System.out.println(Arrays.deepToString(updateMatrix(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        })));
    }
}
