package _1000_1999._1400_1499;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class _1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for (int j : candies) {
            if (j > max) {
                max = j;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

}
