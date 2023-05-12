package _2000_2999._2100_2199;

import java.util.HashSet;
import java.util.Set;

// 2133. Check if Every Row and Column Contains All Numbers
public class _2133_CheckIfEveryRowAndColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0] == 1;
        }

        Set<Integer> unique = new HashSet<>();

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                unique.add(anInt);
            }
            if (unique.size() != matrix.length) {
                return false;
            }
            unique.clear();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int[] ints : matrix) {
                unique.add(ints[i]);
            }
            if (unique.size() != matrix.length) {
                return false;
            }
            unique.clear();
        }
        return true;
    }

    public void solution() {
        System.out.println(checkValid(new int[][]{{1, 1, 3}, {1, 2, 3}, {1, 2, 3}}));
    }
}
