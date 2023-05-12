package _2000_2999._2600_2699;

import java.util.HashMap;
import java.util.Map;

// 2661. First Completely Painted Row or Column
public class _2661_FirstCompletelyPaintedRowOrColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        if (mat.length == 1) {
            return 0;
        }

        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        Map<Integer, int[]> coordinates = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                coordinates.put(mat[i][j], new int[]{i, j});
            }
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = row[coordinates.get(arr[i])[0]]++;
            int colSum = col[coordinates.get(arr[i])[1]]++;
            if (rowSum + 1 == mat[0].length) {
                ans = i;
                break;
            }
            if (colSum + 1 == mat.length) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(firstCompleteIndex(new int[]{1, 4, 5, 2, 6, 3}, new int[][]{{4, 3, 5}, {1, 2, 6}}));
    }
}
