package _2000_2999._2300_2399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 2399. Check Distances Between Same Letters
public class _2399_CheckDistancesBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        if (s.length() == 2) {
            return distance[s.charAt(0) - 'a'] == 0;
        }

        Map<Character, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!pos.containsKey(s.charAt(i))) {
                pos.put(s.charAt(i), new ArrayList<>());
            }
            pos.get(s.charAt(i)).add(i);
        }

        for (Map.Entry<Character, List<Integer>> kv : pos.entrySet()) {
            if (kv.getValue().get(1) - kv.getValue().get(0) - 1 != distance[kv.getKey() - 'a']) {
                return false;
            }
        }

        return true;
    }

    public void solution() {
        System.out.println(checkDistances("aa",
                new int[]{0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})); // true
        System.out.println(checkDistances("abaccb",
                new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})); // true
    }
}
