package _0_999._0_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 54.Spiral Matrix
public class _54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 1) {
            return Arrays.stream(matrix[0])
                    .boxed()
                    .collect(Collectors.toList());
        }

        List<Integer> ans = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int row = 0;
        int col = 0;
        while (ans.size() != matrix.length * matrix[0].length) {
            if (!visited[row][col]) {
                ans.add(matrix[row][col]);
                visited[row][col] = true;
            }
            if (col + 1 < matrix[0].length && !visited[row][col + 1] && (row - 1 < 0 || visited[row - 1][col])) {
                col++;
            } else if ((col + 1 >= matrix[0].length || visited[row][col + 1]) && row + 1 < matrix.length && !visited[row + 1][col]) {
                row++;
            } else if ((row + 1 >= matrix.length || visited[row + 1][col]) && col - 1 >= 0 && !visited[row][col - 1]) {
                col--;
            } else {
                row--;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}}));
    }
}
