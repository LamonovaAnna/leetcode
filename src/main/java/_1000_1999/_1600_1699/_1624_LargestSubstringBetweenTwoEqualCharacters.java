package _1000_1999._1600_1699;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1624. Largest Substring Between Two Equal Characters
public class _1624_LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        if (s.length() == 1) {
            return -1;
        }
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return 0;
            } else {
                return -1;
            }
        }

        int ans = -1;
        Map<Character, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!pos.containsKey(s.charAt(i))) {
                pos.put(s.charAt(i), new ArrayList<>());
            }
            pos.get(s.charAt(i)).add(i);
        }

        for (List<Integer> temp : pos.values()) {
            if (temp.size() > 1) {
                int distance = temp.get(temp.size() - 1) - (temp.get(0) + 1);
                if (distance > ans) {
                    ans = distance;
                }
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxLengthBetweenEqualCharacters("ab"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
    }
}
