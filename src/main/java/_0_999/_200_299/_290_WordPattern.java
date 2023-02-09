package _0_999._200_299;

import java.util.*;

//290. Word Pattern
public class _290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> patterns = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(!patterns.containsKey(pattern.charAt(i)) && patterns.containsValue(words[i])) {
                return false;
            } else if (patterns.containsKey(pattern.charAt(i)) && !patterns.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
            patterns.put(pattern.charAt(i), words[i]);
        }

        return true;
    }

    public void solution() {
        System.out.println(wordPattern("aba", "cat cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }
}
