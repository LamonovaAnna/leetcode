package _0_999._800_899;

import java.util.Arrays;

//832. Flipping an Image
public class _832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int counter = 0;

            if (image[i].length > 1) {
                for (int j = 0; j < image[i].length; j++) {
                    int left = image[i][j];
                    int right = image[i][image[i].length - 1 - j];

                    image[i][j] = right;
                    image[i][image[i].length - 1 - j] = left;
                    counter += 2;

                    if (counter == image[i].length || counter == image[i].length - 1) {
                        invert(image[i]);
                        break;
                    }
                }
            } else {
                invert(image[i]);
            }
        }
        return image;
    }

    private void invert(int[] imageForInvert) {
        for (int i = 0; i < imageForInvert.length; i++) {
            if (imageForInvert[i] == 1) {
                imageForInvert[i] = 0;
            } else {
                imageForInvert[i] = 1;
            }
        }
    }

    public void solution() {
        System.out.println((Arrays.deepToString(flipAndInvertImage(new int[][]{{1}}))));
        System.out.println((Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}))));
        System.out.println((Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1},
                {1, 0, 1, 0}}))));
    }
}
