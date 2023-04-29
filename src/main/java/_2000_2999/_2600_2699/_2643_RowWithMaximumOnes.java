package _2000_2999._2600_2699;

import java.util.Arrays;

// 2643. Row With Maximum Ones
public class _2643_RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int counter = 0;

        for (int i = 0; i < mat.length; i++) {
            int tempCounter = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    tempCounter++;
                }
            }
            if (tempCounter > counter) {
                index = i;
                counter = tempCounter;
            }
        }
        return new int[] {index, counter};
    }

    public void solution() {
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}})));
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0, 0, 0}, {0, 1, 1}})));
    }
}
