package _1000_1999._1200_1299;

// 1252. Cells with Odd Values in a Matrix
public class _1252_CellsWithOddValuesInAMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int counter = 0;
        int[][] matrix = new int[m][n];

        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                matrix[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][index[1]]++;
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public void solution() {
        System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
        System.out.println(oddCells(2, 2, new int[][]{{1, 1}, {0, 0}}));

    }


}
