package _0_999._700_799;

import java.util.Arrays;

// 733. Flood Fill
public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        int oldColour = image[sr][sc];
        fill(image, sr, sc, oldColour, color);

        return image;
    }

    private void fill(int[][] image, int i, int j, int oldColor, int newColour) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != oldColor) {
            return;
        }

        image[i][j] = newColour;

        fill(image, i + 1, j, oldColor, newColour);
        fill(image, i - 1, j, oldColor, newColour);
        fill(image, i, j + 1, oldColor, newColour);
        fill(image, i, j - 1, oldColor, newColour);
    }

    public void solution() {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{
                {0,0,0},
                {0,0,0},
                }, 1, 0, 2)));
    }
}
