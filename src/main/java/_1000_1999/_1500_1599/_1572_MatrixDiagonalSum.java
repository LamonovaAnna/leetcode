package _1000_1999._1500_1599;

// 1572. Matrix Diagonal Sum
public class _1572_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }

        int sum = 0;
        int row = 0;
        int colF = 0;
        int colL = mat[0].length - 1;

        while (row < mat.length) {
            if (colL == colF) {
                sum += mat[row][colF];
            } else {
                sum += mat[row][colF];
                sum += mat[row][colL];
            }

            row++;
            colF++;
            colL--;
        }
        return sum;
    }

    public void solution() {
        System.out.println(diagonalSum(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));
    }
}
