package _2000_2999._2100_2199;

import java.util.Arrays;

// 2120. Execution of All Suffix Instructions Staying in a Grid
public class _2120_ExecutionOfAllSuffixInstructionsStayingInAGrid {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];

        if (n == 1) {
            return ans;
        }

        int row = startPos[0];
        int col = startPos[1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'R' -> col++;
                    case 'D' -> row++;
                    case 'L' -> col--;
                    case 'U' -> row--;
                }
                if (row < 0 || row >= n || col < 0 || col >= n) {
                    row = startPos[0];
                    col = startPos[1];
                    break;
                }
                ans[i]++;
            }
            row = startPos[0];
            col = startPos[1];
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(executeInstructions(2, new int[]{1, 1}, "LURD"))); // 4,1,0,0
    }
}
