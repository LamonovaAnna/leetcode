package _0_999._800_899;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//884. Uncommon Words from Two Sentences
public class _884_UncommonWordsFromTwoSentences2 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> unique = new HashMap<>();

        for (String word : s1.split(" ")) {
            unique.put(word, unique.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            unique.put(word, unique.getOrDefault(word, 0) + 1);
        }

        unique.values().removeIf(v -> v != 1);

        String[] result = new String[unique.size()];
        result = unique.keySet().toArray(result);

        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("fd kss fd", "fd fd kss")));
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }
}
