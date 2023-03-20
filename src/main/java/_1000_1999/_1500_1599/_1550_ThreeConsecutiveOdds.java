package _1000_1999._1500_1599;

// 1550. Three Consecutive Odds
public class _1550_ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }
}
