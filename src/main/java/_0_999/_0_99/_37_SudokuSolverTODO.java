package _0_999._0_99;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 37. Sudoku Solver
public class _37_SudokuSolverTODO {
    public void solveSudoku(char[][] board) {
        Map<Integer, int[]> rows = new HashMap<>();
        Map<Integer, int[]> cols = new HashMap<>();
        Map<Integer, int[]> squares = new HashMap<>();
        Map<Integer, Set<Integer>> missingNums;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!rows.containsKey(i)) {
                        rows.put(i, new int[10]);
                    }
                    rows.get(i)[val - '0']++;
                    fillSquare(squares, val - '0', j, i);
                }

                val = board[j][i];
                if (val != '.') {
                    if (!cols.containsKey(i)) {
                        cols.put(i, new int[10]);
                    }
                    cols.get(i)[val - '0']++;
                }
            }
        }

        missingNums = fillMissingNums(squares);

        while (!missingNums.isEmpty()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        int squareKey = findKey(i, j);
                        int temp = 0;


                        //if (missingNums.containsKey(squareKey)) {
                            for (int num : missingNums.get(squareKey)) {
                                if (rows.get(i)[num] == 0 && cols.get(j)[num] == 0) {
                                    if (temp > 0) {
                                        temp = 0;
                                        break;
                                    }
                                    temp = num;
                                }
                            }



                        if (temp > 0) {
                            board[i][j] = Character.forDigit(temp, 10);
                            cols.get(j)[temp]++;
                            rows.get(i)[temp]++;
                            missingNums.get(squareKey).remove(temp);
                            missingNums.entrySet().removeIf(e -> e.getValue().isEmpty());
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(board[i]);
        }
    }

    private void fillSquare(Map<Integer, int[]> squares, int val, int col, int row) {
        if (col < 3 && row < 3) {
            if (!squares.containsKey(1)) {
                squares.put(1, new int[10]);
            }
            squares.get(1)[val]++;
        } else if (col > 2 && col < 6 && row < 3) {
            if (!squares.containsKey(2)) {
                squares.put(2, new int[10]);
            }
            squares.get(2)[val]++;
        } else if (col > 5 && row < 3) {
            if (!squares.containsKey(3)) {
                squares.put(3, new int[10]);
            }
            squares.get(3)[val]++;
        } else if (col < 3 && row < 6) {
            if (!squares.containsKey(4)) {
                squares.put(4, new int[10]);
            }
            squares.get(4)[val]++;
        } else if (col > 2 && col < 6 && row < 6) {
            if (!squares.containsKey(5)) {
                squares.put(5, new int[10]);
            }
            squares.get(5)[val]++;
        } else if (col > 5 && row < 6) {
            if (!squares.containsKey(6)) {
                squares.put(6, new int[10]);
            }
            squares.get(6)[val]++;
        } else if (col < 3) {
            if (!squares.containsKey(7)) {
                squares.put(7, new int[10]);
            }
            squares.get(7)[val]++;
        } else if (col < 6) {
            if (!squares.containsKey(8)) {
                squares.put(8, new int[10]);
            }
            squares.get(8)[val]++;
        } else {
            if (!squares.containsKey(9)) {
                squares.put(9, new int[10]);
            }
            squares.get(9)[val]++;
        }
    }

    private Map<Integer, Set<Integer>> fillMissingNums(Map<Integer, int[]> squares) {
        Map<Integer, Set<Integer>> missingNums = new HashMap<>();
        for (Map.Entry<Integer, int[]> entry : squares.entrySet()) {
            missingNums.put(entry.getKey(), new HashSet<>());
            int[] temp = squares.get(entry.getKey());
            for (int i = 1; i < 10; i++) {
                if (temp[i] == 0) {
                    missingNums.get(entry.getKey()).add(i);
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            if (!missingNums.containsKey(i)) {
                Set<Integer> temp = new HashSet<>();
                for (int j = 1; j < 10; j++) {
                    temp.add(j);
                }
                missingNums.put(i, temp);
            }

        }
        return missingNums;
    }

    private int findKey(int row, int col) {
        if (col < 3 && row < 3) {
            return 1;
        } else if (col > 2 && col < 6 && row < 3) {
            return 2;
        } else if (col > 5 && row < 3) {
            return 3;
        } else if (col < 3 && row < 6) {
            return 4;
        } else if (col > 2 && col < 6 && row < 6) {
            return 5;
        } else if (col > 5 && row < 6) {
            return 6;
        } else if (col < 3) {
            return 7;
        } else if (col < 6) {
            return 8;
        } else {
            return 9;
        }
    }

    public void solution() {
        solveSudoku(new char[][]{
                {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '2', '7', '5', '9', '.', '.'}}
        );
    }
}
