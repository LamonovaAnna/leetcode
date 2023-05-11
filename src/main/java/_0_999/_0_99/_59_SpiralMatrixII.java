package _0_999._0_99;

import java.util.Arrays;

// 59. Spiral Matrix II
public class _59_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        if (n == 1) {
            return new int[][]{{1}};
        }

        int[][] ans = new int[n][n];

        int start = 1;
        int upRow = 0;
        int downRow = n;
        int leftCol = -1;
        int rightCol = n;

        while (start < n * n + 1) {
            int[] data = fillRow(new int[]{start, upRow, downRow, leftCol, rightCol}, ans);
            start = data[0];
            upRow = data[1];
            downRow = data[2];
            leftCol = data[3];
            rightCol = data[4];
        }

        return ans;
    }


    private int[] fillRow(int[] pos, int[][] nums) {
        int start = pos[0];
        int upRow = pos[1];
        int downRow = pos[2];
        int leftCol = pos[3];
        int rightCol = pos[4];

        int temp = 0;
        for (int i = leftCol + 1; i < rightCol; i++) {
            nums[upRow][i] = start;
            start++;
            temp = i;
        }
        rightCol = temp;

        for (int i = upRow + 1; i < downRow; i++) {
            nums[i][rightCol] = start;
            start++;
            temp = i;
        }
        downRow = temp;

        for (int i = rightCol - 1; i > leftCol; i--) {
            nums[downRow][i] = start;
            start++;
            temp = i;
        }
        leftCol = temp;

        for (int i = downRow - 1; i > upRow; i--) {
            nums[i][leftCol] = start;
            start++;
            temp = i;
        }
        upRow = temp;
        return new int[]{start, upRow, downRow, leftCol, rightCol};
    }

    public void solution() {
        System.out.println(Arrays.deepToString(generateMatrix(2)));
    }
}
