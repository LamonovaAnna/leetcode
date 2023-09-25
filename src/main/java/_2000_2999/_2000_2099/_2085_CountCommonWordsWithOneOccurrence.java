package _2000_2999._2000_2099;

import java.util.HashMap;
import java.util.Map;

// 2085. Count Common Words With One Occurrence
public class _2085_CountCommonWordsWithOneOccurrence {
    public int countWords(String[] words1, String[] words2) {
        if (words1.length == 1 && words2.length == 1) {
            if (words1[0].equals(words2[0])) {
                return 1;
            }
            return 0;
        }

        Map<String, Integer> wordsF = new HashMap<>();
        Map<String, Integer> wordsS = new HashMap<>();

        for (String word : words1) {
            wordsF.put(word, wordsF.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            wordsS.put(word, wordsS.getOrDefault(word, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<String, Integer> kv : wordsF.entrySet()) {
            if (kv.getValue() == 1 && wordsS.containsKey(kv.getKey()) && wordsS.get(kv.getKey()) == 1) {
                ans++;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(countWords(new String[] {"leetcode","is","amazing","as","is"},
                new String[] {"b","bb","bbb"}));
    }
}
