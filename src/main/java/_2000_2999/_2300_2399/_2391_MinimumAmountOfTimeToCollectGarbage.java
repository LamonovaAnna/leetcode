package _2000_2999._2300_2399;

import java.util.Arrays;

// 2391. Minimum Amount of Time to Collect Garbage
public class _2391_MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int p = -1;
        int g = -1;
        int m = -1;

        int sum = 0;
        for (int i = garbage.length - 1; i >= 0; i--) {
            if (garbage[i].contains("G") && g == -1) {
                g = i - 1;
            }
            if (garbage[i].contains("P") && p == -1) {
                p = i - 1;
            }
            if (garbage[i].contains("M") && m == -1) {
                m = i - 1;
            }
            sum += garbage[i].length();
        }

        int dist = 0;
        for (int i = 0; i < travel.length; i++) {
            dist += travel[i];
            if (i == p) {
                sum += dist;
            }
            if (i == g) {
                sum += dist;
            }
            if (i == m) {
                sum += dist;
            }
        }

        return sum;
    }

    public void solution() {
        System.out.println(garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3}));
    }
}
