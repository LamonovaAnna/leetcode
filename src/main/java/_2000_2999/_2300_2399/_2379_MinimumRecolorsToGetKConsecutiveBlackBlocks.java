package _2000_2999._2300_2399;

// 2379. Minimum Recolors to Get K Consecutive Black Blocks
public class _2379_MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int min = k;

        int start = 0;
        while (start <= blocks.length() - k) {
            int temp = 0;
            for (int i = start; i < start + k; i++) {
                if (blocks.charAt(i) == 'W') {
                    temp++;
                }
            }
            if (temp == 0) {
                min = 0;
                break;
            }
            if (temp < min) {
                min = temp;
            }
            start++;
        }
        return min;
    }

    public void solution() {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }
}
