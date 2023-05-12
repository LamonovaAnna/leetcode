package _0_999._0_99;

import java.util.HashMap;
import java.util.Map;

// 36. Valid Sudoku
public class _36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] uniqueR = new int[10];
        int[] uniqueC = new int[10];
        Map<Integer, int[]> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    uniqueR[val - '0']++;
                    if (!fillSquare(squares, val - '0', i, j)) {
                        return false;
                    }
                }

                val = board[j][i];
                if (val != '.') {
                    uniqueC[val - '0']++;
                }
            }

            for (int j = 1; j < uniqueR.length; j++) {
                if (uniqueR[j] > 1) {
                    return false;
                }
                if (uniqueC[j] > 1) {
                    return false;
                }
                uniqueR[j] = 0;
                uniqueC[j] = 0;
            }
        }

        return true;
    }

    private boolean fillSquare(Map<Integer, int[]> squares, int val, int col, int row) {

        if (col < 3 && row < 3) {
            if (!squares.containsKey(1)) {
                squares.put(1, new int[9]);
            }
            int sum = ++squares.get(1)[val - 1];
            return sum <= 1;
        } else if (col > 2 && col < 6 && row < 3) {
            if (!squares.containsKey(2)) {
                squares.put(2, new int[9]);
            }
            int sum = ++squares.get(2)[val - 1];
            return sum <= 1;
        } else if (col > 5 && row < 3) {
            if (!squares.containsKey(3)) {
                squares.put(3, new int[9]);
            }
            int sum = ++squares.get(3)[val - 1];
            return sum <= 1;
        } else if (col < 3 && row < 6) {
            if (!squares.containsKey(4)) {
                squares.put(4, new int[9]);
            }
            int sum = ++squares.get(4)[val - 1];
            return sum <= 1;
        } else if (col > 2 && col < 6 && row < 6) {
            if (!squares.containsKey(5)) {
                squares.put(5, new int[9]);
            }
            int sum = ++squares.get(5)[val - 1];
            return sum <= 1;
        } else if (col > 5 && row < 6) {
            if (!squares.containsKey(6)) {
                squares.put(6, new int[9]);
            }
            int sum = ++squares.get(6)[val - 1];
            return sum <= 1;
        } else if (col < 3) {
            if (!squares.containsKey(7)) {
                squares.put(7, new int[9]);
            }
            int sum = ++squares.get(7)[val - 1];
            return sum <= 1;
        } else if (col < 6) {
            if (!squares.containsKey(8)) {
                squares.put(8, new int[9]);
            }
            int sum = ++squares.get(8)[val - 1];
            return sum <= 1;
        } else {
            if (!squares.containsKey(9)) {
                squares.put(9, new int[9]);
            }
            int sum = ++squares.get(9)[val - 1];
            return sum <= 1;
        }
    }

    public void solution() {
        System.out.println(isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }
}
