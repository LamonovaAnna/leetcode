package _2000_2999._2200_2299;

import java.util.HashMap;
import java.util.Map;

// 2271. Maximum White Tiles Covered by a Carpet
public class _2271_MaximumWhiteTilesCoveredByACarpet {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Map<Integer, Integer> coordinates = new HashMap<>();
        int[] carpets = new int[tiles.length];
        int ans = 0;

        for (int i = 0; i < tiles.length; i++) {
            int carpet = tiles[i][1] - tiles[i][0] + 1;
            int place = i;
            if (coordinates.containsKey(tiles[i][0] - 1)) {
                place = coordinates.get(tiles[i][0] - 1);
            } else if (coordinates.containsKey(tiles[i][1] + 1)) {
                place = coordinates.get(tiles[i][1] + 1);
            }

            carpets[place] += carpet;
            coordinates.put(tiles[i][0], place);
            coordinates.put(tiles[i][1], place);

            int temp = carpets[place];
            if (temp > ans) {
                ans = temp;
            }
            if (ans >= carpetLen) {
                return carpetLen;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maximumWhiteTiles(new int[][]{{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}}, 9));
    }

}
