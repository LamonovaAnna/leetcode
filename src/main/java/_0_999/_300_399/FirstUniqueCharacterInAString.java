package _0_999._300_399;

import java.util.HashMap;
import java.util.Map;

//387. First Unique Character in a String
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letters.put(s.charAt(i), letters.getOrDefault(s.charAt(i), 0) + 1);
        }

        letters.values().removeIf(v -> v != 1);

        int unique = s.length();
        if (!letters.isEmpty()) {
            for (Character letter : letters.keySet()) {
                if (s.indexOf(letter) < unique) {
                    unique = s.indexOf(letter);
                }
            }
        } else {
            unique = -1;
        }

        return unique;
    }

    public void solution() {
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("leetcode"));
    }
}
