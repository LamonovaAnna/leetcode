package _0_999._700_799;

import java.util.Arrays;

// 733. Flood Fill
public class _733_FloodFillTODO {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int changeColor = image[sr][sc];
        /*while (true) {
            if (sc != 0) {
                image = changeColor(image, sc - 1, 0, sr, 0, color, changeColor);
            }
            if (sc != image[sr].length) {
                image = changeColor(image, sc + 1, image[sr].length, sr, color, changeColor);
            }
            break;
        }*/

        return image;

    }

    private int[][] changeColor(int[][] image, int startPX, int endPX, int startLine, int endLine, int color, int changeColor) {
        //for (int i = startLine; i < ; i++) {
        /*
        }


        for (int i = start; i < end; i++) {
            if (image[start][i] == changeColor) {
                image[start][i] = color;
            } else {
                break;
            }
        }*/
        return image;
    }

    public void solution() {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)));
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0)));
    }
}
