package _0_999._800_899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 821. Shortest Distance to a Character
public class _821_ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int shortestWay = 0;
            if (s.charAt(i) != c) {
                shortestWay = s.length();
                for (Integer index : indexes) {
                    if (Math.abs(i - index) < shortestWay) {
                        shortestWay = Math.abs(i - index);
                    }
                }
            }
            result[i] = shortestWay;
        }
        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
    }
}
