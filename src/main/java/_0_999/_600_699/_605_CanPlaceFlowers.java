package _0_999._600_699;

// 605. Can Place Flowers
public class _605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerCounter = 0;
        int counter = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return n < 2;
        } else if (flowerbed.length < 3 && n > 1) {
            return false;
        } else if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                counter++;
            } else {
                counter = 0;
            }

            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 ||
                    i == flowerbed.length - 1 && flowerbed[flowerbed.length - 1] == 0
                            && flowerbed[flowerbed.length - 2] == 0) {
                flowerCounter++;
                counter = 0;
            }

            if (counter == 3) {
                flowerCounter++;
                counter = 0;
                i--;
            }
            if (flowerCounter == n) {
                return true;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(canPlaceFlowers(new int[]{0, 0}, 2));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }


}
