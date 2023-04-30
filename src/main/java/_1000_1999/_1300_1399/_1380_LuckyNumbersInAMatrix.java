package _1000_1999._1300_1399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1380. Lucky Numbers in a Matrix
public class _1380_LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        if (matrix.length == 1) {
            if (matrix[0].length > 1) {
                Arrays.sort(matrix[0]);
            }
            return List.of(matrix[0][0]);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int col = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            int row = i - 1;
            boolean isBigger = true;
            while (row > -1) {
                if (matrix[row][col] > min) {
                    isBigger = false;
                    break;
                }
                row--;
            }
            if (isBigger) {
                row = i + 1;
                while (row < matrix.length) {
                    if (matrix[row][col] > min) {
                        isBigger = false;
                        break;
                    }
                    row++;
                }
            }
            if (isBigger) {
                ans.add(min);
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }


}
